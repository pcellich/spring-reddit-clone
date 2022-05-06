package com.example.springredditclone1.repository;

import com.example.springredditclone1.model.Comment;
import com.example.springredditclone1.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
