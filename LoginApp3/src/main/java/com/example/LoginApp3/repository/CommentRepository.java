package com.example.LoginApp3.repository;

import com.example.LoginApp3.entity.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}
