package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PathService;
import serviceImpl.PathServiceImpl;

import model.Path;
import model.Point;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetPathListByUserId
 */
@WebServlet("/GetPathListByUserId")
public class GetPathListByUserId extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* 设置响应头允许ajax跨域访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		String userId = request.getParameter("userId"); 
		PathService pathService = new PathServiceImpl();
		List<Path> paths = pathService.getPathListByUserId(userId);

		PrintWriter out = response.getWriter();

		Gson gson = new Gson();
		String str = gson.toJson(paths);
		out.print(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
