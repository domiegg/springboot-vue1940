package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShicaileixingEntity;
import com.entity.view.ShicaileixingView;

import com.service.ShicaileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 食材类型
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
@RestController
@RequestMapping("/shicaileixing")
public class ShicaileixingController {
    @Autowired
    private ShicaileixingService shicaileixingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShicaileixingEntity shicaileixing,
		HttpServletRequest request){
        EntityWrapper<ShicaileixingEntity> ew = new EntityWrapper<ShicaileixingEntity>();

		PageUtils page = shicaileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shicaileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShicaileixingEntity shicaileixing, 
		HttpServletRequest request){
        EntityWrapper<ShicaileixingEntity> ew = new EntityWrapper<ShicaileixingEntity>();

		PageUtils page = shicaileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shicaileixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShicaileixingEntity shicaileixing){
       	EntityWrapper<ShicaileixingEntity> ew = new EntityWrapper<ShicaileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shicaileixing, "shicaileixing")); 
        return R.ok().put("data", shicaileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShicaileixingEntity shicaileixing){
        EntityWrapper< ShicaileixingEntity> ew = new EntityWrapper< ShicaileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shicaileixing, "shicaileixing")); 
		ShicaileixingView shicaileixingView =  shicaileixingService.selectView(ew);
		return R.ok("查询食材类型成功").put("data", shicaileixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShicaileixingEntity shicaileixing = shicaileixingService.selectById(id);
        return R.ok().put("data", shicaileixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShicaileixingEntity shicaileixing = shicaileixingService.selectById(id);
        return R.ok().put("data", shicaileixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShicaileixingEntity shicaileixing, HttpServletRequest request){
    	shicaileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shicaileixing);
        shicaileixingService.insert(shicaileixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShicaileixingEntity shicaileixing, HttpServletRequest request){
    	shicaileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shicaileixing);
        shicaileixingService.insert(shicaileixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShicaileixingEntity shicaileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shicaileixing);
        shicaileixingService.updateById(shicaileixing);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shicaileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShicaileixingEntity> wrapper = new EntityWrapper<ShicaileixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shicaileixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
