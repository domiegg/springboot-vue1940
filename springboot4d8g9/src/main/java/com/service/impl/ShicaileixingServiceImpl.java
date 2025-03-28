package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShicaileixingDao;
import com.entity.ShicaileixingEntity;
import com.service.ShicaileixingService;
import com.entity.vo.ShicaileixingVO;
import com.entity.view.ShicaileixingView;

@Service("shicaileixingService")
public class ShicaileixingServiceImpl extends ServiceImpl<ShicaileixingDao, ShicaileixingEntity> implements ShicaileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShicaileixingEntity> page = this.selectPage(
                new Query<ShicaileixingEntity>(params).getPage(),
                new EntityWrapper<ShicaileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShicaileixingEntity> wrapper) {
		  Page<ShicaileixingView> page =new Query<ShicaileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShicaileixingVO> selectListVO(Wrapper<ShicaileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShicaileixingVO selectVO(Wrapper<ShicaileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShicaileixingView> selectListView(Wrapper<ShicaileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShicaileixingView selectView(Wrapper<ShicaileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
