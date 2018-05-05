package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PathPoint;
import model.Point;
import service.PathPointService;
import service.PointService;
import serviceImpl.PathPointServiceImpl;
import serviceImpl.PointServiceImpl;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetPointById
 */
@WebServlet("/GetPointById")
public class GetPointById extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* 设置响应头允许ajax跨域访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		String id = request.getParameter("id");

		PointService pointService = new PointServiceImpl();
		Point point = pointService.getPointById(id);

		PrintWriter out = response.getWriter();

		Gson gson = new Gson();
		String str = gson.toJson(point);
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
