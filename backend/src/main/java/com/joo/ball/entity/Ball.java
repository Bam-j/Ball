package com.joo.ball.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "balls_table")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Ball {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ball_id", nullable = false, unique = true)
    private String ballId;
}
