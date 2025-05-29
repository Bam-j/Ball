package com.joo.ball.entity;

import com.joo.ball.util.enums.BuildingType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "buildings_table")
@Check(constraints = "building_count >= 0 AND building_level >= 0")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id", nullable = false, unique = true)
    private Long buildingId;

    @Enumerated(EnumType.STRING)
    @Column(name = "building_type", nullable = false)
    private BuildingType buildingType;

    @Column(name = "building_count", nullable = false)
    private Long buildingCount;

    @Column(name = "building_level", nullable = false)
    private Long buildingLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @PrePersist
    public void prePersist() {
        this.buildingCount = 0L;
        this.buildingLevel = 0L;
    }

    @Builder
    public Building(BuildingType buildingType, User user) {
        this.buildingType = buildingType;
        this.user = user;
    }
}
