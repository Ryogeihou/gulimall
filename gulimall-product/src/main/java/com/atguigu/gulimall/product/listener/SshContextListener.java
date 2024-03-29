package com.atguigu.gulimall.product.listener;


import com.atguigu.common.config.SshConnectionTool;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author xcj
 * @date 2021/7/14 10:36
 */
@Component
public class SshContextListener implements ServletContextListener {
    private SshConnectionTool conexionssh;
    public SshContextListener() {
        super();
    }
    /**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("Context initialized ... !");
        try {
            conexionssh = new SshConnectionTool();
        } catch (Throwable e) {
            e.printStackTrace(); // 连接失败
        }
    }

    /**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("Context destroyed ... !");
        conexionssh.closeSSH(); // 断开连接
    }
}
