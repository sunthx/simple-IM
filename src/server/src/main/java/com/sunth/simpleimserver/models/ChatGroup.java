package com.sunth.simpleimserver.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "t_chat_group")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ChatGroup extends BaseObject{
    private String groupName;

//    @JoinColumn
//    @JoinTable
//    private User owner;
}
