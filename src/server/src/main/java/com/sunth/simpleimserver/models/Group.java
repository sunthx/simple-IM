package com.sunth.simpleimserver.models;

import lombok.Builder;

@Builder
public class Group extends BaseObject{
    private String groupName;
    private User owner;
}
