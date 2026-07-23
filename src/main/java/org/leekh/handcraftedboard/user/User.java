package org.leekh.handcraftedboard.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private Long Id;

    @Enumerated(EnumType.STRING)
    @Column(name = "socialProvider", nullable = false)
    private SocialProvider socialProvider;
    @Column(name = "socialLoginId", nullable = false, length = 100)
    private String socialLoginId;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "nickname", nullable = false, length = 10)
    private String nickname;
    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;
}
