package com.entity.view;

import com.entity.ShanshishicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 膳食食材
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
@TableName("shanshishicai")
public class ShanshishicaiView  extends ShanshishicaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShanshishicaiView(){
	}
 
 	public ShanshishicaiView(ShanshishicaiEntity shanshishicaiEntity){
 	try {
			BeanUtils.copyProperties(this, shanshishicaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
