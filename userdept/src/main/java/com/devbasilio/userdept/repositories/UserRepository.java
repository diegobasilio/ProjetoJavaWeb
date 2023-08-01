package com.devbasilio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbasilio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
