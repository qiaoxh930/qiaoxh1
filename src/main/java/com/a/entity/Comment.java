package com.a.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Comment
 * @Author qiaoxh
 * @Date 2020/9/12 16:54
 * @Description TOOO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer id;
    private String comment;
    private Integer likes;
    private Integer commentId;
    private Integer jssuesId;
}
