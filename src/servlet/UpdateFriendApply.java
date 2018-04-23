package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FriendApply;
import service.FriendApplyService;
import serviceImpl.FriendApplyServiceImpl;

/**
 * Servlet implementation class UpdateFriendApply
 */
@WebServlet("/UpdateFriendApply")
public class UpdateFriendApply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String senderId = request.getParameter("applyerId");
		String receiverId = request.getParameter("userId");
		String statue = request.getParameter("statue");
		
		System.out.println(statue);
		FriendApplyService friendApplyService=new FriendApplyServiceImpl();
		FriendApply friendApply = new FriendApply(senderId, receiverId, statue);
		Boolean isOk = friendApplyService.updateFriendApply(friendApply);
		
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
