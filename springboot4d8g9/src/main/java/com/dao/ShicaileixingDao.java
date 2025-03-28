package com.dao;

import com.entity.ShicaileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShicaileixingVO;
import com.entity.view.ShicaileixingView;


/**
 * 食材类型
 * 
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShicaileixingDao extends BaseMapper<ShicaileixingEntity> {
	
	List<ShicaileixingVO> selectListVO(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
	
	ShicaileixingVO selectVO(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
	
	List<ShicaileixingView> selectListView(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);

	List<ShicaileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
	
	ShicaileixingView selectView(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
	

}
