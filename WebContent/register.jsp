<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8" />
		<title>欢迎注册</title>
		<link rel="stylesheet" type="text/css" href="css/regedit.css" />
		<script>
			function show(a){
				document.getElementById(a).style.display="block";
			}
			function hid(a){
				document.getElementById(a).style.display="none";
			}
			function getyan(e){
				this.src= document.location.protocol +'//authcode.jd.com/verify/image?a=0&amp;acid=6d112504-1450-4c5d-8192-22da0f563023&amp;uid=6d112504-1450-4c5d-8192-22da0f563023&amp;srcid=reg&amp;is=a4cff92ba569ae718c888e1fdd3a8460&amp;yys='+new Date().getTime();
			}
			
		</script>
	</head>
	<body>
		<div id="header">
			<div id="left">
				<img id="logoimg" src="img/捕获.PNG" />
			</div>
			<div id="span"><b>超市管理系统</b></div>
			<div id="right">
				<span id="have"><b>已有账号？</b></span>
				<a id="login" href="login.html" >请登录</a>
			</div>
		</div>
		<div id="bg">
		</div>
		<div id="middle">
			<div id="input">
			<form action="RegisterServlet" method="post">
				<div class="input">
					<div class="text">用户名</div>
					<div class="myinputdiv">
						<input name="username" class="myinput" type="text" placeholder="您的账户名和登录名" onfocus="show('name')" onblur="hid('name')"/>
					</div>
				</div>
				<div class="tips">
					<span id="name" class="tip">支持中文、字母、数字、“-”“_”的组合，4-20个字符</span>
				</div>
				<div class="input">
					<div class="text">设置密码</div>
					<div class="myinputdiv">
						<input name="password" class="myinput" type="text" placeholder="建议至少使用两种字符组合" onfocus="show('pws')" onblur="hid('pws')"/>
					</div>
				</div>
				<div class="tips">
					<span id="pws" class="tip">建议使用字母、数字和符号两种及以上的组合，6-20个字符</span>
				</div>
				<div class="input">
					<div class="text">确认密码</div>
					<div class="myinputdiv">
						<input class="myinput" type="text" placeholder="请再次输入密码" onfocus="show('cofpws')" onblur="hid('cofpws')"/>
					</div>
				</div>
				<div class="tips">
					<span id="cofpws" class="tip">请再次输入密码</span>
				</div>
				<div class="input">
					<div id="selectdiv" class="text">
						手机号码
					</div>
					<div class="myinputdiv">
						<input name="phone" class="myinput" type="text" placeholder="建议使用常用手机" onfocus="show('pho')" onblur="hid('pho')"/>
					</div>
				</div>
				<div class="tips">
					<span id="pho" class="tip">完成验证后，你可以用该手机登录和找回密码</span>
				</div>

				<div class="input">
					<input id="bt" type="submit" value="立即注册"/>
				</div>
			</form>
			</div>

		</div>
		
		<div id="footer">
			<div id="links">
		        <a href="//www.jd.com/intro/about.aspx"> 关于我们</a> |
		        <a href="//www.jd.com/contact/">联系我们</a> |
		        <a href="//zhaopin.jd.com/">人才招聘</a> |
		        <a href="//www.jd.com/contact/joinin.aspx">商家入驻</a> |
		        <a href="//www.jd.com/intro/service.aspx">广告服务</a> |
		        <a href="//app.jd.com/">手机京东</a> |
		        <a href="//club.jd.com/links.aspx">友情链接</a> |
		        <a href="//media.jd.com">销售联盟</a> |
		        <a href="//club.jd.com/" >京东社区</a> |
		        <a href="//gongyi.jd.com" >京东公益</a> |
		        <a href="//en.jd.com/">English Site</a>
    		</div>
		    <div id="copyright">
		        Copyright&copy;2004-2016&nbsp;&nbsp;超市管理系统&nbsp;版权所有
		    </div>
		</div>
	</body>
	<script>
		document.getElementById("yanimg").click();
	</script>
</html>