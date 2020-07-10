<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>编辑</title>
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<% 
Object id=request.getAttribute("strId");

%>
<div style="padding: 100px 100px 10px;">
	<form class="bs-example bs-example-form" role="form" action="UpdateServlet?id="+<%=id %> method="get">
		<div class="input-group">
			<span class="input-group-addon">序号</span>
			<input type="text" class="form-control" placeholder="不可更改" readonly>
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-addon">姓名</span>
			<input type="text" class="form-control" placeholder="*************" readonly>
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-addon">日期</span>
			<input type="text" class="form-control" name="date" placeholder="*************">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-addon">状态</span>
			<input type="text" class="form-control" name="state" placeholder="*************">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-addon">PID</span>
			<input type="text" class="form-control"  placeholder="*************" readonly>
		</div>
		<br>
		<div class="input-group">
		<input type="submit" class="form-control" value="提交" onclick="sel()"/>
		</div>
		</form>
		    <script language="javascript">  
      
           function sel(){  
      
           document.thisform.submit();  
      
            }  
      
           </script>  

</div>
<% String update=request.getParameter("update");%>
</body>

</html>