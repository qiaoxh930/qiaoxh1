package com.a.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Jssues
 * @Author qiaoxh
 * @Date 2020/9/12 16:50
 * @Description TOOO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jssues {
    private Integer id;
    private String jssues;
    private Integer likes;
    private Integer commentNumber;
    private List<Comment> commentList;
}
