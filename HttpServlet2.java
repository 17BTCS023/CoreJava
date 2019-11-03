package p1.p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet2 extends HttpServlet1{

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		ServletContext context=getServletContext();
		String dburl=context.getInitParameter("dburl");
		String dbusername=context.getInitParameter("dbusername");
		String dbpassword=context.getInitParameter("dbpassword");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String s1="insert into login values(?,?)";
		try {
			Connection con=DriverManager.getConnection(dburl,dbusername,dbpassword);
			PreparedStatement ps=con.prepareStatement(s1);
			ps.setString(1,username);
			ps.setString(2,password);
			int result=ps.executeUpdate();
			if(result==1)
			{
		pw.println("<h2 style='color:green'>Dear "+username+" Your Registration Success</h2>");	
				
			}
			else
			{
				pw.println("<h2 style='color:red'>Registration Failed</h2>");
			}
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println(e);
			}
	}
	
}
