package com.example.LoginApp3.service;

import com.example.LoginApp3.entity.Comment;

import com.example.LoginApp3.entity.Income;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    void saveComment(Comment comment);
    List<Comment> getAllIncomes();
}
