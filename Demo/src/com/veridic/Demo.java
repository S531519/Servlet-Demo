package com.veridic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Demo
 */

public class Demo implements Servlet {
	ArrayList<Data> list = new ArrayList<Data>();

	/**
	 * Default constructor.
	 */
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		String a = "";
		list.add(new Data(name, email, address));
		for (Data d : list) {
			a += "  <tr style=\"text-align:center\">\n" + "    <td>" + d.getName1() + "</td>\n" + "    <td>"
					+ d.getEmail1() + "</td>\n" + "    <td>" + d.getAddress1() + "</td>\n" + "  </tr>\n";
		}

		pw.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
				+ "<title>Servlet Form</title>\n" + "</head>\n" + "<body>\n" + "<form action=\"form\">\n"
				+ "Enter Name:<input type=\"text\" name=\"name\"/>\n"
				+"<br>"
				+ "Enter Email:<input type=\"text\" name=\"email\"/>\n"
				+"<br>"
				+ "Enter Address:<input type=\"text\" name=\"address\"/>\n"
				+"<br>"
				+ "<input type=\"submit\" value=\"submit\" name=\"submit\"/>\n" + "<input type=\"reset\"/> \n"
				+ "</form>\n" + "</body>\n" + "</html>");

		if (name != null || email != null || address != null) {
			pw.println("<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<meta charset=\"UTF-8\">\n"
					+ "<title>Insert title here</title>\n" + "</head>\n" + "<body>\n"
					+ "<table border=\"1\" style=\"width:100%\">\n" + "  <tr>\n" + "    <th>Name</th>\n"
					+ "    <th>Email</th> \n" + "    <th>Address</th>\n" + "  </tr>\n" + a + "</table>" + "</html>");

		}

	}
}
