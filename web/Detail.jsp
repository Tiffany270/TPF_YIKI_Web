<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>详细信息</title>
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css/base.css"/>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <style type="text/css">
        #firstDiv {
            width: 1000px;
            height: 800px;
            margin: auto;
        }

        #showimg {
            width: 351px;
            height: 429px;
            float: left;
            margin-top: 30px;
        }

        #showimg img {
            width: 100%;
            height: 100%;
        }

        #showdetail {
            width: 630px;
            height: 429px;
            float: right;
            margin-top: 30px;
        }

        #clothName {
            width: 630px;
            height: 30px;
        }

        #clothName > span {
            font-size: 25px;
            text-align: center;
            line-height: 30px;
            color: black;
            font-weight: bold;
        }

        #clothPrice {
            width: 630px;
            height: 130px;
            margin-top: 30px;
        }

        #clothPrice > p {
            font-size: 15px;
            color: grey;
            line-height: 30px;
        }

        #clothPrice > #oldPrice {
            font-size: 25px;
            text-align: center;
            line-height: 30px;
            color: grey;
            font-weight: bold;
            text-decoration: line-through;
        }

        #clothPrice > #newPrice {
            font-size: 25px;
            text-align: center;
            line-height: 30px;
            color: red;
            font-weight: bold;
        }

        .row {
            margin-top: 80px;
        }

        #car {
            margin-top: 20px;
        }

        #address p {
            line-height: 40px;
            text-align: left;
        }
    </style>
    <script type="text/javascript">

        function add()//增加数量+
        {
            var num = parseInt(document.getElementById("number").value);
            if(num<100)
            {
                document.getElementById("number").value = ++num;
            }
        }
        function sub()//减少数量图标-
        {
            var num = parseInt(document.getElementById("number").value);
            if(num>1)
            {
                document.getElementById("number").value = --num;
            }
        }

    </script>
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


<div id="firstDiv">
    <div id="showimg">
    </div>

    <div id="showdetail">
        <div id="clothName"></div>
        <div id="clothPrice">
            <p>原价：</p><span id="oldPrice"></span>
            <p>现价：</p><span id="newPrice"></span>
        </div>

        <div>

            <div class="row">
                <div class="col-lg-6">
                    <div class="input-group offset1">

                        <form action="addToCart" method="post">

     <span class="input-group-btn">
       <button
               class="btn btn-default" type="button" onclick="sub();" >-</button>
     </span>
                        <input type="text" class="form-control"
                               id="number"
                               name="number"
                               value="1">
                            <span class="input-group-btn">
       <button
               class="btn btn-default" type="button" onclick="add();">+</button>
     </span>
                        <div>
                            <input type="submit" class="btn btn-danger btn-large" id="car" value="加入购物车">
                        </div>




                        </form>



                    </div>

                </div>


            </div>
        </div>
    </div>
</div>

<script type="text/javascript">

    $(function () {
        $.ajax({
            url: "GoodDetail",
            type: "get",
            success: function (result) {
                $("#showimg").append("<img src=img" + result.data.good.gpicture + ">");
                var span = $("<span></span>").append(result.data.good.gname);
                $("#clothName").append(span);
                var oldprice = result.data.good.gprice + 100

                $("#oldPrice").append("$" + oldprice);
                $("#newPrice").append("$" + result.data.good.gprice);
            }
        });


    });





</script>

</body>
</html>
