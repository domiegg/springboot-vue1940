package com.entity.vo;

import com.entity.ShanshishicaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 膳食食材
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public class ShanshishicaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食材类型
	 */
	
	private String shicaileixing;
		
	/**
	 * 食材简介
	 */
	
	private String shicaijianjie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 食材用途
	 */
	
	private String shicaiyongtu;
		
	/**
	 * 食材详情
	 */
	
	private String shicaixiangqing;
		
	/**
	 * 规格
	 */
	
	private String guige;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：食材类型
	 */
	 
	public void setShicaileixing(String shicaileixing) {
		this.shicaileixing = shicaileixing;
	}
	
	/**
	 * 获取：食材类型
	 */
	public String getShicaileixing() {
		return shicaileixing;
	}
				
	
	/**
	 * 设置：食材简介
	 */
	 
	public void setShicaijianjie(String shicaijianjie) {
		this.shicaijianjie = shicaijianjie;
	}
	
	/**
	 * 获取：食材简介
	 */
	public String getShicaijianjie() {
		return shicaijianjie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：食材用途
	 */
	 
	public void setShicaiyongtu(String shicaiyongtu) {
		this.shicaiyongtu = shicaiyongtu;
	}
	
	/**
	 * 获取：食材用途
	 */
	public String getShicaiyongtu() {
		return shicaiyongtu;
	}
				
	
	/**
	 * 设置：食材详情
	 */
	 
	public void setShicaixiangqing(String shicaixiangqing) {
		this.shicaixiangqing = shicaixiangqing;
	}
	
	/**
	 * 获取：食材详情
	 */
	public String getShicaixiangqing() {
		return shicaixiangqing;
	}
				
	
	/**
	 * 设置：规格
	 */
	 
	public void setGuige(String guige) {
		this.guige = guige;
	}
	
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
