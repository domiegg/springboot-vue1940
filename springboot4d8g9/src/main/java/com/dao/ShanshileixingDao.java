package com.dao;

import com.entity.ShanshileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShanshileixingVO;
import com.entity.view.ShanshileixingView;


/**
 * 膳食类型
 * 
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShanshileixingDao extends BaseMapper<ShanshileixingEntity> {
	
	List<ShanshileixingVO> selectListVO(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
	
	ShanshileixingVO selectVO(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
	
	List<ShanshileixingView> selectListView(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);

	List<ShanshileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
	
	ShanshileixingView selectView(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
	

}
