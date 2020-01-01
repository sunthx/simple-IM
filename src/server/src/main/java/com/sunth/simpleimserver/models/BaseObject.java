package com.sunth.simpleimserver.models;

import lombok.Builder;

import java.util.Date;

@Builder
public class BaseObject {
    private String id;
    private Date createTime;
    private Date updateTime;
}

