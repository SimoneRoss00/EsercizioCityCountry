package it.objectmethod.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CitycountryDao;
import it.objectmethod.dao.impl.CitycountryDaoImpl;


@WebServlet("/CitycountryServlet")
public class CitycountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			CitycountryDao ccd= new CitycountryDaoImpl();
			String cityName=request.getParameter("cityName");
			request.setAttribute("cityInfo", ccd.infoCity(cityName));
			request.getRequestDispatcher("pages/index.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
		
	}



}
