package p1.p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet1 extends GenericServlet
{

	@Override
	public void service(ServletRequest req,
			ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw=res.getWriter();
		Date d=new Date();
	pw.println("<h2 style='color:green'>Current Date and Time is "+d+"</h2>");
	pw.println("<h1>Welcome to generic servlet</h1>");
	}
	
}
