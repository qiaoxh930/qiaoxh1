package com.a.controller;

import com.a.entity.Comment;
import com.a.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName CommentController
 * @Author qiaoxh
 * @Date 2020/9/13 16:57
 * @Description TOOO
 */
@Controller
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentServiceImpl;
    @Autowired
    private HttpSession session;
    @RequestMapping("updateLikes")
    public String updateLikes(Integer id){
        commentServiceImpl.updateLikes(id);
        return "redirect:/jssues/queryOne";
    }
    @RequestMapping("insertComment")
    public String insertComment(String comment){
        Integer id= (Integer) session.getAttribute("id");
        Comment comment1 = new Comment(null,comment,0,null, id);
        System.out.println(comment1);
        commentServiceImpl.insertComment(comment1);
        return "redirect:/jssues/queryId?id="+id;
    }
}
