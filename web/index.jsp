<%--
  Created by IntelliJ IDEA.
  User: Tiffany270
  Date: 2018/7/23
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>



    <title>$Title$</title>
  </head>
  <body>
  <a href="quer">查询</a>


  <a href="admin">管理员</a>
  <a href="signup.html">注册</a>
  <a href="loginOut">退出</a>




  <c:if test="${ empty param.isLogin}">

    <form action="login" method="post">
      姓名<input type="text" name="uname">
      <br/>密码<input type="text" name="upassword"><br/>
      <input type="submit" value="提交">

    </form>

  </c:if>

  ${param.loginuser}



  <div class="imgs">

  </div>




  </body>


  <script src="js/jquery.min.js"></script>
  <script type="text/javascript">
      window.onload=function(){
          $.ajax({
              type:'get',
              url:"getImg",
              dataType:'json',
              success:function(data){
                  for (var i = 0; i < data.length; i++){
                      console.log(data[i].iurl);
                      $(".imgs").append("<a href='quer'><img src=img/"+data[i].iurl+"></a>")
                  }
              }
          })
      }
  </script>
</html>
