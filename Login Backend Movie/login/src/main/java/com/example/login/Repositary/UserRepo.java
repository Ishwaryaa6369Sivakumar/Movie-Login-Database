package com.example.login.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User,String>{
    
}