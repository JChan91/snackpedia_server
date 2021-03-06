package com.team.snackpedia.repository;

import com.team.snackpedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserEmailAndUserPassword(String userEmail, String userPassword);
    public User findByUserName(String userName);

}