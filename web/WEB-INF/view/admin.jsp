<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <title>686 Adminize</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="http://fonts.googleapis.com/css?family=Oxygen|Marck+Script" rel="stylesheet" type="text/css">
    <link href="../../css/bootstrap.css" rel="stylesheet">
    <link href="../../css/font-awesome.css" rel="stylesheet">
    <link href="../../css/admin.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<a href="AllUser?pn=2">查询</a>
<div class="container">

    <div class="row">

        <div class="span2">

            <div class="main-left-col">

                <h1><i class="icon-shopping-cart icon-large"></i> Adminize</h1>

                <ul class="side-nav">

                    <li>
                        <a href="index.html"><i class="icon-home"></i> Dashboard</a>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#website-dropdown" href="#"><i
                                class="icon-sitemap"></i> Website <b class="caret"></b></a>
                        <ul id="website-dropdown" class="collapse">
                            <li><a href="listing.html">Pages</a></li>
                            <li><a href="listing.html">Menus</a></li>
                        </ul>
                    </li>
                    <li class="dropdown active">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#store-dropdown" href="#"><i
                                class="icon-shopping-cart"></i> Store <b class="caret"></b></a>
                        <ul id="store-dropdown">
                            <li><a href="listing.html">Catalogue</a></li>
                            <li class="active"><a href="orders.html">Orders</a></li>
                            <li><a href="listing.html">Enquiries</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="collapse" data-target="#reports-dropdown" href="#"><i
                                class="icon-signal"></i> Reports <b class="caret"></b></a>
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
                                <h2>Orders</h2>
                            </div>

                            <table class="orders-table table">
                                <thead>
                                <tr>
                                    <th>Orders</th>
                                    <th class="value">Value</th>
                                    <th class="actions">Actions</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span class="label label-info">New</span><br/><span
                                            class="meta">Today at 13:42</span></td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span class="label label-info">New</span><br/><span
                                            class="meta">Today at 13:42</span></td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span class="label label-info">New</span><br/><span
                                            class="meta">Today at 13:42</span></td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span
                                            class="label label-success">Dispatched</span><br/><span class="meta">Today at 13:42</span>
                                    </td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span
                                            class="label label-important">Refunded</span><br/><span class="meta">Today at 13:42</span>
                                    </td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span class="label label">Awaiting Payment</span><br/><span
                                            class="meta">Today at 13:42</span></td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span
                                            class="label label-inverse">Failed</span><br/><span class="meta">Today at 13:42</span>
                                    </td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span
                                            class="label label-warning">Cancelled</span><br/><span class="meta">Today at 13:42</span>
                                    </td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                <tr>
                                    <td><a href="vieworder.html">#12345 - John Smith</a> <span
                                            class="label label-success">Dispatched</span><br/><span class="meta">Today at 13:42</span>
                                    </td>
                                    <td class="value">
                                        $132.00
                                    </td>
                                    <td class="actions">
                                        <a class="btn btn-small btn-primary" href="vieworder.html">View Order</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>

                        </div>

                    </div>

                    <div class="span5">

                        <div class="pagination pull-left">
                            <ul>
                                共${pageinfo.getPageNum()}
                                <li><a href="#">Prev</a></li>
                                <li class="active">
                                    <a href="#">1</a>
                                </li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#">4</a></li>
                                <li><a href="#">Next</a></li>
                            </ul>
                        </div>

                    </div>

                    <div class="span5 listing-buttons pull-right">

                        <button class="btn btn-info">Action</button>

                        <button class="btn btn-success">Action</button>

                        <button class="btn btn-primary">Add New Item</button>

                    </div>

                </div>

                <div class="row">

                    <div class="span10 footer">

                        <p>&copy; Website Name 2014</p>

                    </div>

                </div>

            </div>

        </div> <!-- end span10 -->

    </div> <!-- end row -->

</div> <!-- end container -->

<!-- Le javascript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="../../js/jquery.min.js"></script>
<script src="../../js/bootstrap.js"></script>


</body>
</html>