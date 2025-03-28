package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshanshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshanshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshanshixinxiView;


/**
 * 膳食信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-27 09:34:25
 */
public interface DiscussshanshixinxiService extends IService<DiscussshanshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshanshixinxiVO> selectListVO(Wrapper<DiscussshanshixinxiEntity> wrapper);
   	
   	DiscussshanshixinxiVO selectVO(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
   	
   	List<DiscussshanshixinxiView> selectListView(Wrapper<DiscussshanshixinxiEntity> wrapper);
   	
   	DiscussshanshixinxiView selectView(@Param("ew") Wrapper<DiscussshanshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshanshixinxiEntity> wrapper);
   	

}

