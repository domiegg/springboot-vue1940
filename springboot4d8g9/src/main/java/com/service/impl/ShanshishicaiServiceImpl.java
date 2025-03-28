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


import com.dao.ShanshishicaiDao;
import com.entity.ShanshishicaiEntity;
import com.service.ShanshishicaiService;
import com.entity.vo.ShanshishicaiVO;
import com.entity.view.ShanshishicaiView;

@Service("shanshishicaiService")
public class ShanshishicaiServiceImpl extends ServiceImpl<ShanshishicaiDao, ShanshishicaiEntity> implements ShanshishicaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShanshishicaiEntity> page = this.selectPage(
                new Query<ShanshishicaiEntity>(params).getPage(),
                new EntityWrapper<ShanshishicaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShanshishicaiEntity> wrapper) {
		  Page<ShanshishicaiView> page =new Query<ShanshishicaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShanshishicaiVO> selectListVO(Wrapper<ShanshishicaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShanshishicaiVO selectVO(Wrapper<ShanshishicaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShanshishicaiView> selectListView(Wrapper<ShanshishicaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShanshishicaiView selectView(Wrapper<ShanshishicaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
