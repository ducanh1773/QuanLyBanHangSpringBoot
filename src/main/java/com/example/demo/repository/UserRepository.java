package com.example.demo.repository;
import com.example.demo.modal.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;
@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    public User findByUserName(String userName);


}