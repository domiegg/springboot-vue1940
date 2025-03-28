package com.entity.view;

import com.entity.ShicaileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食材类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
@TableName("shicaileixing")
public class ShicaileixingView  extends ShicaileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShicaileixingView(){
	}
 
 	public ShicaileixingView(ShicaileixingEntity shicaileixingEntity){
 	try {
			BeanUtils.copyProperties(this, shicaileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
