package com.dao;

import com.entity.ShanshishicaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShanshishicaiVO;
import com.entity.view.ShanshishicaiView;


/**
 * 膳食食材
 * 
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShanshishicaiDao extends BaseMapper<ShanshishicaiEntity> {
	
	List<ShanshishicaiVO> selectListVO(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
	
	ShanshishicaiVO selectVO(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
	
	List<ShanshishicaiView> selectListView(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);

	List<ShanshishicaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
	
	ShanshishicaiView selectView(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
	

}
