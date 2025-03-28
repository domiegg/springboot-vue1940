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


import com.dao.ShanshileixingDao;
import com.entity.ShanshileixingEntity;
import com.service.ShanshileixingService;
import com.entity.vo.ShanshileixingVO;
import com.entity.view.ShanshileixingView;

@Service("shanshileixingService")
public class ShanshileixingServiceImpl extends ServiceImpl<ShanshileixingDao, ShanshileixingEntity> implements ShanshileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShanshileixingEntity> page = this.selectPage(
                new Query<ShanshileixingEntity>(params).getPage(),
                new EntityWrapper<ShanshileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShanshileixingEntity> wrapper) {
		  Page<ShanshileixingView> page =new Query<ShanshileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShanshileixingVO> selectListVO(Wrapper<ShanshileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShanshileixingVO selectVO(Wrapper<ShanshileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShanshileixingView> selectListView(Wrapper<ShanshileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShanshileixingView selectView(Wrapper<ShanshileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
