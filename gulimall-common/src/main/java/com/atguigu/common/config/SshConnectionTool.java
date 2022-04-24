package com.atguigu.common.config;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

import java.util.Properties;

/**
 * @author xcj
 * @date 2021/7/14 10:26
 */
public class SshConnectionTool {
    //本地的ssh中的knownhost文件路径
    private final static String S_PATH_FILE_KNOWN_HOSTS = "/Users/ryo/.ssh/known_hosts";
    //本地的ssh密钥路径
    private final static String S_PATH_FILE_PRIVATE_KEY = "/Users/ryo/.ssh/hero.pem";

    //ssh连接的用户名
    private final static String SSH_USER = "centos";
    //ssh远程连接的ip地址
    private final static String SSH_REMOTE_SERVER = "13.230.140.173";
    //ssh连接的端口号
    private final static int SSH_REMOTE_PORT = 22;
    //本地mysql发起连接的IP地址
    private final static String MYSQL_REMOTE_SERVER = "127.0.0.1";
    //本地数据库连接时用的端口号
    private final static int LOCAl_PORT = 3307;
    //远程数据库端口用的端口号
    private final static int REMOTE_PORT = 3306;

    private Session sesion; //ssh 会话

    public void closeSSH ()
    {
        sesion.disconnect();
    }

    public SshConnectionTool () throws Throwable {

        JSch jsch = null;

        jsch = new JSch();
        //设置known_hosts文件路径，如：~/.ssh/known_hosts（known_hosts中存储是已认证的远程主机host key）
        jsch.setKnownHosts(S_PATH_FILE_KNOWN_HOSTS);
        //设置私钥
        jsch.addIdentity(S_PATH_FILE_PRIVATE_KEY);

        sesion = jsch.getSession(SSH_USER, SSH_REMOTE_SERVER, SSH_REMOTE_PORT);

        //设置连接过程不校验known_hosts文件中的信息
        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        sesion.setConfig(config);

        sesion.connect(); //ssh 建立连接！

        //根据安全策略，您必须通过转发端口进行连接
        sesion.setPortForwardingL(LOCAl_PORT, MYSQL_REMOTE_SERVER, REMOTE_PORT);

    }


}
