package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ryo
 * @email ryogeihou@gmail.com
 * @date 2021-09-09 19:43:33
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
