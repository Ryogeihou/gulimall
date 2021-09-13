package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ryo
 * @email ryogeihou@gmail.com
 * @date 2021-09-13 21:33:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
