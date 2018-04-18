<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="UTF-8">
		<title>修改分类</title>
		<link href="css/font-awesome.min.css" rel="stylesheet" />
		<style>
			body{
				padding: 0 0 0 0;
			}
			table{
				text-align: center;
			}
			tr{
				
			}
			td,th{
				border:1px solid #dddddd;
				width: 200px;
				height: 30px;
			}
			.button{
				width: 48%;
				background-color: #007AFF;
				height: 100%;
			}
			.out i{
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
			<div class="out" style="width: 82%;float: right;line-height: 55px;background-color: #4CD964;">
				<i style="margin-left: 20px;font-size:20px" class="fa fa-bars"></i>
				<a style="float: right;margin-right: 30px;" href="login.jsp"><i class="fa fa-sign-out fa-fw"></i>退出登录</a>
			</div>
			
		</div>
		<div style="width: 100%;height: 600px;">
			<div class="out" style="float: left;width: 18%;height: 100%;background-color: #3e3e3e;text-align: center;color: #b8b8b8;">
				<div id="father0" class="father" style="width: 100%;height: 55px;line-height: 55px;border: 1px solid #464646;">
					<span style="float: left;margin-left: 5%;">
						<i id="angle1" class="fa fa-cubes"></i>
					</span>
					分类管理
					<span style="float: right;margin-right: 5%;">
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
				
				<div style="width: 94%;margin-left: 3%;margin-top: 30px;">
					<span style="font-size: 35px;">表单页</span>
					<span style="font-size: 20px;color: #7e7e7e;margin-left: 25px;">分类数据表</span>
					
					<div style="width: 100%;height: 40px;line-height:40px;margin-top: 30px;padding-left: 10px;background-color: #ffffff;">
						<a>分类管理</a> / <span style="color: #777777;">修改分类</span>
					</div>
					
					<div style="width: 100%;height: 40px;margin-top: 30px;padding-left: 10px;padding-top: 30px;background-color: #ffffff;">
						<div style="width: 100%;">
							<div style="float: left;">
								<select style="height: 30px;width: 60px;">
									<option>5</option>
									<option>10</option>
									<option>15</option>
								</select>
								条记录/页
							</div>
							<div style="float: right;margin-right: 10px;">
								<i onclick="selectByName()" class="fa fa-search"></i>
								<input id="serinput" type="text" style="height: 25px;"/>
							</div>
						</div> 
					</div>
					
					<div style="width:100%;padding-left: 10px;background-color: #ffffff;">
						<table id="table"  cellspacing="0" >
							<tr><th>分类ID</th><th>分类名称</th><th>货架区域</th><th>品牌数量</th><th></th></tr>
						<!-- 	<tr><td>0001</td><td>洗漱用品</td><td>一区五架</td><td>331</td>
								<td>
									<input class="button" type="button" value="修改"/>
									<input class="button" type="button" value="删除"/>
								</td>
							</tr>
							<tr><td>0002</td><td>零食</td><td>一区六架</td><td>531</td>
								<td>
									<input class="button" type="button" value="修改"/>
									<input class="button" type="button" value="删除"/>
								</td>
							</tr>
							<tr><td>0003</td><td>服装</td><td>三区六架</td><td>343</td>
								<td>
									<input class="button" type="button" value="修改"/>
									<input class="button" type="button" value="删除"/>
								</td>
							</tr>
							<tr><td>0004</td><td>家电</td><td>四区二架</td><td>225</td>
								<td>
									<input class="button" type="button" value="修改"/>
									<input class="button" type="button" value="删除"/>
								</td>
							</tr>
							<tr><td>0005</td><td>果蔬</td><td>一区四架</td><td>56</td>
								<td>
									<input class="button" type="button" value="修改"/>
									<input class="button" type="button" value="删除"/>
								</td>
							</tr> -->
							
							<%--
							for(int i=0;i<fenlei.size();i++){
								out.print("<tr><td>"+fenlei.get(i).getId()+"</td><td>"+fenlei.get(i).getName()+"</td><td>"+fenlei.get(i).getArea()+"</td><td>"+fenlei.get(i).getCount()+"</td>");
								out.print("<td><input class=\"button\" type=\"button\" value=\"修改\"/><input class=\"button\" type=\"button\" value=\"删除\"/></td></tr>");
							}
							--%>
							
						</table>
						<div align="center">
							<input onclick="lastPage()" type="button" value="上一页"/>
							<input onclick="nextPage()" type="button" value="下一页"/>
						</div>
					
					</div>
					
					<div style="width: 100%;margin-top: 15px;padding-left: 10px;padding-top: 10px;background-color: #ffffff;">
						<div style="width: 100%;margin-bottom:10px">
							添加
						</div>
						<table  cellspacing="0" >
							<tr><th>分类ID</th><th>分类名称</th><th>货架区域</th><th>品牌数量</th><th></th></tr>
							<tr>
								<td>
									自动生成
								</td>
								<td>
									<input id="addname" type="text"/>
								</td>
								<td>
									<input id="addarea" type="text"/>
								</td>
								<td>
									<input id="addcount" type="text" disabled="disabled" value="0"/>
								</td>
								<td>
									<input onclick="add()" class="button" type="button" value="添加"/>
								</td>
							</tr>
						</table> 
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
		
		function deletefenlei(e){
			window.location.href="DeleteFenleiServlet?id="+e.id;
		}
		function updatefenlei(e){
			var brother=$("#"+e.id).parent().prev();
			var count=brother.children("input").val();
			brother=brother.prev();
			var area=brother.children("input").val();
			brother=brother.prev();
			var name=brother.children("input").val();
			window.location.href="UpdateFenleiServlet?id="+e.id+"&name="+name+"&area="+area+"&count="+count;
		}
		
		function selectByName(){
			$.ajax({url:"selectFenleiServlet?name="+$("#serinput").val(),success:function(result){
				var fenlei=JSON.parse(result);
				$("#table").empty();
				$("#table").append("<tr><th>分类ID</th><th>分类名称</th><th>货架区域</th><th>品牌数量</th><th></th></tr>");
				var str="";
				str+="<tr><td>"+fenlei.id+"</td><td><input type=\"text\" value="+fenlei.name+" /></td><td><input type=\"text\" value="+fenlei.area+" /></td><td><input type=\"text\" disabled=\"disabled\" value="+fenlei.count+" /></td><td><input id="+fenlei.id+" onclick=\"updatefenlei(this)\" class=\"button\" type=\"button\" value=\"修改\"/><input id="+fenlei.id+" onclick=\"deletefenlei(this)\" class=\"button\" type=\"button\" value=\"删除\"/></td></tr>";
				$("#table").append(str);
			}});
		}
		
		var currentPage=1;
		
		function getPage(){
			$.ajax({url:"selectAllFenleiServlet?page="+currentPage,success:function(result){
				var i=0;
				var fenlei=JSON.parse(result);
				$("#table").empty();
				$("#table").append("<tr><th>分类ID</th><th>分类名称</th><th>货架区域</th><th>品牌数量</th><th></th></tr>");
				var str="";
				for(i=0;i<fenlei.length;i++){
					str+="<tr><td>"+fenlei[i].id+"</td><td><input type=\"text\" value="+fenlei[i].name+" /></td><td><input type=\"text\" value="+fenlei[i].area+" /></td><td><input type=\"text\" disabled=\"disabled\" value="+fenlei[i].count+" /></td><td><input id="+fenlei[i].id+" onclick=\"updatefenlei(this)\" class=\"button\" type=\"button\" value=\"修改\"/><input id="+fenlei[i].id+" onclick=\"deletefenlei(this)\" class=\"button\" type=\"button\" value=\"删除\"/></td></tr>";
				}
				$("#table").append(str);
			}});
		}
		getPage();
			
		function nextPage(){
			currentPage++;
			getPage();
		}
		function lastPage(){
			if(currentPage==1)return;
			currentPage--;
			getPage();
		}
		function add(){
			$.ajax({url:"InsertFenleiServlet?name="+$("#addname").val()+"&area="+$("#addarea").val()+"&count="+$("#addcount").val(),success:function(result){
				alert("添加成功");
			}});
		}
	</script>
</html>