package com.example.springredditclone1.repository;

import com.example.springredditclone1.model.Post;
import com.example.springredditclone1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
