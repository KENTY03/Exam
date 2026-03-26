package beauty;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns= {"/beauty/insert"})
public class Insert extends HttpServlet {
	public void doPost(
		HttpServletRequest request,HttpServletResponse response
	) throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();
			
			String login=request.getParameter("login");
			String password=request.getParameter("password");
			
			PreparedStatement st=con.prepareStatement(
					"insert into customer(login,password) values(?,?)");
			st.setString(1, login);
			st.setString(2, password);
			int line=st.executeUpdate();
			
			if (line>0) {
				request.getRequestDispatcher("insert-success.jsp")
					.include(request, response);
				
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		
		Page.footer(out);
	}
}