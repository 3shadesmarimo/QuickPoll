package com.example.demo.Repository;

import com.example.demo.Domain.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends JpaRepository<Poll, Long> {
}
