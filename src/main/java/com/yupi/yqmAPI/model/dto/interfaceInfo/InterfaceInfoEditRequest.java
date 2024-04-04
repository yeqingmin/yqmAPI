package com.yupi.yqmAPI.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
@Data
public class InterfaceInfoEditRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestheader;

    /**
     * 响应头
     */
    private String responseheader;

    /**
     * 接口状态（0-关闭，1-开启）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String type;

    /**
     * 创建人
     */
    private Long userid;


    /**
     * 是否删除(0-未删, 1-已删)
     * 加上@TableLogic的注解表示逻辑删除
     */
    @TableLogic
    private Integer isdelete;


    private static final long serialVersionUID = 1L;
}
