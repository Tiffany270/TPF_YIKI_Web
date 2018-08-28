<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/base.css"/>
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <style type="text/css">
        body {
        }

        #big {
            width: 100%;
            margin: auto;
            min-width: 1250px;
        }

        #header {
            width: 100%;
            margin: 0;
            height: 100px;
            background-color: red;
            min-width: 1250px;
        }

        #left {
            height: 800px;
            background-color: #EDEDED;

        }

        #right {
            height: 800px;
            background-color: #CDB7B5;

        }

        #left > ul > li {
            display: block;
            font-size: 20px;
        }

        #left > div {
            display: block;
            height: 50px;
            width: 100%;

        }

        #left > .daohang:hover {
            background-color: #E3E3E3;
            width: 100%;
        }

        #left > div > a {
            line-height: 50px;
            text-align: center;
            cursor: pointer;
            font-size: 15px;
            font-weight: bold;
            margin-left: 20px;
            color: black;
        }

        #left > div > span > a {
            text-align: center;
            line-height: 50px;
            margin-left: 20px;
            color: black;
        }

        #left > .lxwm {
            margin-top: 50px;
            height: 100px;

        }

        #left > .lxwm p {
            text-align: center;
            height: 30px;
            display: block;
            font-weight: bold;
            line-height: 30px;
        }

        #left > .lxwm ul {
            padding: 0;
        }

        #left > .lxwm li {
            width: 50%;
            text-align: center;
            line-height: 30px;
            display: block;
            float: left;
            margin: 0;
        }

        #left > .lxwm li a {
            color: #333;
            text-decoration: none;
        }

        #left > .lxwm li a:hover {
            color: #FF5777;
        }

        #hide {
            background-color: #E3E3E3;
            width: 800px;
            height: 380px;
            position: relative;
            top: -800px;
            left: 433px;
            display: none;
        }

        /** 左部导航结束*/
        /** 图片轮播开始 */
        #d {
            width: 850px;
            height: 380px;
        }

        #img {
            width: 850px;
            height: 330px;
        }

        #labels {
            width: 850px;
            height: 50px;
            background-color: #121112;
        }

        #labels span {
            display: block;
            width: 170px;
            height: 50px;
            text-align: center;
            line-height: 50px;
            color: #c8c8c8;
            float: left;
            cursor: pointer;
        }

        #labels span:hover {
            color: #e9c06c;
            background-color: #303030;
        }

        #labels span.spanActive {
            color: #e9c06c;
            background-color: #303030;
        }

        #img img {
            display: none;
        }

        #img img:first-child {
            display: block;
        }

        /*轮播结束*/
        /*衣服展示开始*/
        #cloth {
            background-color: white;
            width: 850px;
            height: 400px;
            padding: 0px;
        }

        #cloth ul {
            padding: 0;
        }

        #cloth li {
            height: 400px;
            width: 270px;

            list-style-type: none;
            float: left;
            margin: auto;
        }

        #cloth li:nth-child(2) {
            margin-left: 20px;
            margin-right: 20px;
        }

        #cloth li > .up {
            height: 330px;
            width: 270px;

        }

        #cloth li > .down {
            height: 70px;
            width: 270px;

        }

        #cloth img {
            width: 100%;
            height: 100%;
            cursor: pointer;
            transition: all 0.3s;
        }

        #cloth img:hover {
            transform: scale(1.05);

        }
    </style>
    <script type="text/javascript">
        $(function () {
            $(".daohang").mouseover(function () {
                $("#hide").show();
            }).mouseout(function () {
                $("#hide").hide();
            });

            var i = 1;
            var id = setInterval(function () {
                $("#img img").fadeOut().hide();
                $("#img img").eq(i).fadeIn().show();
                $("#labels span").removeClass("spanActive");
                $("#labels span").eq(i).addClass("spanActive");
                i++;
                if (i == 5) {
                    i = 0;
                }
            }, 2000);

            $("#labels span").mouseover(function () {
                var index = $(this).index();
                i = index;
                clearInterval(id);
                $("#img img").fadeOut().hide();
                $("#img img").eq(i).fadeIn().show();
                $("#labels span").removeClass("spanActive");
                $("#labels span").eq(i).addClass("spanActive");
            }).mouseout(function () {
                i++;
                if (i == 5) {
                    i = 0;
                }
                id = setInterval(function () {
                    $("#img img").fadeOut().hide();
                    $("#img img").eq(i).fadeIn().show();
                    $("#labels span").removeClass("spanActive");
                    $("#labels span").eq(i).addClass("spanActive");
                    i++;
                    if (i == 5) {
                        i = 0;
                    }
                }, 2000);
            })
        });
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
                <a href="JumToAdmin">管理员入口</a>
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
        <a href="javascript:" class="close-banner"></a>
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
        <input type="text" value="图书开抢">
        <button>搜索</button>
    </div>

