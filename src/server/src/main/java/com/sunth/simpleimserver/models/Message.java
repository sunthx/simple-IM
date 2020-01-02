package com.sunth.simpleimserver.models;

import lombok.Builder;

@Builder
public class Message extends BaseObject{
   private String content;
}
