package com.memoria.flashcards.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Flashcard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Builder.Default
    @Column(nullable = false)
    private String imageUrl = "";

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @Builder.Default
    private int reviewCnt=0;

    @CreationTimestamp
    private Timestamp createDate;
}
