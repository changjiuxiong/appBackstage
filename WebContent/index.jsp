<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="UTF-8">
		<title>主页</title>
		<link href="css/font-awesome.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="css/mui.min.css">
		<style type="text/css">
			i{
				 margin-top:17px;
			}
		</style>
		<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
	</head>
	<body>
		<div style="width: 100%;height: 55px;">
			<div onclick="window.location.href='index.jsp'" style="float: left;width: 18%;height: 100%;line-height:55px;background-color: #f36a5a;text-align: center;color: white;font-size: 25px;">
				<b>超市管理系统</b>
			</div>
			<div style="width: 82%;float: right;line-height: 55px;background-color: #4CD964;">
				<i style="margin-left: 20px;font-size:20px" class="fa fa-bars"></i>
				<span style="float: right;">${sessionScope.username }<span>
				<a style="float: right;margin-right: 30px;" href="login.jsp"><i class="fa fa-sign-out fa-fw"></i>退出登录</a>
			</div>
			
		</div>
		<div style="width: 100%;height: 600px;">
			<div style="float: left;width: 18%;height: 100%;background-color: #3e3e3e;text-align: center;color: #b8b8b8;">
				<div id="father0" class="father" style="width: 100%;height: 55px;line-height: 55px;border: 1px solid #464646;">
					<span style="float: left;margin-left: 5%; ">
						<i id="angle1" class="fa fa-cubes"></i>
					</span>
					分类管理
					<span style="float: right;margin-right: 5%; ">
						<i id="angle1" class="fa fa-angle-left"></i>
						<i style="display: none;" id="angle1" class="fa fa-angle-down"></i>
					</span>
				</div>
				<div class="bigson" id="son0" style="width: 100%;display: none;">
					<div onclick="window.location.href='showFenlei.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">添加分类</div>
					<div onclick="window.location.href='showFenlei.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">修改分类</div>
				</div>
				
				<div id="father1" class="father" style="width: 100%;height: 55px;line-height: 55px;border: 1px solid #464646;">
					<span style="float: left;margin-left: 5%; ">
						<i id="angle1" class="fa fa-cube"></i>
					</span>
					商品管理
					<span style="float: right;margin-right: 5%; ">
						<i id="angle1" class="fa fa-angle-left"></i>
						<i style="display: none;" id="angle1" class="fa fa-angle-down"></i>
					</span>
				</div>
				<div class="bigson" id="son1" style="width: 100%;display: none;">
					<div onclick="window.location.href='showGoods.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">添加商品</div>
					<div onclick="window.location.href='showGoods.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">修改商品</div>
				</div>
				
				<div id="father2" class="father" style="width: 100%;height: 55px;line-height: 55px;border: 1px solid #464646;">
					<span style="float: left;margin-left: 5%; ">
						<i id="angle1" class="fa fa-address-book"></i>
					</span>
					供货商管理
					<span style="float: right;margin-right: 5%; ">
						<i id="angle1" class="fa fa-angle-left"></i>
						<i style="display: none;" id="angle1" class="fa fa-angle-down"></i>
					</span>
				</div>
				<div class="bigson" id="son2" style="width: 100%;display: none;">
					<div onclick="window.location.href='showShang.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">添加供货商</div>
					<div onclick="window.location.href='showShang.jsp'" class="son" style="width: 100%;height: 45px;line-height: 45px;background-color: #131212;">修改供货商</div>
				</div>
				<div onclick="window.location.href='showCaozuo.jsp'" id="father3" class="father" style="width: 100%;height: 55px;line-height: 55px;border: 1px solid #464646;">
					<span style="float: left;margin-left: 5%; ">
						<i id="angle1" class="fa fa-book"></i>
					</span>
					操作记录
				</div>
			</div>
			<div style="float: left;width: 82%;height: 100%;background-color: #ededed;">
				<div style="width: 80%;margin-left: 10%; height: 50px;line-height:50px;background-color: #EF8800;padding-left: 10px;font-size: 20px;">
						<i class="fa fa-signal"></i>
						销量排行榜
				</div>
				<div style="width: 35%;margin: 5% 0 0 10%;float: left;" id="slider1" class="mui-slider">
					<div style="width: 100%; height: 50px;line-height:50px;background-color: #EF4300;padding-left: 10px;font-size: 20px;">
						<i class="fa fa-shopping-basket"></i>
						生活用品
					</div>
					<div class="mui-slider-group mui-slider-loop">
						<!-- 额外增加的一个节点(循环轮播：第一个节点是最后一张轮播) -->
						<div class="mui-slider-item mui-slider-item-duplicate">
							<a href="#">
								<img src="images/捕获.PNG">
								<p class="mui-slider-title" >挤牙膏神器</p>
							</a>
						</div>
						<div class="mui-slider-item">
							<a href="#">
								<img src="images/捕获1.PNG">
								<p class="mui-slider-title">收纳盒</p>
							</a>
						</div>
						<div class="mui-slider-item">
							<a href="#">
								<img src="images/捕获2.PNG">
								<p class="mui-slider-title">usb hub</p>
							</a>
						</div>
						
						<!-- 额外增加的一个节点(循环轮播：最后一个节点是第一张轮播) -->
						<div class="mui-slider-item mui-slider-item-duplicate">
							<a href="#">
								<img src="images/捕获.PNG">
								<p class="mui-slider-title" >挤牙膏神器</p>
							</a>
						</div>
					</div>
					<div class="mui-slider-indicator mui-text-right">
						<div class="mui-indicator mui-active"></div>
						<div class="mui-indicator"></div>
						<div class="mui-indicator"></div>
						
					</div>
				</div>
				
				<div style="width: 35%;margin: 5% 0 0 10%;float: left;" id="slider2" class="mui-slider">
					<div style="width: 100%; height: 50px;line-height:50px;background-color: #EF4300;padding-left: 10px;font-size: 20px;">
						<i class="fa fa-apple"></i>
						食品
					</div>
					<div class="mui-slider-group mui-slider-loop">
						<!-- 额外增加的一个节点(循环轮播：第一个节点是最后一张轮播) -->
						<div class="mui-slider-item mui-slider-item-duplicate">
							<a href="#">
								<img src="images/捕获3.PNG">
								<p class="mui-slider-title" >三只松鼠</p>
							</a>
						</div>
						<div class="mui-slider-item">
							<a href="#">
								<img src="images/捕获4.PNG">
								<p class="mui-slider-title">辣酱鸭</p>
							</a>
						</div>
						<div class="mui-slider-item">
							<a href="#">
								<img src="images/捕获5.PNG">
								<p class="mui-slider-title">饼干</p>
							</a>
						</div>
						
						<!-- 额外增加的一个节点(循环轮播：最后一个节点是第一张轮播) -->
						<div class="mui-slider-item mui-slider-item-duplicate">
							<a href="#">
								<img src="images/捕获3.PNG">
								<p class="mui-slider-title" >三只松鼠</p>
							</a>
						</div>
					</div>
					<div class="mui-slider-indicator mui-text-right">
						<div class="mui-indicator mui-active"></div>
						<div class="mui-indicator"></div>
						<div class="mui-indicator"></div>
						
					</div>
				</div>
				
				
				
				
			</div>
			
	
		</div>
	</body>
	<script type="text/javascript" src="js/mui.min.js" ></script>
	<script>
		$(".father").each(function(index){
			$(".father").eq(index).hover(
				function(){
					$(".father").eq(index).css("background-color","#575757");
					$(".father").eq(index).css("color","#f36a5a");
				},
				function(){
					$(".father").eq(index).css("background-color","#3e3e3e");
					$(".father").eq(index).css("color","#b8b8b8");
				}
			);
			$(".father").eq(index).click(function(){
				$(".bigson").each(function(ind){
					if($(".bigson").eq(ind).attr("id")!="son"+index){
						$(".bigson").eq(ind).hide("800");
						$(".father").eq(ind).children("span").children(".fa-angle-down").hide();
						$(".father").eq(ind).children("span").children(".fa-angle-left").show();
					}
				});
				if($("#son"+index).css("display")=="none"){
					$(".father").eq(index).children("span").children(".fa-angle-left").hide();
					$(".father").eq(index).children("span").children(".fa-angle-down").show();
					
					$("#son"+index).show("800");
				}else{
					$(".father").eq(index).children("span").children(".fa-angle-down").hide();
					$(".father").eq(index).children("span").children(".fa-angle-left").show();
					$("#son"+index).hide("800");
				}
			});
		});
		$(".son").each(function(index){
			$(".son").eq(index).hover(
				function(){
					$(".son").eq(index).css("background-color","#575757");
					$(".son").eq(index).css("color","#f36a5a");
				},
				function(){
					$(".son").eq(index).css("background-color","#131212");
					$(".son").eq(index).css("color","#b8b8b8");
				}
			);
		});
		var slider = mui("#slider1");
		slider.slider({
			interval: 1000
		});
		slider = mui("#slider2");
		slider.slider({
			interval: 1000
		});
			
	</script>
</html>