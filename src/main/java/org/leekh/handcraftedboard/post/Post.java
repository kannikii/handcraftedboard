package org.leekh.handcraftedboard.post;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "postId", unique = true, nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "userId", unique = true, nullable = false)
    private BigInteger userId;

}
