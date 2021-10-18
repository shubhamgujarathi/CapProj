package com.ums1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ums1.entity.User1;

@Repository
public interface User1Repository extends JpaRepository<User1, Integer>{

}