</div>
<div id="big">
    <div class="container">
        <div class="row">
            <div class="col-md-3" id="left">
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=man">男装</a>
                    <span><a target="_blank" href="JumpToGood?type=manT">T恤</a></span>
                    <span><a target="_blank" href="JumpToGood?type=manJ">夹克</a></span>
                    <span><a target="_blank" href="JumpToGood?type=manF">风衣</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=women">女装</a>
                    <span><a target="_blank" href="JumpToGood?type=womenS">短裙</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenQ">连衣裙</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenF">风衣</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=winter">冬装</a>
                    <span><a target="_blank" href="JumpToGood?type=womenF">短款棉袄</a></span>
                    <span><a target="_blank" href="JumpToGood?type=maoyi">毛衣</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenF">毛呢外套</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=womenS">夏装</a>
                    <span> <a target="_blank" href="JumpToGood?type=pants">短裤</a></span>
                    <span><a target="_blank" href="JumpToGood?type=manT">短袖</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenS">高腰裙</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=manT">上衣</a>
                    <span><a target="_blank" href="JumpToGood?type=manT">T恤</a></span>
                    <span><a href="#"><a target="_blank" href="JumpToGood?type=womenF">夹克</a></span>
                    <span><a href="#"><a target="_blank" href="JumpToGood?type=womenF">风衣</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=women">裙子</a>
                    <span><a target="_blank" href="JumpToGood?type=womenS">牛仔裙</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenS">长裙</a></span>
                    <span><a target="_blank" href="JumpToGood?type=womenS">短裙</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=pants">裤子</a>
                    <span> <a target="_blank" href="JumpToGood?type=kuopants">阔腿裤</a></span>
                    <span><a target="_blank" href="JumpToGood?type=kuopants">牛仔裤</a></span>
                    <span><a target="_blank" href="JumpToGood?type=kuopants">初恋裤</a></span>
                </div>
                <div class="daohang">
                    <a target="_blank" href="JumpToGood?type=shoe">鞋子</a>
                    <span> <a target="_blank" href="JumpToGood?type=shoe">皮鞋</a></span>
                    <span> <a target="_blank" href="JumpToGood?type=shoeY">运动鞋</a></span>
                    <span> <a target="_blank" href="JumpToGood?type=shoeL">凉鞋</a></span>
                </div>
                <div class="lxwm">
                    <div>
                        <p>-新手帮助-</p>
                        <ul>
                            <li><a href="#">常见问题</a></li>
                            <li><a href="#">自助服务</a></li>
                            <li><a href="#">联系客服</a></li>
                            <li><a href="#">意见反馈</a></li>
                        </ul>
                    </div>
                    <div>
                        <p>-权益保障-</p>
                        <ul>
                            <li><a href="#">全国包邮</a></li>
                            <li><a href="#">7天无理由退货</a></li>
                            <li><a href="#">退货运费补贴</a></li>
                            <li><a href="#">限时发货</a></li>
                        </ul>
                    </div>
                    <div>
                        <p>-支付方式-</p>
                        <ul>
                            <li><a href="#">微信支付</a></li>
                            <li><a href="#">支付宝</a></li>
                            <li><a href="#">白付美支付</a></li>
                            <li><a href="#">货到付款</a></li>
                        </ul>
                    </div>
                    <div>
                        <p>-移动客户端下载-</p>
                        <ul>
                            <li><a href="#">蘑菇街</a></li>
                            <li><a href="#">美丽说</a></li>
                            <li><a href="#">uni引力</a></li>

                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-md-9" id="right">
                <div id="d">
                    <div id="img">
                        <img src="img/lunbo1.jpg"/>
                        <img src="img/lunbo2.jpg"/>
                        <img src="img/lunbo3.jpg"/>
                        <img src="img/lunbo4.jpg"/>
                        <img src="img/lunbo5.jpg"/>
                    </div>
                    <div id="labels">
                        <span class="spanActive">精品男装</span>
                        <span>品牌女装</span>
                        <span>休闲男装</span>
                        <span>今日头条</span>
                        <span>特色定制</span>
                    </div>
                </div>
                <div id="cloth">
                    <ul>
                        <li>
                            <div class="up">
                                <a href="JumpToDetail?id=22"> <img alt="" src="img/nv8.jpg"></a>
                            </div>
                            <div class="down"><p>RANDOMEVENT(RDET)18SS PATCHES T-SHIRT 3色拼接LOGO标签短袖T恤 <br>￥233.10</p>
                            </div>
                        </li>
                        <li>
                            <div class="up">
                                <a href="JumpToDetail?id=32">
                                    <img alt="" src="img/nan6.jpg">
                                </a>
                            </div>
                            <div class="down"><p>RANDOMEVENT(RDET)18SS PRINT T-SHIRT MTW BOX印花短袖T恤 <br>￥233.10</p></div>
                        </li>
                        <li>
                            <div class="up">
                                <a href="JumpToDetail?id=44">
                                    <img alt="" src="img/nvy4.jpg">
                                </a></div>
                            <div class="down"><p>初恋裙气质雪纺裙子V领显瘦小清新复古碎花蓝色连衣裙收腰中长款 <br>￥666.10</p></div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div id="hide"></div>
    <div class="jd-footer">
        <div class="service">
            <!-- <div class="slogen ">
                 <span class="item slogen1">
                    <img src="img/slogen1.png" alt="">
                </span>
                <span class="item slogen2">
                    <img src="img/slogen2.png" alt="">
                </span>
                <span class="item slogen3">
                    <img src="img/slogen3.png" alt="">
                </span>
                <span class="item slogen4">
                    <img src="img/slogen4.png" alt="">
                </span>

            </div> -->
            <div class="w shopping clearfix">
                <dl>
                    <dt><a href="#">购物指南</a></dt>
                    <dd><a href="#">购物流程</a></dd>
                    <dd><a href="#">会员介绍</a></dd>
                    <dd><a href="#">生活旅行</a></dd>
                    <dd><a href="#">常见问题</a></dd>
                    <dd><a href="#">大家电</a></dd>
                    <dd><a href="#">联系客服</a></dd>
                </dl>
                <dl>
                    <dt><a href="#">配送方式</a></dt>
                    <dd><a href="#">上门自提</a></dd>
                    <dd><a href="#">211限时达</a></dd>
                    <dd><a href="#">配送服务查询</a></dd>
                    <dd><a href="#">配送费收取标准</a></dd>
                    <dd><a href="#">海外配送</a></dd>
                </dl>
                <dl>
                    <dt><a href="#"> 支付方式 </a></dt>
                    <dd><a href="#">货到付款</a></dd>
                    <dd><a href="#">在线支付</a></dd>
                    <dd><a href="#">分期付款</a></dd>
                    <dd><a href="#">邮局汇款</a></dd>
                    <dd><a href="#">公司转账</a></dd>
                </dl>
                <dl>
                    <dt><a href="#"> 售后服务</a></dt>
                    <dd><a href="#">售后政策</a></dd>
                    <dd><a href="#">价格保护</a></dd>
                    <dd><a href="#">退款说明</a></dd>
                    <dd><a href="#"> 返修/退换货</a></dd>
                    <dd><a href="#">取消订单</a></dd>
                </dl>
                <dl>
                    <dt><a href="#"> 特色服务</a></dt>
                    <dd><a href="#">夺宝岛</a></dd>
                    <dd><a href="#">DIY装机</a></dd>
                    <dd><a href="#">延保服务</a></dd>
                    <dd><a href="#">京东E卡</a></dd>
                    <dd><a href="#">京东通信</a></dd>
                    <dd><a href="#">京东JD+</a></dd>
                </dl>
                <div class="coverage">
                    <div class="dt">京东自营覆盖区县</div>
                    <div class="dd">
                        <p>京东已向全国2661个区县提供自营配送服务，支持货到付款、POS机刷卡和售后上门服务。</p>
                        <p class="looklook"><a href="#">查看详情</a></p>
                    </div>
                </div>

            </div>
        </div>
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
            <div class="copyright">
                京公网安备 11000002000088号|京ICP证070359号|互联网药品信息服务资格证编号(京)-经营性-2014-0008|新出发京零 字第大120007号<br/>

                互联网出版许可证编号新出网证(京)字150号|出版物经营许可证|网络文化经营许可证京网文[2014]2148-348号|违法和不良信息举报电话：4006561155<br/>

                Copyright 2004 - 2018 京东JD.com 版权所有|消费者维权热线：4006067733经营证照|(京)网械平台备字(2018)第00003号<br/>

                Global Site|Сайт России|Situs Indonesia|Sitio de España<br/>

                京东旗下网站：京东钱包|京东云
            </div>
            <div class="message"> -->
                <a href="#"><img src="img/mess.png"></a> -->
                <a href="#"><img src="img/mess2.png"></a> -->
                <a href="#"><img src="img/mess3.png"></a> -->
                <a href="#"><img src="img/mess4.png"></a> -->
                <a href="#"><img src="img/mess5.png"></a> -->
            </div>
        </div>
    </div>
</div>
</body>
</html>