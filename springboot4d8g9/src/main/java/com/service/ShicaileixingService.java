package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShicaileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShicaileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicaileixingView;


/**
 * 食材类型
 *
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShicaileixingService extends IService<ShicaileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShicaileixingVO> selectListVO(Wrapper<ShicaileixingEntity> wrapper);
   	
   	ShicaileixingVO selectVO(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
   	
   	List<ShicaileixingView> selectListView(Wrapper<ShicaileixingEntity> wrapper);
   	
   	ShicaileixingView selectView(@Param("ew") Wrapper<ShicaileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShicaileixingEntity> wrapper);
   	

}

