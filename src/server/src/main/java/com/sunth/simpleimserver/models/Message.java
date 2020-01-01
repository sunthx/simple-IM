package com.sunth.simpleimserver.models;

import lombok.Builder;

@Builder
public class Message extends BaseObject{
   private String content;
   private User sender;
   private Group group;
}
