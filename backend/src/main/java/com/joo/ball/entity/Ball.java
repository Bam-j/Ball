package com.joo.ball.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;


@Entity
@Table(name = "balls_table")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Ball {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ball_id", nullable = false, unique = true)
    private String ballId;

    @Builder
    public Ball(String ball_id) {
        this.ball_id = ball_id;
    }
}
