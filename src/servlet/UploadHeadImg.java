package servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class UploadHeadImg
 */
@WebServlet("/UploadHeadImg")
public class UploadHeadImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext sc;
	private String uploadDir = "downloads";

	@Override
	public void init(ServletConfig config) {
		sc = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* 设置响应头允许ajax跨域访问 */
		response.setHeader("Access-Control-Allow-Origin", "*");
		/* 星号表示所有的异域请求都可以接受， */
		response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		/*
		 * String imgDatas = request.getParameter("imgDatas");
		 * System.out.println(imgDatas);
		 */

		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		try {
			List items = upload.parseRequest(request);
			Iterator itr = items.iterator();
			while (itr.hasNext()) {
				FileItem item = (FileItem) itr.next();
				if (item.isFormField()) {
					System.out.println("表单参数名：" + item.getFieldName()
							+ ",表单参数值：" + item.getString("UTF-8"));
				} else {
					if (item.getName() != null && !item.getName().equals("")) {
						System.out.println("上传文件的大小：" + item.getSize());
						System.out.println("文件的类型：" + item.getContentType());
						System.out.println("上传文件的名称：" + item.getName());// 返回上传文件在客户端的完整路径名称

						File file = new File(sc.getRealPath("/")
								+ File.separatorChar + uploadDir
								+ File.separatorChar + item.getName());
						item.write(file);
					} else {
						response.getWriter().println("没有选择文件");
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().println("上传文件失败");
		}

		response.getWriter().println("Ok");
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
