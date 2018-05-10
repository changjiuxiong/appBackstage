package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserPoint;
import service.UserPointService;
import serviceImpl.UserPointServiceImpl;

import com.google.gson.Gson;

/**
 * Servlet implementation class sendUserPoint
 */
@WebServlet("/sendUserPoint")
public class sendUserPoint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String userId = request.getParameter("userId");
		double lng = Double.parseDouble(request.getParameter("lng"));
		double lat = Double.parseDouble(request.getParameter("lat"));
		UserPoint userPoint = new UserPoint(userId, lng, lat);
		
		UserPointService userPointService=new UserPointServiceImpl();
		boolean isOk = userPointService.upDateUserPoint(userPoint);
		
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
