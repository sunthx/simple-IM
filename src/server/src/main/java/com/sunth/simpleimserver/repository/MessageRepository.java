package com.sunth.simpleimserver.repository;

import com.sunth.simpleimserver.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,String> {

}
