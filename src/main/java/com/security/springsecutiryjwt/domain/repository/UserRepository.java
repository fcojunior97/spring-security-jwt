package com.security.springsecutiryjwt.domain.repository;

import com.security.springsecutiryjwt.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);

}
