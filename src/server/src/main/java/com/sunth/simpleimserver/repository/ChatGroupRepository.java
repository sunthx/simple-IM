package com.sunth.simpleimserver.repository;

import com.sunth.simpleimserver.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatGroupRepository extends JpaRepository<Group,String> {

}
