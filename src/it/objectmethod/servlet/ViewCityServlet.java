package it.objectmethod.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.objectmethod.dao.CitycountryDao;
import it.objectmethod.dao.impl.CitycountryDaoImpl;
import it.objectmethod.model.City;


@WebServlet("/ViewCityServlet")
public class ViewCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CitycountryDao ccd = new CitycountryDaoImpl();
		List<City> l = new ArrayList<City>();
		l = ccd.viewCity(request.getParameter("value"));
		request.setAttribute("allCity", l);
		request.getRequestDispatcher("pages/citycountry.jsp").forward(request, response);

	}


}
