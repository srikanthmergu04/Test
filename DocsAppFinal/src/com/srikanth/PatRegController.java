package com.srikanth;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatRegController
 */
@WebServlet("/PatRegController")
public class PatRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name = request.getParameter("name");
		String id = request.getParameter("id");
	//	System.out.println(name);
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String mobileno = request.getParameter("mobileno");
		String mailid = request.getParameter("mailid");
		String uname = request.getParameter("uname");
		String pid = request.getParameter("pid");
		
		//PatJBean pat = new PatJBean();
		
		ToDb t1 = new ToDb(id,name,age,gender,mobileno,mailid,uname,pid);
				
		try {
			t1.StoretoDb();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("RegSuccess.jsp");
        rd.forward(request,response);

		
	}

}
