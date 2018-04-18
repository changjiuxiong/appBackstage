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
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;


import service.UserService;
import serviceImpl.UserServiceImpl;
import model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		List<User> users=new ArrayList<User>();
		UserService userService=new UserServiceImpl();
		users=userService.selectAll();
		PrintWriter out=response.getWriter();
		
		Gson gson =new Gson();
	    String str=gson.toJson(users);
	    /*
		String str="[";
		for(int i=0;i<users.size();i++){
			if(i!=0){
				str+=",";
			}
			str+="{\"id\":\""+users.get(i).getId()+"\",\"name\":\""+users.get(i).getName()+"\",\"sex\":\""+users.get(i).getSex()+"\",\"age\":\""+users.get(i).getAge()+"\"}";
		}
		str+="]";
		System.out.println(str);
		*/
		out.print(str);
		
		//out.print("[{\"id\":\"001\",\"name\":\"李长久\",\"sex\":\"��\",\"age\":\"23\"},{\"id\":\"001\",\"name\":\"����ʤ\",\"sex\":\"��\",\"age\":\"21\"}]");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
