package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShanshishicaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShanshishicaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShanshishicaiView;


/**
 * 膳食食材
 *
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface ShanshishicaiService extends IService<ShanshishicaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShanshishicaiVO> selectListVO(Wrapper<ShanshishicaiEntity> wrapper);
   	
   	ShanshishicaiVO selectVO(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
   	
   	List<ShanshishicaiView> selectListView(Wrapper<ShanshishicaiEntity> wrapper);
   	
   	ShanshishicaiView selectView(@Param("ew") Wrapper<ShanshishicaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShanshishicaiEntity> wrapper);
   	

}

