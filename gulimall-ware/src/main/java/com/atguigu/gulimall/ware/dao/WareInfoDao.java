package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author ryo
 * @email ryogeihou@gmail.com
 * @date 2021-09-09 19:43:33
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
