package com.mauromelo1.autorrelacionamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauromelo1.autorrelacionamento.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}