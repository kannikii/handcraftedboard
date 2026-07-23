package org.leekh.handcraftedboard.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "user")
public class user {
    @Id
    private Long Id;

    private socialProvider socialProvider;
    private BigInteger socialLoginId;
    private String email;
    private String nickname;

    private LocalDateTime createdAt;

    public Long getId() {
        return Id;
    }

    public void setId(Long userId) {
        this.Id = userId;
    }

    public socialProvider getSocialProvider() {
        return socialProvider;
    }

    public void setSocialProvider(socialProvider socialProvider) {
        this.socialProvider = socialProvider;
    }

    public BigInteger getSocialLoginId() {
        return socialLoginId;
    }

    public void setSocialLoginId(BigInteger socialLoginId) {
        this.socialLoginId = socialLoginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
