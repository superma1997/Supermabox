<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="teacupcss/Logincss/Loginstyles.css"/>
		<link rel="stylesheet" type="text/css" href="teacupcss/Logincss/Loginstyle.css"/>
		<link rel="stylesheet" type="text/css" href="teacupcss/Logincss/Loginfont-awesome.css"/>
	<script>
	function onSub(){
		if(document.getElementById("txtName").value==""){
			return false;
		}else{
			var f=document.getElementById("frm1");
			f.action="ls/login";
			f.method="post";
			f.submit();
			
		}
	}
	</script>
</head>
<body style="background-color:#333">
		<div id="b04">
		<div id="wrapper">
	<h1 style="margin-bottom: 30px;">TeaCup Office</h1>
	<div id="slider-wrap">
	  <ul id="slider">
		 <li style="background-color: rgba(7,4,0,0.2)">
			<div>
				<h3>马云飞</h3>
				<span>Ma YunFei</span>
			</div> <div id="cao"><img src="images/1111.jpg" />
			</br><h4>帅气的小哥哥</h4></br>
				<p>hahahahahahahhahahhahahhahahh</p>
				sadasdasdasdasdaddsadasdsad</br>
			</div>
		 </li>
		 
		 <li style="background-color: rgba(7,4,0,0.2)">
			<div>
				<h3>马云飞</h3>
				<span>Ma YunFei</span>
			</div> <div id="cao"><img src="images/1111.jpg" />
			</br><h4>帅气的小哥哥</h4></br>
				<p>hahahahahahahhahahhahahhahahh</p>
				sadasdasdasdasdaddsadasdsad</br>
			</div>
		 </li>
		 
		 <li style="background-color: rgba(7,4,0,0.2)">
			<div>
				<h3>马云飞</h3>
				<span>Ma YunFei</span>
			</div> <div id="cao"><img src="images/1111.jpg" />
			</br><h4>帅气的小哥哥</h4></br>
				<p>hahahahahahahhahahhahahhahahh</p>
				sadasdasdasdasdaddsadasdsad</br>
			</div>
		 </li>
		 <li style="background-color: rgba(7,4,0,0.2)">
			<div>
				<h3>马云飞</h3>
				<span>Ma YunFei</span>
			</div> <div id="cao"><img src="images/1111.jpg" />
			</br><h4>帅气的小哥哥</h4></br>
				<p>hahahahahahahhahahhahahhahahh</p>
				sadasdasdasdasdaddsadasdsad</br>
			</div>
		 </li>
		 <li style="background-color: rgba(7,4,0,0.2)">
			<div>
				<h3>马云飞</h3>
				<span>Ma YunFei</span>
			</div> <div id="cao"><img src="images/1111.jpg" />
			</br><h4>帅气的小哥哥</h4></br>
				<p>hahahahahahahhahahhahahhahahh</p>
				sadasdasdasdasdaddsadasdsad</br>
			</div>
		 </li>
		 
	  </ul>
	  
	   <!--controls-->
	  <div class="btns" id="next"><i class="fa fa-arrow-right"></i></div>
	  <div class="btns" id="previous"><i class="fa fa-arrow-left"></i></div>
	  <div id="counter"></div>
	  
	  <div id="pagination-wrap">
		<ul>
		</ul>
	  </div>
	  <!--controls-->  
			 
	</div>
</div></div><script src="teacupjs/Loginjs/jquery.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="teacupjs/Loginjs/slide.js" type="text/javascript" charset="utf-8"></script>
    

		<div class="main">
		<div class='login'>
  <div class='login_title'>
	<span>账号登录</span>
  </div>
  <div class='login_fields'>
	<div class='login_fields__user'>
	  <div class='icon'>
		<img src='images/user_icon_copy.png'>
	  </div>
	  <form id="frm1">
	  <input placeholder='用户名' type='text' id="txtName" name="txtName">
		<div class='validation'>
		  <img src='images/tick.png'>
		</div>
	  </input>
	</div>
	<div class='login_fields__password'>
	  <div class='icon'>
		<img src='images/lock_icon_copy.png'>
	  </div>
	  <input placeholder='密码' type='password' name="txtPwd">
	  <div class='validation'>
		<img src='images/tick.png'>
	  </div>
	</div>
	<div class='login_fields__submit'>
	  <a  href="main.html"><input type='button' value='登录' onclick="onSub()"></a>&nbsp;
	  <input type='reset' value='注销'>
	  <div class='forgot'>
		<a href='#'>忘记密码?</a>
	  </div>
	</div>
	</form>
  </div>
		</div>
		</div>
		<%session.getAttribute("name"); %>
		<%session.getAttribute("role"); %>
	</body>
	
</html>