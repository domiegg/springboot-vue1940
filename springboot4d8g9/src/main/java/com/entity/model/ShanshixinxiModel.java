package com.entity.model;

import com.entity.ShanshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 膳食信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public class ShanshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 膳食封面
	 */
	
	private String shanshifengmian;
		
	/**
	 * 膳食类型
	 */
	
	private String shanshileixing;
		
	/**
	 * 营养成分
	 */
	
	private String yingyangchengfen;
		
	/**
	 * 糖含量/克
	 */
	
	private Float tanghanliang;
		
	/**
	 * 脂肪含量/克
	 */
	
	private Float zhifanghanliang;
		
	/**
	 * 热量/焦耳
	 */
	
	private Float reliang;
		
	/**
	 * 蛋白质/克
	 */
	
	private Float danbaizhi;
		
	/**
	 * 制作流程
	 */
	
	private String zhizuoliucheng;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：膳食封面
	 */
	 
	public void setShanshifengmian(String shanshifengmian) {
		this.shanshifengmian = shanshifengmian;
	}
	
	/**
	 * 获取：膳食封面
	 */
	public String getShanshifengmian() {
		return shanshifengmian;
	}
				
	
	/**
	 * 设置：膳食类型
	 */
	 
	public void setShanshileixing(String shanshileixing) {
		this.shanshileixing = shanshileixing;
	}
	
	/**
	 * 获取：膳食类型
	 */
	public String getShanshileixing() {
		return shanshileixing;
	}
				
	
	/**
	 * 设置：营养成分
	 */
	 
	public void setYingyangchengfen(String yingyangchengfen) {
		this.yingyangchengfen = yingyangchengfen;
	}
	
	/**
	 * 获取：营养成分
	 */
	public String getYingyangchengfen() {
		return yingyangchengfen;
	}
				
	
	/**
	 * 设置：糖含量/克
	 */
	 
	public void setTanghanliang(Float tanghanliang) {
		this.tanghanliang = tanghanliang;
	}
	
	/**
	 * 获取：糖含量/克
	 */
	public Float getTanghanliang() {
		return tanghanliang;
	}
				
	
	/**
	 * 设置：脂肪含量/克
	 */
	 
	public void setZhifanghanliang(Float zhifanghanliang) {
		this.zhifanghanliang = zhifanghanliang;
	}
	
	/**
	 * 获取：脂肪含量/克
	 */
	public Float getZhifanghanliang() {
		return zhifanghanliang;
	}
				
	
	/**
	 * 设置：热量/焦耳
	 */
	 
	public void setReliang(Float reliang) {
		this.reliang = reliang;
	}
	
	/**
	 * 获取：热量/焦耳
	 */
	public Float getReliang() {
		return reliang;
	}
				
	
	/**
	 * 设置：蛋白质/克
	 */
	 
	public void setDanbaizhi(Float danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：蛋白质/克
	 */
	public Float getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：制作流程
	 */
	 
	public void setZhizuoliucheng(String zhizuoliucheng) {
		this.zhizuoliucheng = zhizuoliucheng;
	}
	
	/**
	 * 获取：制作流程
	 */
	public String getZhizuoliucheng() {
		return zhizuoliucheng;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
