package p1.p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServlet1 extends HttpServlet

{

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//res.setContentType("application/ms-word");
		
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	Date d=new Date();
	
	pw.println("<h2 style='color:red'>Current Date and Time is "+d+"</h2>");
	pw.println("<h1>Welcome to http servlet</h1>");
	
	ServletConfig cg=getServletConfig();
	
	String url=cg.getInitParameter("dburl");
	String username1=cg.getInitParameter("dbusername");
	String password1=cg.getInitParameter("dbpassword");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	String s1="select * from login where username=? and password=?";
	
	try 
	{
	Connection con=DriverManager.getConnection(url,username1,password1);
	PreparedStatement ps=con.prepareStatement(s1);
	ps.setString(1,username);
	ps.setString(2,password);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		pw.println("<h2 style='color:green'>Login Success</h2>");	
		pw.println("welcome "+username);	
	}
	else
	{
		pw.println("<h2 style='color:red'>login failed</h2>");
	}
	} catch (Exception e) {
		// TODO: handle exception
	System.out.println(e);
	}	
	}
	
}
