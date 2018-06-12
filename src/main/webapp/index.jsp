<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 6/6/2018
  Time: 10:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
</head>
<body>
 <div class="container">
     <a href="springmvc/testRestGet/1">Rest Get</a>
     <form action="springmvc/testRestPost" method="post">
         <input type="submit" value="POST">
     </form>
     <form action="springmvc/testRestPut/1" method="post">
         <input type="hidden" name="_method" value="PUT"/>
         <input type="submit" value="PUT">
     </form>
     <form action="springmvc/testRestDelete/1" method="post">
         <input type="hidden" name="_method" value="DELETE"/>
         <input type="submit" value="DELETE">
     </form>
     <a href="springmvc/testRequestParam?username=atguigu&age=11">RequestParam</a>
     <table class="table">
         <thead>
            <tr>
                <th scope="col">Cookie</th>
                <th scope="col">ServletAPI</th>
                <th scope="col">ModelAndView</th>
                <th scope="col">Map</th>
                <th scope="col">SessionAttributes</th>
            </tr>
         </thead>
         <tbody>
            <tr>
                <td><a href="springmvc/testCookieValue">CookieValue</a></td>
                <td><a href="springmvc/testServletAPI">ServletAPI</a></td>
                <td><a href="springmvc/testModelAndView">ModelAndView</a></td>
                <td><a href="springmvc/testMap">Map</a></td>
                <td><a href="springmvc/testSessionAttributes">SessionAttributes</a></td>
            </tr>
         </tbody>
     </table>
     <form action="springmvc/testPojo" method="post">
         username: <input type="text" name="username"/><br>
         <%--password: <input type="password" name="password"/><br>--%>
         email: <input type="text" name="email"/><br>
         age: <input type="text" name="age"/><br>
         province: <input type="text" name="address.province"/><br>
         city: <input type="text" name="address.city"/><br>
         <input type="submit" value="submit">
     </form>
     <form action="springmvc/testModelAttribute" method="post">
         <input type="hidden" name="id" value="1"/><br>
         name: <input type="text" name="name" value="Tom"/><br>
         email: <input type="text" name="email" value="tom@gmail.com"/><br>
         age: <input type="text" name="age" value="23"/><br>
         <input type="submit" value="submit">
     </form>
 </div>
</body>
</html>
