package com.joo.ball.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallRepository extends JpaRepository<Ball, Long> {


}
