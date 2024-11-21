package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author skokurin
 * @since 09.11.2024
 */
public interface TodoRepository extends JpaRepository<Todo, UUID> {
}
