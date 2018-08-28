<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
     	<meta charset="UTF-8"> 
        <title>个人主页中心</title>
        <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
		<meta name="viewport" content="width=device-width,initial-scale=1">
		<link rel="stylesheet" href="./css/bootstrap.min.css" />
		<link rel="stylesheet" type="text/css" href="./css/base.css"/>
		<script type="text/javascript" src="./js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="./js/bootstrap.min.js"></script>
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
            }
            .set{
            	width:100%;
            	height:250px;
            	background-color:white; 
            	
            }
            #changeimg{
            	float: left;
            	width:30%;
            	height:250px;
            	
            }
            #changeimg  img{
            	width: 180px;
				height: 180px;
				overflow: hidden;
				position: absolute;
				margin-left: 35px;
				margin-top: 35px;
            }
            #info{
            	width:60%;
				height: 250px;
            	position: absolute;
            	margin-left: 270px;
            	font-size: 18px;
            	
            }
            #info p{
            	position: absolute;
				margin-left: 35px;
				margin-top: 75px;
            }
            #info span{
            	position: absolute;
				margin-left: 35px;
				margin-top: 125px;
            }
            #border_line{
            	width: 100%;
            	height: 2px;
            	background-color: #FFE4C4;
            }
            #centerp_right_list{
            	width: 100%;
            	height: 400px;
            	background-color:white;
            }
            .table{
            	margin: auto;
				border-break: 1px;
            }
            .table tr{
            	text-align: center;
            	height:40px;
            } 
            .btn{
            	margin-top: 30px;
            	margin-left: 45%;
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
				<a href="JumToAdmin">管理员入口</a>&nbsp;&nbsp;
				<a href="back">返回首页</a>&nbsp;&nbsp;
				<a href="javascript:history.back(-1)">返回商品页</a>
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

				<li>我的订单</li>
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
						<p><a href="#">基本资料</a></p>
						<p><a href="#" >修改密码</a></p>
						<p><a href="JumpToOrder">我的订单</a></p>
					</dd>
				</dl>
            </div>
            <div class="centerp_right">
            	<div class="set">
            		<div id="changeimg">
            		<img src="./img/1.png" />
            		</div>
            		<div id="info">
						<p>用户名称${sessionScope.ListUser[0].uname}</p>
						<span>电话绑定
            				${sessionScope.ListUser[0].uphone}

                </span>
            		</div>
            	</div>
            	<div id="border_line"></div>
            	<div id="centerp_right_list">
            		<div id="tab_nav">
            			<form>
	            			<table class="table">
							    <thead>
								    <tr>
								        <th>Student-ID:</th>
								        <th>${sessionScope.ListUser[0].uid}</th>
								    </tr>
								    <tr>
								        <th>First Name:</th>
								        <th>${sessionScope.ListUser[0].uname}</th>
								    </tr>
								    <tr>
								        <th>Last Name:</th>
								        <th>${sessionScope.ListUser[0].urealname}</th>
								    </tr>
								    <tr>
								        <th>Address:</th>
								        <th>${sessionScope.ListUser[0].uaddress}</th>
								    </tr>
							    </thead>
							</table>
							<button type="button" class="btn btn-default">修改信息</button>
            			</form>

            		</div>
            	</div>
            </div>           
        </div>
    </body>
</html>