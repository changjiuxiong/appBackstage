package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FriendApply;
import model.Group;

import service.FriendApplyService;
import service.GroupService;
import serviceImpl.FriendApplyServiceImpl;
import serviceImpl.GroupServiceImpl;
import util.IdUtil;

/**
 * Servlet implementation class AddGroup
 */
@WebServlet("/AddGroup")
public class AddGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String id = request.getParameter("id");
		id = IdUtil.getId();
		String name = request.getParameter("name");
		String masterId = request.getParameter("masterId");
				
		GroupService groupService = new GroupServiceImpl();
		Group group = new Group(id, name, masterId,"img/defaultHead.jpg");
		Boolean isOk = groupService.addGroup(group);
		
		PrintWriter out=response.getWriter();	    
		out.print(isOk);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
