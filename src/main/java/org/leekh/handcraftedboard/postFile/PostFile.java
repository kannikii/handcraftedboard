package org.leekh.handcraftedboard.postFile;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.leekh.handcraftedboard.post.Post;

import java.time.LocalDateTime;

@Entity
@Table(name = "post_file")
@Getter
@Setter
public class PostFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fileId")
    private Long fileId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @Column(name = "originName", nullable = false)
    private String originName;

    @Column(name = "storedName", nullable = false)
    private String storedName;

    @Column(name = "fileUrl", nullable = false)
    private String fileUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "fileType", nullable = false)
    private FileType fileType;

    @Column(name = "fileSize", nullable = false)
    private Long fileSize;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

}
