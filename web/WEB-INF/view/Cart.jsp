<%--
  Created by IntelliJ IDEA.
  User: Tiffany270
  Date: 2018/8/1
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>购物车</title>
    <link rel="stylesheet" type="text/css" href="./css/new_file.css"/>
    <link rel="stylesheet" type="text/css" href="./css/base.css"/>
    <link rel="stylesheet" href="./css/bootstrap.min.css"/>
    <script type="text/javascript" src="./js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="./js/bootstrap.js"></script>
</head>
<body>
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

<form action="submitOrder">
    <div class="container">
        <div class="row">

            <div class="col-md-12 offset1" id="boss">


            </div>
            <div class="col-md-12 offset1">
                <div class="box2">
                    <span class=" pt">总计：</span>
                    <span class="box2-pice">

	 	</span>
                    <div class="pay">
                        <div class="btn btn-danger">
                            <a href="submitOrder">去结算</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</form>


<script type="text/javascript">



    $(function () {



        $.ajax({
            url: "getCart",
            type: "get",
            success: function (result) {
                console.log(result);
                var goodlist = result.data.goodlist;
                var totalprice=0;

                    $.each(goodlist, function (index, item) {
                    var box1 = $("<div></div>").addClass("box1");

                    var gid = item.gid;
                    totalprice+=item.gprice;
                    var divcol1 = $("<div></div>").addClass("col-md-2");
                    var divpic = $("<div></div>").addClass("pic");
                    divpic.append("<a href='JumpToDetail?id=" + gid + "'><img src=img" + item.gpicture + "></a>");
                    divcol1.append(divpic);

                    var divcol2 = $("<div></div>").addClass("col-md-2");
                    divcol2.append(item.gname + "</br>" + item.gtype);

                    var divcol3 = $("<div></div>").addClass("col-md-2").addClass("number");

                    var divcol4 = $("<div></div>").addClass("col-md-2");
                        divcol4.append("￥"+item.gprice);

                    var divcol5 = $("<div></div>").addClass("col-md-2");
                        divcol5.append("<a href='removeToCart?gid=" + gid + "'>删除"+"</a>");

                    box1.append(divcol1).append(divcol2).append(divcol3)
                        .append(divcol4).append(divcol5);

                    $("#boss").append(box1);
                })

                $(".box2-pice").append("<em>￥"+totalprice+"</em>");

                var numberlist = result.data.numberlist;
                    console.log(numberlist[0]);
                    var number = document.getElementsByClassName("number");
                    for(var i=0;i<number.length;i++){
                        number[i].append(numberlist[i]);
                    }



            }
        });


    });


</script>


</body>
</html>

