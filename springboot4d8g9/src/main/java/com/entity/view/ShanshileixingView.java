package com.entity.view;

import com.entity.ShanshileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 膳食类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
@TableName("shanshileixing")
public class ShanshileixingView  extends ShanshileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShanshileixingView(){
	}
 
 	public ShanshileixingView(ShanshileixingEntity shanshileixingEntity){
 	try {
			BeanUtils.copyProperties(this, shanshileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
