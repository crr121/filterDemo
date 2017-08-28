package com.zt.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zt.dao.LoginDAO;
import com.zt.entity.Login;
import com.zt.util.SystemUtil;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//重写dopost方法
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//设置编码
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		//获取参数
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		//调用DAO方法
		LoginDAO ld = new LoginDAO();
		Login login = new Login();
		login.setLogName(name);
		login.setLogPwd(pwd);
		try {
			Login user = ld.userLogin(login);
			//登陆成功重定向到index.jsp，否则到login.jsp
			//对查询的结果进行判断
			HttpSession session = req.getSession();
			if(user==null){
				//<%=request.getContextPath()%>
				//是为了解决相对路径的问题，可返回站点的根路径。
				session.setAttribute("msg", "您的输入有误！！！");
				resp.sendRedirect(req.getContextPath()+"/login.jsp");
			}else{
				session.setAttribute("user", user);
				resp.sendRedirect(req.getContextPath()+"/page/index.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
