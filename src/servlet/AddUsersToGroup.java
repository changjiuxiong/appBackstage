package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.GroupMemberService;
import serviceImpl.GroupMemberServiceImpl;

import com.google.gson.Gson;

import model.Friend;
import model.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



/**
 * Servlet implementation class AddUsersToGroup
 */
@WebServlet("/AddUsersToGroup")
public class AddUsersToGroup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		/*设置响应头允许ajax跨域访问*/  
		response.setHeader("Access-Control-Allow-Origin","*");  
		/*星号表示所有的异域请求都可以接受，*/  
		response.setHeader("Access-Control-Allow-Methods","GET,POST");  
		
		String groupId = request.getParameter("groupId");
		String str = request.getParameter("userIds");
		System.out.println(str);
        
		JSONArray jsonArray = JSONArray.fromString(str);
		List<String> userIds = new ArrayList<String>();
		for(int i=0 ; i < jsonArray.length() ;i++)
		{
		    //获取每一个JsonObject对象
			JSONObject myjObject = jsonArray.getJSONObject(i);
			userIds.add(myjObject.getString("id"));
		}
		GroupMemberService groupMemberServiceImpl = new GroupMemberServiceImpl();
		Boolean isOk = groupMemberServiceImpl.addUsersToGroup(groupId, userIds);
		
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
