package com.example.LoginApp3.service;

import com.example.LoginApp3.entity.Comment;
import com.example.LoginApp3.entity.Income;
import com.example.LoginApp3.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService{

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }



    @Override
    public void saveComment(Comment comment) {
        this.commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAllIncomes() {
        return this.commentRepository.findAll();
    }

}
