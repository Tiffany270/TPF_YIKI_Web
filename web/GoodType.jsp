<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品列表</title>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/base.css" />
    <script type="text/javascript" src="js/jquery-1.9.1.min.js" ></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <style type="text/css">
        body{
            width:100%;
        }
        .imgs{
            width:1180px;
            height:850px;
            margin:auto;
            padding:0px;
        }
        /*衣服展示开始*/
        .imgs ul{
            padding:0;
        }
        .imgs li{
            height:400px;
            width:270px;

            list-style-type:none;
            float:left;
            margin:auto;
        }
        .imgs li{
            margin-left:20px;
            margin-top:20px;
        }
        .imgs li>.up{
            height:330px;
            width:270px;

        }
        .imgs li>.down{
            height:70px;
            width:270px;

        }
        .imgs img{
            width:100%;
            height:100%;
            cursor: pointer;
            transition: all 0.3s;
        }
        .imgs img:hover{
            transform: scale(1.05);
        }
        .jd-footer{
            margin-top: 200px;
        }
    </style>
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
<div class="w clearfix">
    <div class="logo">
        <a href="http://www.jd.com" target="_blank" class="jd-a" title="叮咚">京东</a>
        <div class="db11">
            <a href="#"><img src="img/dong.gif" alt=""></a>
        </div>
    </div>
    <div class="search">
        <input type="text" value="今日开抢">
        <button>搜索</button>
    </div>
</div>

<div class="imgs">
    <ul id="imgs">
    </ul>

</div>

<div>
    <div class="span10 clearfix">
        <%--===分页条开始==================--%>
        <div class="pagination pull-left">
            <div id="pageinfo"></div>
        </div>

        <div class="pagination pull-right">
            <ul id="page_nav">

            </ul>
        </div>
        <%--===分页条结束==================--%>
    </div>

</div>

<div class="jd-footer">
    <div class="w againw">
        <div class="links">
            <a href="#">关于我们</a>|
            <a href="#">联系我们</a>|
            <a href="#">联系客服</a>|
            <a href="#">合作招商</a>|
            <a href="#">商家帮助</a>|
            <a href="#">营销中心</a>|
            <a href="#">手机京东</a>|
            <a href="#">友情链接</a>|
            <a href="#">销售联盟</a>|
            <a href="#">京东社区</a>|
            <a href="#">风险监测</a>|
            <a href="#">隐私政策</a>|
            <a href="#">京东公益</a>|
            <a href="#">English Site</a>|
            <a href="#">Media & IR</a>|
        </div>
        <div  class="copyright">
            京公网安备 11000002000088号|京ICP证070359号|互联网药品信息服务资格证编号(京)-经营性-2014-0008|新出发京零 字第大120007号<br/>

            互联网出版许可证编号新出网证(京)字150号|出版物经营许可证|网络文化经营许可证京网文[2014]2148-348号|违法和不良信息举报电话：4006561155<br/>

            Copyright  2004 - 2018  京东JD.com 版权所有|消费者维权热线：4006067733经营证照|(京)网械平台备字(2018)第00003号<br/>

            Global Site|Сайт России|Situs Indonesia|Sitio de España<br/>

            京东旗下网站：京东钱包|京东云
        </div>
        <div class="message">
            <a href="#"><img src="img/mess.png"></a>
            <a href="#"><img src="img/mess2.png"></a>
            <a href="#"><img src="img/mess3.png"></a>
            <a href="#"><img src="img/mess4.png"></a>
            <a href="#"><img src="img/mess5.png"></a>
        </div>
    </div>
</div>




<script type="text/javascript">

    $(function () {
        to_page(1);

    });


    function to_page(pn) {
        $.ajax({
            url: "AllGoods",
            data: "pn=" + pn,
            type: "get",
            success: function (result) {
               console.log(result);
                build_show(result);
                build_pageinfo(result);
               build_page_nave(result);
            }
        });
    }
    function build_show(result) {

        //构建之前都要清空
        $("#imgs ").empty();

        var show = result.data.pageInfo.list;
        $.each(show, function (index, item) {
            var gid = item.gid;
            var li = $("<li></li>");
            var divup = $("<div></div>").addClass("up");// /man_T/manT01.jpg
            divup.append("<a href='JumpToDetail?id="+gid+"'><img src=img"+item.gpicture+"></a>");

            var divdown=$("<div></div>").addClass("down");
            var name=$("<p></p>").append(item.gname+"&nbsp;"+item.gtype).append("</br>");
            var price=$("<p></p>").append("￥"+item.gprice);
            divdown.append(name).append(price);

            li.append(divup).append(divdown);
            $("#imgs").append(li);




        });
    }

    function build_pageinfo(result) {
        //  当前pageinfo.pageNum}页,
        //共pageinfo.pages}页,
        //共pageinfo.total}条记录
        $("#pageinfo").empty();

        $("#pageinfo")
            .append("当前第" + result.data.pageInfo.pageNum + "页，" +
                "共" + result.data.pageInfo.pages + " 页，" +
                "共" + result.data.pageInfo.total + "条记录")
    }

    function build_page_nave(result) {
        $("#page_nav").empty();

        var firstPage = $("<li></li>")
            .append($("<a></a>")
                .append("首页")
                .attr("href", "#"));

        var lastPage = $("<li></li>")
            .append($("<a></a>")
                .append("尾页")
                .attr("href", "#"));


        var prePage = $("<li></li>")
            .append($("<a></a>")
                .append("Prev")
                .attr("href", "#"));
        var nextPage = $("<li></li>")
            .append($("<a></a>")
                .append("Next")
                .attr("href", "#"));

        if (result.data.pageInfo.hasPreviousPage == false) {
            firstPage.addClass("disabled");
            prePage.addClass("disabled");
        }
        else {

            //首页的点击事件
            firstPage.click(function () {
                to_page(1);
            });

            //Prev的点击事件
            prePage.click(function () {
                to_page(result.data.pageInfo.pageNum - 1);
            });
        }

        if (result.data.pageInfo.hasNextPage == false) {
            lastPage.addClass("disabled");
            nextPage.addClass("disabled");
        }
        else {
            //Next的点击事件
            nextPage.click(function () {
                to_page(result.data.pageInfo.pageNum + 1);
            });

            //尾页的点击事件
            lastPage.click(function () {
                to_page(result.data.pageInfo.pages);
            });
        }


        $("#page_nav")
            .append(firstPage)
            .append(prePage);
        $.each(result.data.pageInfo.navigatepageNums, function (index, item) {

            var numli = $("<li></li>")
                .append($("<a></a>")
                    .append(item)
                    .attr("href", "#"));
            if (result.data.pageInfo.pageNum == item) {
                numli.addClass("active");
            }

            //数字翻页的点击事件
            numli.click(function () {
                to_page(item);
            });

            $("#page_nav").append(numli);
        });
        $("#page_nav").append(nextPage)
            .append(lastPage);
    }


    </script>


</body>
</html>
