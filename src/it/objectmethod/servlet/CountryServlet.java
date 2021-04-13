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
import it.objectmethod.model.Country;

@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			CitycountryDao ccd = new CitycountryDaoImpl();
			String countryName = request.getParameter("countryName");
			String continentName = request.getParameter("continentName");
			List<Country> l = new ArrayList<Country>();
			l = ccd.infoCountry(countryName, continentName);
			request.setAttribute("countryInfo", l);
			request.getRequestDispatcher("pages/country.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}

	}

}
