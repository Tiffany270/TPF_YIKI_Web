<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <title>Admin-UserManage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="http://fonts.googleapis.com/css?family=Oxygen|Marck+Script" rel="stylesheet" type="text/css">
    <link href="./css/bootstrap.css" rel="stylesheet">
    <link href="./css/font-awesome.css" rel="stylesheet">
    <link href="./css/admin.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>

<div class="container">

    <div class="row">

        <div class="span2">

            <div class="main-left-col">

                <h1><i class="icon-shopping-cart icon-large"></i> Adminize</h1>

                <ul class="side-nav">

                    <li>
                        <a href="back"><i class="icon-home"></i>返回主页</a>
                    </li>
                    <li>
                        <a href="JumToAdmin">
                            <i class="icon-sitemap"></i>用户管理<b class="caret"></b></a>
                    </li>
                    <li>
                        <a href="JumToOrderManager">
                            <i class="icon-sitemap"></i>订单管理<b class="caret"></b></a>
                    </li>
                    <li>
                        <a href="JumToGoodManager">
                            <i class="icon-sitemap"></i>商品管理<b class="caret"></b></a>
                    </li>

                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#reports-dropdown" href="#">
                            <i class="icon-signal"></i> Reports <b class="caret"></b></a>
                        <ul id="reports-dropdown" class="collapse">
                            <li><a href="report.html">Sales Reports</a></li>
                            <li><a href="report.html">Product Popularity</a></li>
                            <li><a href="report.html">Member Registrations</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#members-dropdown" href="#"><i
                                class="icon-group"></i> Members <b class="caret"></b></a>
                        <ul id="members-dropdown" class="collapse">
                            <li><a href="listing.html">Members</a></li>
                            <li><a href="listing.html">User Groups</a></li>
                            <li><a href="listing.html">Permissions</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#settings-dropdown" href="#"><i
                                class="icon-cogs"></i> Settings <b class="caret"></b></a>
                        <ul id="settings-dropdown" class="collapse">
                            <li><a href="listing.html">Payment Processors</a></li>
                            <li><a href="listing.html">Order Statuses</a></li>
                            <li><a href="listing.html">Shipping Methods</a></li>
                            <li><a href="listing.html">Emails</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="icon-bullhorn"></i> Alerts <span class="badge badge-warning">2</span></a>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#help-dropdown" href="#"><i
                                class="icon-info-sign"></i> Help <b class="caret"></b></a>
                        <ul id="help-dropdown" class="collapse">
                            <li><a href="content.html">FAQ</a></li>
                            <li class="active"><a href="content.html">User Guide</a></li>
                            <li><a href="content.html">Support</a></li>
                        </ul>
                    </li>
                </ul>

            </div> <!-- end main-left-col -->

        </div> <!-- end span2 -->

        <div class="span10">


            <div class="main-area dashboard">


                <div class="row">

                    <div class="span10">

                        <div class="slate">

                            <form class="form-inline">
                                <input type="text" class="input-large" placeholder="Order # or Customer Name...">
                                <select class="span2">
                                    <option value=""> - From Date -</option>
                                </select>
                                <select class="span2">
                                    <option value=""> - To Date -</option>
                                </select>
                                <select class="span2">
                                    <option value=""> - Order Status -</option>
                                </select>
                                <button type="submit" class="btn btn-primary">Filter Orders</button>
                            </form>

                        </div>

                    </div>

                </div>

                <div class="row">

                    <div class="span10 listing-buttons">

                        <button class="btn btn-info">Action</button>

                        <button class="btn btn-success">Action</button>

                        <button class="btn btn-primary">Add New Order</button>

                    </div>

                    <div class="span10">

                        <div class="slate">

                            <div class="page-header">
                                <div class="btn-group pull-right">
                                    <button class="btn dropdown-toggle" data-toggle="dropdown">
                                        <i class="icon-download-alt"></i> Export
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a href="">CSV</a></li>
                                        <li><a href="">Excel</a></li>
                                        <li><a href="">PDF</a></li>
                                    </ul>
                                </div>
                                <h2>用户管理</h2>
                            </div>

                            <table class="orders-table table" id="user_table">
                                <thead>
                                <tr>
                                    <th class="value">ID</th>
                                    <th class="value">商品名</th>
                                    <th class="value">类型</th>
                                    <th class="value">价格</th>
                                    <th class="value">库存</th>
                                    <th class="actions">图片路径</th>
                                    <th class="actions">Actions</th>
                                </tr>
                                </thead>


                                <%--==================查询开始================================--%>
                                <tbody>

                                </tbody>
                                <%--==================查询结束================================--%>

                            </table>

                        </div>

                    </div>

                    <div class="span7">
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

                <div class="row">

                    <div class="span10 footer">

                        <p>&copy; Website Yiki 2018/08/05</p>

                    </div>

                </div>

            </div>

        </div> <!-- end span10 -->

    </div> <!-- end row -->

</div> <!-- end container -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="./js/jquery.min.js"></script>
<script src="./js/bootstrap.js"></script>


<script type="text/javascript">

    $(function () {
        to_page(1);

    });


    function to_page(pn) {
        $.ajax({
            url: "GoodsManage",
            data: "pn=" + pn,
            type: "get",
            success: function (result) {
                console.log(result);
                build_table(result);
                build_pageinfo(result);
                build_page_nave(result);
            }
        });
    }

    function build_table(result) {


        //构建之前都要清空
        $("#user_table tbody").empty();

        var goods = result.data.pageInfo.list;
        $.each(goods, function (index, item) {
            var gid = $("<td></td>").append(item.gid);
            var gname = $("<td></td>").addClass("value").append(item.gname);
            var gprice = $("<td></td>").addClass("value").append(item.gprice);
            var gnumber = $("<td></td>").addClass("value").append(item.gnumber);
            var gtype = $("<td></td>").addClass("value").append(item.gtype);
            var gpic = $("<td></td>").addClass("value").append(item.gpicture);
            var href = $("<a></a>").attr("href", "#").addClass("btn btn-small btn-primary").append("修改库存");
            var action = $("<td></td>").addClass("actions").append(href);
            $("<tr></tr>").append(gid)
                .append(gname)
                .append(gtype)
                .append(gprice)
                .append(gnumber)
                .append(gpic)
                .append(action)
                .appendTo("#user_table tbody");

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