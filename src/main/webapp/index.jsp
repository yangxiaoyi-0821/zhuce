<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>轮播</title>
    <link  rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <!-- 导航 -->
    <div class="nav">
        <ul>
            <li><a href="#">链接三</a></li>
            <li><a href="#">链接二</a></li>
            <li><a href="#">链接一</a></li>
            <li><a href="#">首页</a></li>
        </ul>
    </div>
    <!-- 主体内容 （登陆界面）-->
    <div class="main">
        <!-- 左侧信息栏 -->
        <div class="sideleft">
            <h1>用爱汇聚力量   用心创造未来</h1>
            <h4>区块链结合公益  让新技术发挥大价值</h4>
            </br></br></br>
            <p>专业指导、数据化管理，高效帮扶。</p>
            <p>打造专业高效的公益类网站。</p>
            <p>有梦为马 随处可栖</p>
            <p>奉献  关爱  帮扶  成长  未来</p>
        </div>
        <!-- 右侧登陆界面 -->
        <div class="sideright">
            <div class="index">
                <form action="#" method="post">
                    <p class="headline">用户登陆</p>
                    <p class="astyle">用户名：</p>
                    <input type="text"  id="user_id" name="user_id">
                    <p class="astyle">密码：</p>
                    <input type="text"  id="user_password" name="user_password">
                    <input type="submit" value="登陆" name="login" >
                    </br>
                    <p class="bstyle"><input type="checkbox" name="rempas" />  记住密码</p>
                    <p class="cstyle">忘记密码</p>
                    </br></br>
                    <p class="cstyle">没有账号？<a href="zhuce.jsp">立即注册</a></p>
                </form>

            </div>
        </div>
    </div>
    <!-- 尾部 -->
    <div class="footer">
        <ul>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">诚聘人才</a></li>
            <li><a href="#">联系商家</a></li>
            <li><a href="#">广告服务</a></li>
            <li><a href="#"></a></li>
        </ul>
    </div>
</div>
</body>
</html>


