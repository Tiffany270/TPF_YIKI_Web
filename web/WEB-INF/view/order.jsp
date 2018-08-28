<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<html>
    <head>
     	<meta charset="UTF-8"> 
        <title>订单</title>
		<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="./css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="./css/base.css"/>
		<script type="text/javascript" src="./js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="./js/bootstrap.js"></script>
        <style type="text/css">
        	*{
        	 	margin:0;
        	 	padding:0;
        	 }
        	 body{
        	 	background-color:whitesmoke;
        	 }
            #headp{
            	width:100%;
            	height:100px;
            }
            #headp img{
            	width: 100%;
            	height: 100px;
            }
            #centerp{
            	float: left;
            	margin: auto;           
            }
            .centerp_left{
            	width:12%;
            	height:550px;
             	background-color:white;
            	position:absolute;
            	margin-left: 180px;
            }
            .centerp_left dl{
            	text-align: center;
            }
            .centerp_left dt{
            	margin-top: 25px;
            	font-size: 20px;
            }
            .centerp_left dd{
            	margin-top: 15px;
            	font-size: 17px;
            }
            .centerp_left p{
            	margin-top: 15px;
            }
            .centerp_left p:hover{
            	background-color:lightpink;
            }
            .centerp_left a{
				text-decoration: none;
				color:lightslategray;
            }
            .centerp_right{
            	width:60%;
            	height:800px;
            	position:absolute;
            	margin-left: 360px;
				margin-top: 60px;
            	background-color:white;
            }
            .tab-content{
				width: 60%;
				height: 100px;
			}       
            
        </style>
    
    
    
    </head>
    <body>
<!--     头部 -->
<div class="shoutcut">
	<div class="w">
		<div class="fl">
			<div class="td">
				送至：北京
				<i><s>◇</s></i>
			</div>
		</div>
		<div class="fl">
			<div>
				<a href="JumToAdmin">管理员入口</a>
				<a href="back">返回首页</a>
			</div>
		</div>
		<div class="fr">
			<ul>
				<li>
					<c:if test="${sessionScope.isLogin==null}">

						<a href="login.html">你好，请登录 &nbsp;&nbsp;</a>
						<a href="signup.html" class="col-red"> 免费注册</a>
					</c:if>

					<c:if test="${sessionScope.isLogin!=null}">
						<a href="userinfo">欢迎你 &nbsp;${sessionScope.loginuser} &nbsp;&nbsp;</a>

					</c:if>

				</li>
				<li>
					<a href="loginOut">退出</a>
				</li>
				<li class="line"></li>

				<li>
					<a href="JumpToOrder">
						我的订单</a></li>
				<li class="line"></li>
				<li class="fore">
					<a href="JumpToCart">购物车</a>
				</li>
				<li class="line"></li>
				<li>京东会员</li>
				<li class="line"></li>
				<li class="fore">企业采购
					<i><s>◇</s></i>
				</li>
				<li class="line"></li>
				<li class="fore">客户服务
					<i><s>◇</s></i>
				</li>
				<li class="line"></li>
				<li class="fore">网站导航
					<i><s>◇</s></i>
				</li>
				<li class="line"></li>
				<li class="fore tel-jd">
					<em class="tel"></em>
					手机京东
					<i><s>◇</s></i>
				</li>
			</ul>
		</div>
	</div>
</div>

<div class="topbanner">
	<div class="w tp">
		<img src="img/topbanner.jpg">
		<a href="#" class="close-banner"></a>
	</div>
</div>
<!--         中间 -->
        <div id="centerp">
            <!--左边列表导航  开始-->
            <div class="centerp_left">
                <dl>
					<dt>个人管理</dt>
					<dd>
						<p><a href="#" target="_blank">我的足迹</a></p>
						<p><a href="#" target="_blank">个人设置</a></p>
						<p><a href="#" target="_blank">关注店铺</a></p>
						<p><a href="#" target="_blank">查看我的积分</a></p>
						<p><a href="#" target="_blank">收货地址管理</a></p>
					</dd>
				</dl>
				<dl>
					<dt>优惠活动</dt>
				</dl>
				<dl>
					<dt>我的评价</dt>
				</dl>
				<dl>
					<dt>我的账号</dt>
					<dd>
						<p><a href="tg.html" >基本资料</a></p>
						<p><a href="Mima.html">修改密码</a></p>
						<p><a href="index.html" >我的订单</a></p>
					</dd>
				</dl>
            </div>
            <div class="centerp_right">
            	<div class="container">
					 <ul class="nav nav-tabs">
					    <li class="active"><a data-toggle="tab" href="#home">所有订单</a></li>
					    <li><a data-toggle="tab" href="#menu1">详细</a></li>
					    <li><a data-toggle="tab" href="#menu2">待发货</a></li>
					    <li><a data-toggle="tab" href="#menu3">待收货</a></li>
					    <li><a data-toggle="tab" href="#menu3">待评价</a></li>
					 </ul>
		
				 	<div class="tab-content">
					    <div id="home" class="tab-pane fade in active">


							<table class="table table-striped">
								<thead>
								<tr>
									<th>订单-ID</th>
									<th>First Name</th>
									<th>总计</th>
									<th>地址</th>
									<th>发货状态</th>
								</tr>
								</thead>
								<tbody>
								<c:forEach items="${orderList}" var="order" >


								<tr>
									<td>${order.oid}</td>
									<td>${order.ousername} </td>
									<td>￥${order.ototalprice}</td>
									<td>${order.oaddress}</td>
									<td>${order.issend}</td>
								</tr>
								</c:forEach>

								</tbody>
							</table>




					    </div>
					    <div id="menu1" class="tab-pane fade">










					    </div>
					    <div id="menu2" class="tab-pane fade">
					      <h3>菜单 2</h3>
					      <p>这是菜单 2 显示的内容。这是菜单 2 显示的内容。这是菜单 2 显示的内容。</p>
					    </div>
					    <div id="menu3" class="tab-pane fade">
					      <h3>菜单 3</h3>
					      <p>这是菜单 3 显示的内容。这是菜单 3 显示的内容。这是菜单 3 显示的内容。</p>
					    </div>
		  			</div>
				</div>
            	
            </div>           
        </div>
    </body>
</html>