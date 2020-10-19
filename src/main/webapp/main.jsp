<%@ page pageEncoding="UTF-8" import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8"/>
    <!--在手机网站，都需要加上视口约束！！！-->
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no"/>
    <!--以最新的内核渲染页面-->
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>主页</title>
    <!--引入css文件-->
    <link rel="stylesheet" type="text/css" href="http://localhost:8989/xiaozhi/static/css/bootstrap.css"/>
    <style type="text/css">


    </style>
</head>
<body>
<div class="container">
    <!--顶部导航-->
    <div class="navbar navbar-default " id="navbar-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <a href="" class="navbar-brand"><span class="glyphicon glyphicon-th-large"></span></a>
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#menu-1">
                    <span class="caret"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse" id="menu-1">

                <ul class="nav navbar-nav">
                    <li><a href="">关于小知</a></li>
                    <li><a href="">首页</a></li>
                    <li><a href="">等你来答</a></li>
                </ul>
                <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/jssues/queryJssues">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search" name="jssues">
                    </div>
                    <button type="submit" class="   btn btn-default">搜索</button>
                </form>
                <button type="button" class="navbar-btn btn btn-primary">提问</button>
                <div class="navbar-btn navbar-right" style="background-color: transparent">
                    欢迎 小知&nbsp;<img src="${pageContext.request.contextPath}/img/pkq07.jpg" class="img-circle" alt="" width="30px" height="30px"></a></li>
                </div>

            </div>
        </div>
    </div>
    <!--左侧-->
    <div class="col-md-10">
        <!--推荐-->
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>推荐</h3>
            </div>
            <!--问题浏览-->
            <div class="panel-body">
                <div class="panel">
                    <div class="panel-heading text-danger">
                        <div class="page-header">
                            <h3><a href="${pageContext.request.contextPath}/jssues/queryId?id=${jssues.id}">${jssues.jssues}</a><small>精选评论</small></h3>
                        </div>
                    </div>
                    <!--评论回答-->
                    <div class="panel-body">
                        <c:forEach items="${jssues.commentList}" var="c">
                        <div class="panel">
                            <div class="panel-body">
                                <p>
                                    <img src="${pageContext.request.contextPath}/img/pkq07.jpg" alt="" class="img-circle" width="25px" height="25px">&nbsp;&nbsp;有问必答
                                </p>
                                <p>${c.comment}</p>
                            </div>
                            <div class="panel-footer" style="background-color: white;">
                                <a href="<%=request.getContextPath()%>/comment/updateLikes?id=${c.id}" style="color:gray;"><span class="glyphicon glyphicon-thumbs-up" ></span>${c.likes}赞</a>
                                &nbsp;&nbsp;
                                <a href="" style="color:gray;"  ><span class="glyphicon glyphicon-comment"></span>&nbsp;查看回复</a>
                            </div>
                        </div>
                         </c:forEach>

                    </div>
                    <div class="panel-footer">
                        <a href="${pageContext.request.contextPath}/jssues/updateLike?id=${jssues.id}"><span class="glyphicon glyphicon-thumbs-up"></span>${jssues.likes}赞</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-comment"></span>&nbsp;${jssues.commentNumber}条评论</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-star"></span>&nbsp;收藏</a>
                    </div>
                </div>
            </div>
        </div>
        <!--关注-->
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>关注</h3>
            </div>
            <!--问题浏览-->
            <div class="panel-body">
                <div class="panel">
                    <div class="panel-heading text-danger">
                        <div class="page-header">
                            <h3><a href="">如何让他（她）爱上你？</a><small>精选评论</small></h3>
                        </div>
                    </div>
                    <!--评论回答-->
                    <div class="panel-body">
                        <div class="panel">
                            <div class="panel-body">
                                <p>
                                    <img src="http://localhost:8989/xiaozhi/img/pkq07.jpg" alt="" class="img-circle" width="25px" height="25px">&nbsp;&nbsp;有问必答
                                </p>
                                <p>多读书，多看报，少吃饭多睡觉！</p>
                            </div>
                            <div class="panel-footer" style="background-color: white;">
                                <a href="" style="color:gray;"><span class="glyphicon glyphicon-thumbs-up" ></span>191赞</a>
                                &nbsp;&nbsp;
                                <a href="" style="color:gray;"  ><span class="glyphicon glyphicon-comment"></span>&nbsp;查看回复</a>
                            </div>
                        </div>
                        <div class="panel">
                            <div class="panel-body">
                                <p>
                                    <img src="http://localhost:8989/xiaozhi/img/pkq02.jpg" alt="" class="img-circle" width="25px" height="25px">&nbsp;&nbsp;有问有答
                                </p>
                                <p>回想的过程就是从大脑中提取知识的过程，可以帮助我们记忆更久远、更牢固。当你发现有个知识回想不起来的时候，说明你该去复习它了！~</p>
                            </div>
                            <div class="panel-footer" style="background-color: white;">
                                <a href="" style="color:gray;"><span class="glyphicon glyphicon-thumbs-up" ></span>228赞</a>
                                &nbsp;&nbsp;
                                <a href="" style="color:gray;"  ><span class="glyphicon glyphicon-comment"></span>&nbsp;查看回复</a>
                            </div>
                        </div>

                    </div>
                    <div class="panel-footer">
                        <a href=""><span class="glyphicon glyphicon-thumbs-up"></span>2048赞</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-comment"></span>&nbsp;3227条评论</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-star"></span>&nbsp;收藏</a>
                    </div>
                </div>
            </div>
        </div>
        <!--热榜-->
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>热榜</h3>
            </div>
            <!--问题浏览-->
            <div class="panel-body">
                <div class="panel">
                    <div class="panel-heading text-danger">
                        <div class="page-header">
                            <h3><a href="">如何长时间高效学习？</a><small>精选评论</small></h3>
                        </div>
                    </div>
                    <!--评论回答-->
                    <div class="panel-body">
                        <div class="panel">
                            <div class="panel-body">
                                <p>
                                    <img src="http://localhost:8989/xiaozhi/img/pkq07.jpg" alt="" class="img-circle" width="25px" height="25px">&nbsp;&nbsp;有问必答
                                </p>
                                <p>多读书，多看报，少吃饭多睡觉！</p>
                            </div>
                            <div class="panel-footer" style="background-color: white;">
                                <a href="" style="color:gray;"><span class="glyphicon glyphicon-thumbs-up" ></span>191赞</a>
                                &nbsp;&nbsp;
                                <a href="" style="color:gray;"  ><span class="glyphicon glyphicon-comment"></span>&nbsp;查看回复</a>
                            </div>
                        </div>
                        <div class="panel">
                            <div class="panel-body">
                                <p>
                                    <img src="http://localhost:8989/xiaozhi/img/pkq02.jpg" alt="" class="img-circle" width="25px" height="25px">&nbsp;&nbsp;有问有答
                                </p>
                                <p>回想的过程就是从大脑中提取知识的过程，可以帮助我们记忆更久远、更牢固。当你发现有个知识回想不起来的时候，说明你该去复习它了！~</p>
                            </div>
                            <div class="panel-footer" style="background-color: white;">
                                <a href="" style="color:gray;"><span class="glyphicon glyphicon-thumbs-up" ></span>228赞</a>
                                &nbsp;&nbsp;
                                <a href="" style="color:gray;"  ><span class="glyphicon glyphicon-comment"></span>&nbsp;查看回复</a>
                            </div>
                        </div>

                    </div>
                    <div class="panel-footer">
                        <a href=""><span class="glyphicon glyphicon-thumbs-up"></span>2048赞</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-comment"></span>&nbsp;3227条评论</a>
                        &nbsp;&nbsp;
                        <a href=""><span class="glyphicon glyphicon-star"></span>&nbsp;收藏</a>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <!--右侧-->
    <div class="col-md-2">
        <ul class="list-group">
            <li class="list-group-item">写回答</li>
            <li class="list-group-item">我的草稿</li>
            <li class="list-group-item">我的收藏</li>
            <li class="list-group-item">我关注的问题</li>
            <li class="list-group-item">我的邀请</li>
        </ul>
    </div>
</div>


<!--引入jQuery-->
<script src="http://localhost:8989/xiaozhi/static/js/jquery-3.3.1.min.js" type="text/javascript"></script>
<!--引入js文件-->
<script src="http://localhost:8989/xiaozhi/static/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>