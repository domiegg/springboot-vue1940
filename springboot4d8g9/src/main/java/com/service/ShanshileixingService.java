package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShanshileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShanshileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShanshileixingView;


/**
 * 膳食类型
 *
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShanshileixingService extends IService<ShanshileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShanshileixingVO> selectListVO(Wrapper<ShanshileixingEntity> wrapper);
   	
   	ShanshileixingVO selectVO(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
   	
   	List<ShanshileixingView> selectListView(Wrapper<ShanshileixingEntity> wrapper);
   	
   	ShanshileixingView selectView(@Param("ew") Wrapper<ShanshileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShanshileixingEntity> wrapper);
   	

}

