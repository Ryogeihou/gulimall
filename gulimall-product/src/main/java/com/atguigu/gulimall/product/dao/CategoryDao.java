package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ryo
 * @email ryogeihou@gmail.com
 * @date 2021-09-08 22:44:05
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
