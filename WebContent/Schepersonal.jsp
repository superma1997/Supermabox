<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.tc.pojo.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>日程</title>
</head>
<style>
  form{
         border:none;
       }
</style>
<link rel="stylesheet" href="css/bootstrap.css" />

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>


<body>
	<% 
 //获取请求中的数据
	PersonalSchedule ps=(PersonalSchedule)request.getAttribute("per"); 
%>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">日程栏</h3>
		</div>
			
		<div class="panel-body" style="height: 650px;">
			<form action="scheselect?method=scheselect" method="post" style="margin:0px;display:inline;">
			<button type="submit" class="btn btn-primary btn-lg">
 	 <span></span> 查看日程
</button></form>

			<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2">
 	 <span></span> 添加日程
</button>
			<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal3" id="identifier">
 	 <span></span> 日程进度
</button>

		</div>
		<div class="container" style="margin-top: -600px; margin-right: 250px;">
			<h1>日程表</h1>
			<table class="table">
				<thead>
					<tr>
						<th>序号</th>
						<th>发布时间</th>
						<th>主题</th>
						<th>类型</th>
						<th>内容</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					
<c:forEach var="per" items="${pers}">

     <tr>
	      <td>${per.pid}</td>
	      <td>${per.date}</td>
	      <td>${per.title}</td>
	      <td>${per.ptype}</td>
	       <td>${per.notes}</td>
	      <td><button class="btn btn-primary btn-sm edit_btn" data-toggle="modal" data-target="#myModal1" >
								<span class="glyphicon glyphicon-pencil">编辑</span>
							</button>
		                    <button class="btn btn-danger btn-sm delete_btn"  href="#" onclick="del(${per.pid})">
								<span class="glyphicon glyphicon-trash">删除</span>
							</button>
					
						</td>
	    
      </tr>
</c:forEach>					
				</tbody>
			</table> 
			<div>
		
			<div/>
		</div>
		
c</div>
</form>
	<!--编辑当前日程-->
<form style="margin:0px;display:inline;">
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</br>
					 <h2>修改便笺</h2>
					 <br>
					 	
					 	<div class="form-group">
								<label class="col-sm-2 control-label">序号</label>
								<div class="col-sm-10">
									<input type="text" name="id" id="txtId" class="form-control"  />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">时间</label>
								<div class="col-sm-10">
									<input type="datetime-local" id="txtDate"  name="date"" class="form-control"  />
									<span class="help-block"></span>
								</div>
							</div>
								<div class="form-group">
								<label class="col-sm-2 control-label">主题</label>
								<div class="col-sm-10">
									<input type="text" name="title" id="txtTitle" class="form-control"  />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">类型</label>
								<div class="col-sm-10">
									<input type="text" name="type" id="txtType" class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">内容</label>
								<div class="col-sm-10">
									<input type="text" name="mess" id="txtMess" class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>
				
							  <div class="modal-footer">
               
                <button type="button" class="btn btn-default">提交修改</button>
                <button type="reset" class="btn btn-primary" >重置</button>
              
            </div>
							
					</div>
				</div>
			</div>
		</div>
	</div>
	<form/>
	<!--添加日程-->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</br>
					 <h2>添加一个日程</h2>
					 <br>
					 	<form>
					 	<div class="form-group">
								<label class="col-sm-2 control-label">序号</label>
								<div class="col-sm-10">
									<input type="text" name="empno" class="form-control" id="empno_add_input" placeholder="请输入主题">
									<span class="help-block"></span>
								</div>
							</div>
							
							<div class="form-group">
								<label class="col-sm-2 control-label">时间</label>
								<div class="col-sm-10">
									<input type="datetime-local" id="txtDate" name="sal" class="form-control" id="sal_add_input" placeholder="请输入时间">
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">主题</label>
								<div class="col-sm-10">
									<input type="text" name="empno" class="form-control" id="empno_add_input" placeholder="请输入主题">
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">类型</label>
								<div class="col-sm-10">
									<input type="text" name="job" class="form-control" id="job_add_input" placeholder="请输入类型">
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">内容</label>
								<div class="col-sm-10">
									<input type="text" name="job" class="form-control" id="job_add_input" placeholder="请输入内容">
									<span class="help-block"></span>
								</div>
							</div>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--进度模态框-->
	<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</br>
					 <h2>每日每月每年我们都在做日程！</h2>
					 <br>
					自我催眠：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 90%;">
							<span class="sr-only">90% 完成（成功）</span>
						</div>
					</div>
					事业：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
							<span class="sr-only">30% 完成（信息）</span>
						</div>
					</div>
					人际：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 20%;">
							<span class="sr-only">20% 完成（警告）</span>
						</div>
					</div>
					恋爱：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 10%;">
							<span class="sr-only">10% 完成（危险）</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
 <script>
    
    
    <!--删除的功能-->
         function del(id){
        	  if(confirm("确认删除吗?")){
        		 window.location="scheselect?method=schedelete&id="+id;
        		 alert("删除成功！");
        	  }else{
        		  return false;
        	  }
    
         }

	
</script>
<!-- json数据 -->>
<script>

function del(){
	
}
var xmlhttp;
function dell(id){
//兼容性写法创建请求实例,IE5 6支持else里面的方法
if (window.XMLHttpRequest){
xmlhttp = new XMLHttpRequest();
}else {
xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
}
//设置传送方式,地址,以及同步还是异步
xmlhttp.open("POST","scheselect",true);
xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");//状态改变的时候执行这个函数,用来判断是否请求完毕
xmlhttp.send("id="+id);//请求服务器
alert("删除成功");

}
</script>
	
</body>

</html>