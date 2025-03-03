package com.seuUsuario.crud_auth.repository;

import com.seuUsuario.crud_auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    public Optional<User> findByUsername(String username);




}
