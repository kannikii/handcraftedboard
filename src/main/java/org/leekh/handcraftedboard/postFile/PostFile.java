package org.leekh.handcraftedboard.postFile;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.leekh.handcraftedboard.post.Post;

import java.time.LocalDateTime;

@Entity
@Table(name = "postFile")
@Getter
@Setter
public class PostFile {
    @Id
    private Long id;

    @Column(name = "fileId", unique = true, nullable = false)
    private Long fileId;

    @Column(name = "postId", unique = true, nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Column(name = "originName", nullable = false)
    private String originName;

    @Column(name = "storedName", nullable = false)
    private String storedName;

    @Column(name = "fileUrl", nullable = false)
    private String fileUrl;

    @Column(name = "fileType", nullable = false)
    private FileType fileType;

    @Column(name = "fileSize", nullable = false)
    private Long fileSize;

    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

}
