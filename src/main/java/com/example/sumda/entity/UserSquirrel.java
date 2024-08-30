package com.example.sumda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "user_squirrel")
public class UserSquirrel {

    @Id
    @Column(name = "id")
    private long id; // 다람쥐 id

    @Column(name = "user_id")
    private long userId; // 유저 id

    @ManyToOne
    @JoinColumn(name = "squ_type_id", referencedColumnName = "id")
    private SquirrelType squTypeId; // 다람쥐 종류 id

    @Column(name = "level")
    private int level; // 다람쥐 레벨

    @Column(name = "feed")
    private int feed; // 도토리 급여 개수

    @Column(name = "start_date")
    private LocalDateTime startDate; // 다람쥐 배정 날짜

    @Column(name = "end_date")
    private LocalDateTime endDate; // 다람쥐 독립 날짜

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
