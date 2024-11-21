package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

/**
 * @author skokurin
 * @since 09.11.2024
 */
@Entity
@Table(name = "tbl_todo")
public class Todo {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "content", nullable = false)
    private String content;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
