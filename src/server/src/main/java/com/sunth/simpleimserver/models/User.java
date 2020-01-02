package com.sunth.simpleimserver.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class User extends BaseObject{
    private String name;
    private String avatar;
}
