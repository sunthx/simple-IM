package com.sunth.simpleimserver.repository;

import com.sunth.simpleimserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
