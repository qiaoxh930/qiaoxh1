package com.a.controller;

import com.a.entity.Jssues;
import com.a.service.JssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName JssuesController
 * @Author qiaoxh
 * @Date 2020/9/13 15:49
 * @Description TOOO
 */
@Controller
@RequestMapping("jssues")
public class JssuesController {
    @Autowired
    private JssuesService jssuesServiceImpl;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpSession session;
    @RequestMapping("queryOne")
    public String queryOne(){
        request.setAttribute("jssues" ,jssuesServiceImpl.queryOne());
        return "forward:/main.jsp";
    }
    @RequestMapping("updateLike")
    public String updateLike(Integer id){
        jssuesServiceImpl.updateLike(id);
        return "redirect:/jssues/queryOne";
    }
    @RequestMapping("queryId")
    public String queryId(Integer id){
        session.setAttribute("id",id);
        request.setAttribute("jssues",jssuesServiceImpl.queryId(id));
        return "forward:/commen.jsp";
    }
    @RequestMapping("queryJssues")
    public String queryJssues(String jssues){
        request.setAttribute("list",jssuesServiceImpl.queryJssues(jssues));
        return "forward:/jssues.jsp";
    }
}
