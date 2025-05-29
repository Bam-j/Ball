package com.joo.ball.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users_table")
@Check(constraints = "total_clicks >= 0 AND current_clicks >= 0")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false, unique = true)
    private Long userId;

    @Column(name ="username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "total_clicks", nullable = false)
    private BigDecimal totalClicks;

    @Column(name = "current_clicks", nullable = false)
    private BigDecimal currentClicks;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ball_id", nullable = false, unique = true)
    private BallEntity ballEntity;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Building> buildings = new ArrayList<>();

    @PrePersist
    public void prePersist() {
        this.totalClicks = BigDecimal.ZERO;
        this.currentClicks = BigDecimal.ZERO;
    }

    @Builder
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
