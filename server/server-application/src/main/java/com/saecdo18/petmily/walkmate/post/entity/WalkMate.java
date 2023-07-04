package com.saecdo18.petmily.walkmate.post.entity;

import com.saecdo18.petmily.member.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class WalkMate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long walkMatePostId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String mapURL;

    @Column
    private String chatURL;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String time;

    @Column
    private Boolean open=true;

    @Column(nullable = false)
    private Integer maximum;

    @Column
    private Integer likes;

    @Builder
    public WalkMate(String title, String content, String mapURL, String chatURL, String location, String time, Boolean open, Integer maximum) {
        this.title = title;
        this.content = content;
        this.mapURL = mapURL;
        this.chatURL = chatURL;
        this.location = location;
        this.time = time;
        this.open = open;
        this.maximum = maximum;
    }


}
