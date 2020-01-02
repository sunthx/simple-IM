package com.sunth.simpleimserver.repository;

import com.sunth.simpleimserver.models.ChatGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatGroupRepository extends JpaRepository<ChatGroup,String> {

}
