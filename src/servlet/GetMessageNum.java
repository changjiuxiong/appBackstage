package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ChatRecord;
import service.ChatRecordService;
import serviceImpl.ChatRecordServiceImpl;

/**
 * Servlet implementation class GetMessageNum
 */
@WebServlet("/GetMessageNum")
public class GetMessageNum extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String senderId = request.getParameter("senderId");
		String receiverId = request.getParameter("receiverId");
		
		ChatRecordService chatRecordService=new ChatRecordServiceImpl();
		int messageNum = chatRecordService.getMessageNum(senderId,receiverId);
		
		PrintWriter out=response.getWriter();
		out.print(messageNum);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
