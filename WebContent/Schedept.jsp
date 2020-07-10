<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>日程</title>
</head>
<link rel="stylesheet" href="css/bootstrap.css" />

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>


<body>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3 class="panel-title">日程栏</h3>
		</div>
		<div class="panel-body" style="height: 650px;">
			<button type="button" class="btn btn-primary btn-lg">
 	 <span></span> 查看日程
</button>
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
						<th>近期主题</th>
						<th>发布时间</th>
						<th>内容</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>001</td>
						<td>Rammohan </td>
						<td>Reddy</td>
						<td></td>
						
						<td><button class="btn btn-primary btn-sm edit_btn" data-toggle="modal" data-target="#myModal1">
								<span class="glyphicon glyphicon-pencil">编辑</span>
							</button>

		                    <button class="btn btn-danger btn-sm delete_btn" onclick="lclose()">
								<span class="glyphicon glyphicon-trash">删除</span>
							</button>
						</td>
					</tr>
					<tr>
						<td>002</td>
						<td>Smita</td>
						<td>Pallod</td>
						<td></td>
						<td>
							<button class="btn btn-primary btn-sm edit_btn" data-toggle="modal" data-target="#myModal1">
								<span class="glyphicon glyphicon-pencil">编辑</span>
							</button>

		                    <button class="btn btn-danger btn-sm delete_btn" onclick="jump()">
								<span class="glyphicon glyphicon-trash">删除</span>
							</button>
						</td>
					</tr>
				
					
				</tbody>
			</table>
		</div>
</div>
	<!--编辑当前日程-->
<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</br>
					 <h2>修改便笺</h2>
					 <br>
					 	<form>
					<div class="form-group">
								<label class="col-sm-2 control-label">主题</label>
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
							  <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">提交更改</button>
            </div>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	
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
								<label class="col-sm-2 control-label">部门序号</label>
								<div class="col-sm-10">
									<input type="text" name="empno" class="form-control" id="empno_add_input" placeholder="请输入主题">
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
								<label class="col-sm-2 control-label">时间</label>
								<div class="col-sm-10">
									<input type="datetime-local" id="txtDate" name="sal" class="form-control" id="sal_add_input" placeholder="请输入时间">
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
					项目组1进度：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 20%;">
							<span class="sr-only">20%完成（成功）</span>
						</div>
					</div>
					项目组2进度：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
							<span class="sr-only">30% 完成（信息）</span>
						</div>
					</div>
					项目组3进度：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 20%;">
							<span class="sr-only">20% 完成（警告）</span>
						</div>
					</div>
					项目组4进度：<div class="progress progress-striped">
						<div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 10%;">
							<span class="sr-only">10% 完成（危险）</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
	<script type="text/javascript">
	function lclose(){
				if(confirm("删除?")){
				    
				}else{
					
				}
			}
	
</script>
	
</body>

</html>