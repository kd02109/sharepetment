package com.saecdo18.petmily.feed.dto;

import com.saecdo18.petmily.image.dto.ImageDto;
import com.saecdo18.petmily.member.dto.MemberDto;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

public class FeedDto {

    @Data
    @Builder
    public static class Post {
        @NotBlank
        @ApiModelProperty(value = "사용자 아이디", example = "1", required = true)
        private Long memberId;
        @NotBlank
        @ApiModelProperty(value = "피드 내용", example = "피드 내용", required = true)
        private String content;
        @ApiModelProperty(value = "피드 이미지 파일", required = false)
        private List<MultipartFile> images;

    }

    @Data
    @Builder
    public static class Patch{
        @ApiModelProperty(value = "피드 아이디", example = "1", required = true)
        private Long feedId;
        @ApiModelProperty(value = "사용자 아이디", example = "1", required = true)
        private Long memberId;
        @ApiModelProperty(value = "피드 수정 내용", example = "수정 내용", required = true)
        private String content;
        @ApiModelProperty(value = "추가 이미지 파일", required = false)
        private List<MultipartFile> addImages;
        @ApiModelProperty(value = "삭제 이미지 원본 파일 이름 리스트", required = false)
        private List<String> deleteImages;
    }

    @Data
//    @Builder
    public static class Response {
        @ApiModelProperty(value = "피드 아이디", example = "1", required = true)
        private Long feedId;

        @ApiModelProperty(value = "사용자 정보", required = true)
        private MemberDto.Info memberInfo;

        @ApiModelProperty(value = "이미지 url 리스트", required = true)
        private List<ImageDto> images;

        @ApiModelProperty(value = "피드 내용", example = "1", required = true)
        private String content;

        @ApiModelProperty(value = "피드 좋아요 갯수", example = "111", required = true)
        private int likes;

        @ApiModelProperty(value = "사용자가 피드 좋아요 여부", example = "1", required = true)
        private boolean isLike;

        @ApiModelProperty(value = "댓글 리스트", required = true)
        private List<FeedCommentDto.Response> feedComments;

        @ApiModelProperty(value = "공유 URL", example = "http://43.202.86.53:8080/feeds/all/{피드아이디}/0", required = true)
        private String shareURL;

        private LocalDateTime createdAt;

        private LocalDateTime modifiedAt;
    }

    @Data
    @Builder
    public static class Like {
        @ApiModelProperty(value = "좋아요 수", example = "113", required = true)
        private int likeCount;
        @ApiModelProperty(value = "사용자가 좋아요 여부", example = "true", required = true)
        private boolean isLike;
    }

    @Data
    public static class PreviousListIds {
        @ApiModelProperty(value = "이전에 받은 피드 아이디 리스트", required = true)
        private List<Long> previousListIds;
    }




}
