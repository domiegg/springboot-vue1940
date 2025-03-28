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


import com.dao.DiscussshanshixinxiDao;
import com.entity.DiscussshanshixinxiEntity;
import com.service.DiscussshanshixinxiService;
import com.entity.vo.DiscussshanshixinxiVO;
import com.entity.view.DiscussshanshixinxiView;

@Service("discussshanshixinxiService")
public class DiscussshanshixinxiServiceImpl extends ServiceImpl<DiscussshanshixinxiDao, DiscussshanshixinxiEntity> implements DiscussshanshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshanshixinxiEntity> page = this.selectPage(
                new Query<DiscussshanshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshanshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshanshixinxiEntity> wrapper) {
		  Page<DiscussshanshixinxiView> page =new Query<DiscussshanshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshanshixinxiVO> selectListVO(Wrapper<DiscussshanshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshanshixinxiVO selectVO(Wrapper<DiscussshanshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshanshixinxiView> selectListView(Wrapper<DiscussshanshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshanshixinxiView selectView(Wrapper<DiscussshanshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
