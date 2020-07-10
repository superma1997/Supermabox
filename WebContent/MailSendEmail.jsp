<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="teacupcss/Mailcss/TCEmailstyle.css"/>
</head>
<body>
    
    <div class="formbody">
    
    <div class="formtitle"><span>TeaCup邮箱</span></div>
    
    <form id="frm1">
    <ul class="forminfo">
    <li><label>标题</label><input name="title" type="text" class="dfinput" value=""/><i>标题不能超过30个字</i></li>
    <li><label>发件人</label><input name="sName" type="text" class="dfinput" value=""/></li>
    <li><label>收件人</label><input name="rName" type="text" class="dfinput" value="" /></li>
    <li><label>文章正文</label><textarea name="text" cols="" rows="" class="textinput" ></textarea></li>
    <li><label>&nbsp;</label><input name="" type="button"  style="background-color: deepskyblue" class="btn" value="确认发送" onclick="send()"/>
    <li><label>&nbsp;</label><input name="" type="button"  style="background-color: deepskyblue" class="btn" value="保存"onclick="save()"/>	
    </li>
    </ul>
    </form>
    </div>
		<script>
		   function send(){
			   
			   var f=document.getElementById("frm1");
			   f.action="msend";
			   f.method="get";
			   f.submit();
			   
		   }
		   
  function save(){
			   
			   var f=document.getElementById("frm1");
			   f.action="msend";
			   f.method="post";
			   f.submit();
			   
		   }
		
		</script>

	</body>
</html>