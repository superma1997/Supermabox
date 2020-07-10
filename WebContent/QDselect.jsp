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
         <form action="ZCServlet" method="post">
          <h1>签到信息 <input type="submit" value="查询"></h1>
         </form>
     </div></center>
  
     <div class="container">
    
     <table class="table">
     <tr>
             <th>序号</th>
             <th>编号</th>
             <th>姓名</th>
             <th>日期</th> 
             <th>状态</th> 
              <th>PID</th>
             <th>操作</th>
         </tr>
     
        <% if(alist!=null){                    /* 解决首次访问为空，空指针问题 */
              for(int i=0;i<alist.size();i++){
         %>
         <tr>
             <td><%=i+1 %></td><!-- 序号 -->
             <td><%=alist.get(i).getId() %></td>
             <td><%=alist.get(i).getName() %></td>
             <td><%=alist.get(i).getMdate() %>  </td>
             <td><%=alist.get(i).getMstate() %> </td>
             <td><%=alist.get(i).getPid() %>  </td>
             
             <td>
					<%-- <button class="btn btn-primary btn-sm edit_btn" onclick="update(<%=alist.get(i).getId()%>)">
					<span class="glyphicon glyphicon-pencil">编辑</span>
					</button>
	 --%>
			        <button class="btn btn-danger btn-sm delete_btn" onclick="del(<%=alist.get(i).getPid()%>)">
					<span class="glyphicon glyphicon-trash">删除</span>
				    </button>
             </td>
         </tr>
         <%}}%>
     </table>
     </div>
     <script>
     function update(txtId){
    	 window.location.href="UpdateServlet?txtId="+txtId;
    	
    	 alert(txtId);
     }
      function del(pid){
        	 if(confirm("确认删除吗？")){
        		
        		 window.location="QDdelectServlet?pid="+pid;
        		 alert(mdate);
        		
        	 }else{
        		 return false;
        	 }
        	 
         }
      
      </script>
</body>
</html>