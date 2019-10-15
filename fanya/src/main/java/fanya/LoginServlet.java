package fanya;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet implements javax.servlet.Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest rq = (HttpServletRequest) req;
		HttpServletResponse rs = (HttpServletResponse) res;
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		String name = request.getParameter("name");//取得用户名
		String password = request.getParameter("password");//取得密码
		
		DBUtil db = new DBUtil();//构建数据库对象
		
		boolean canLogin = db.loginSuccess(name, password);
		
		if(canLogin) {
			response.sendRedirect("validate.jsp");	
		}else {
			response.sendRedirect("back.jsp");
		}
	}

}
