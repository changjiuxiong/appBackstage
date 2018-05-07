package servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import model.User;

import service.UserService;
import serviceImpl.UserServiceImpl;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/UploadHeadImg")
@MultipartConfig
// 标识Servlet支持文件上传
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		Collection<Part> parts = request.getParts();// 获得表单数据，每个表单字段为parts类型
		PrintWriter out = response.getWriter();
		
		if (parts.size() == 2) {// 两个字段
			Part userId = request.getPart("userId");// 获得userId字段
			Part upload = request.getPart("upload");// 获得upload字段，这是上传的文件
			InputStream userId1 = userId.getInputStream();// 获得token字段输入流，如果为字符串转为字符串即可
			byte[] b = new byte[userId1.available()];
			userId1.read(b);
			String userId2 = new String(b);
			System.out.println(userId2);// 输出上传的userId

			String pathShort = "/img/" + userId2 + "_headImg.jpg";

			String path = request.getServletContext().getRealPath(pathShort);// 保存的文件路径

			System.out.println(path);
			upload.write(path);// 把文件写入到目录
			
			User user = new User(userId2,"","",0,pathShort,"","");
			UserService userService = new UserServiceImpl();
			boolean isOk = userService.updateUserHeadImg(user);
			
			if(isOk){
				out.print(pathShort);
			}else{
				out.print("头像上传失败");
			}
			
		} else {
			System.out.println("参数错误");
			out.print("参数错误");
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
