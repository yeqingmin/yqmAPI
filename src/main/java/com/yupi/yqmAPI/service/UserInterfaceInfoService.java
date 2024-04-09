package com.yupi.yqmAPI.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yqmAPI.model.entity.UserInterfaceInfo;

/**
* @author lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-04-08 12:23:41
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo>{
   void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);
   boolean invokeCount(long interfaceId,long userId);
}
