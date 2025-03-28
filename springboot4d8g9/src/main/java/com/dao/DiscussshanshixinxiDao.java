package com.dao;

import com.entity.DiscussshanshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshanshixinxiVO;
import com.entity.view.DiscussshanshixinxiView;


/**
 * 膳食信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface DiscussshanshixinxiDao extends BaseMapper<DiscussshanshixinxiEntity> {
	
	List<DiscussshanshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
	
	DiscussshanshixinxiVO selectVO(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
	
	List<DiscussshanshixinxiView> selectListView(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);

	List<DiscussshanshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
	
	DiscussshanshixinxiView selectView(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
	

}
