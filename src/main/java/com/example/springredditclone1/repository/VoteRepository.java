package com.example.springredditclone1.repository;

import com.example.springredditclone1.model.Post;
import com.example.springredditclone1.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
