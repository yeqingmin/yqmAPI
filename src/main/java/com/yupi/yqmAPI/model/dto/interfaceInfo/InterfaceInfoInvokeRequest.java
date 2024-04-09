package com.yupi.yqmAPI.model.dto.interfaceInfo;

import lombok.Data;

/**
 * 后端调用模拟接口的方法（前端接受的参数）
 */
@Data
public class InterfaceInfoInvokeRequest {
    /**
     * 接口id
     */
    private Long id;
    /**
     * 请求参数（前端请求）
     */
    private String userRequestParams;


}
