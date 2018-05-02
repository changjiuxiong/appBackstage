package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Group;
import model.Path;
import service.GroupService;
import service.PathService;
import serviceImpl.PathServiceImpl;
import util.IdUtil;

/**
 * Servlet implementation class AddPath
 */
@WebServlet("/AddPath")
public class AddPath extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		String id = IdUtil.getId();
		String userId = request.getParameter("userId");
				
		PathService pathService = new PathServiceImpl();
		Path path = new Path(id, userId, "");
		boolean isOk = pathService.addPath(path);
		
		PrintWriter out=response.getWriter();	
		if(isOk){
			out.print(id);
		}else{
			out.print("新建轨迹失败");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
