package com.lok.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/dashboard")
public class MyWebServlet extends HttpServlet {

	private static final long serialVersionUID = -5122133875336740108L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/dashboard.jsp");
		 String name = request.getParameter("name");
		 if(name != null && name.equalsIgnoreCase("LOKESH")) {
			 response.sendRedirect(request.getContextPath() + "/welcome");
		 } else {
			 dispatcher.forward(request, response);
		 }
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
