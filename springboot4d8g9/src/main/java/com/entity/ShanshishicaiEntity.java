package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 膳食食材
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
@TableName("shanshishicai")
public class ShanshishicaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShanshishicaiEntity() {
		
	}
	
	public ShanshishicaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 食材名称
	 */
					
	private String shicaimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：食材名称
	 */
	public void setShicaimingcheng(String shicaimingcheng) {
		this.shicaimingcheng = shicaimingcheng;
	}
	/**
	 * 获取：食材名称
	 */
	public String getShicaimingcheng() {
		return shicaimingcheng;
	}
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
