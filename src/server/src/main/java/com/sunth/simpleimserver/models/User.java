package com.sunth.simpleimserver.models;

import lombok.Builder;

@Builder
public class User extends BaseObject{
    private String userName;
    private String name;
    private String avatar;
}
