<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.tc.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="teacupcss/Mailcss/bootstrap.css">  
	<script type="text/javascript" src="teacupjs/Mailjs/jquery.min.js"></script>
	<script type="text/javascript" src="teacupjs/Mailjs/bootstrap.min.js"></script>
</head>
<body>
<%ArrayList<Email> alist=(ArrayList<Email>)request.getAttribute("email"); %>
<table class="table table-hover">

	<thead>
		<tr>
			<th>寄件人</th>
			<th>收件人</th>
			<th>时间</th>
			<th>状态</th>
			<th>标题</th>
			<th><button type="button" class="btn btn-success" onclick="b()">刷新</button></th>

		</tr>
	</thead>
	<tbody>
		    <% if(alist!=null){                    /* 解决首次访问为空，空指针问题 */
              for(int i=0;i<alist.size();i++){
            	  String a=null;
         %>
         <tr>
             <td><%=alist.get(i).getsName() %></td>
             <td><%=alist.get(i).getrName() %></td>
             <td><%=alist.get(i).getTime() %> </td>
              <td><%=alist.get(i).getState() %> </td>
             <td><%=alist.get(i).getTitle() %> </td>
            
             <td>

	<button type="button" class="btn btn-primary" title="Popover title"  
			data-container="body" data-toggle="popover" data-placement="top" 
			data-content="<%=alist.get(i).getText() %>" onmouseout="c(<%=alist.get(i).getId() %>)">
	查看内容
	</button>
               
               
<button type="button" class="btn btn-warning" onclick="a(<%=alist.get(i).getId() %>)">删除</button>
             </td>
         </tr>
         <%}}%>
	</tbody>
</table>
<script>
function a(id){
	 if(confirm("确认删除？")){
		 window.location="mdelete?method=shoujian&id="+id;
		 alert("删除成功");
	 }else{
		 return false;
	 }
	 }
	 
	 
function b(){
	window.location="shoujian";
}


function c(id){//由于我懒  直接进删除servlet里给一个新case了
	window.location="mdelete?method=state&id="+id;
}

$(function () { 
	$("[data-toggle='popover']").popover();
});
</script>

</body>
</html>