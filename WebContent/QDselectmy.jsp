<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <!-- 导包 -->
<%@ page import="java.util.*" %>
<%@ page import="com.tc.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
       
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户</title>
        <link rel="stylesheet" href="teacupcss/Signcss/bootstrap.css" />
		<script type="text/javascript" src="teacupjs/Signjs/jquery-3.2.1.min.js" ></script>
		<script type="text/javascript" src="teacupjs/Signjs/bootstrap.min.js" ></script>

</head>
<body>
<%
  ArrayList<SignTCcheckwork> alist=(ArrayList<SignTCcheckwork>)request.getAttribute("select");

%>


   <center>  <div id="warp">
         <form action="SelectMyServlet" method="post">
          <h1>签到信息 <input type="submit" value="查询"></h1>
          
         </form>
     </div></center>
  
     <div class="container">
    
     <table class="table">
     <tr>
             <td>序号</td>
             <td>编号</td>
             <td>姓名</td>
             <td>日期</td> 
             <td>状态</td> 
             
         </tr>
     
        <% int id=2; if(alist!=null){                    /* 解决首次访问为空，空指针问题 */
              for(int i=0;i<alist.size();i++){
            	  if(alist.get(i).getId()==id){
         %>
         <tr>
             <td><%=i+1 %></td><!-- 序号 -->
             <td><%=alist.get(i).getId() %></td>
             <td><%=alist.get(i).getName() %></td>
             <td><%=alist.get(i).getMdate() %>  </td>
             <td><%=alist.get(i).getMstate() %> </td>
             <td>
              
                
             </td>
         </tr>
         <%}}}%>
     </table>
     </div>
</body>
</html>