package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.FriendService;
import service.UserService;
import serviceImpl.FriendServiceImpl;
import serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class IsFriend
 */
@WebServlet("/IsFriend")
public class IsFriend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String id1 = request.getParameter("id1");
		String id2 = request.getParameter("id2");
		
		FriendService friendService = new FriendServiceImpl();
		Boolean isOk = friendService.isFriend(id1, id2);
		
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
