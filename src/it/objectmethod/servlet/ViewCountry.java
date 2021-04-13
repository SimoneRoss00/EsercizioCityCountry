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

@WebServlet("/ViewCountry")
public class ViewCountry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CitycountryDao ccd = new CitycountryDaoImpl();
		List<Country> l = new ArrayList<Country>();
		l = ccd.viewCountry(request.getParameter("value"));
		request.setAttribute("countryView", l);
		request.getRequestDispatcher("pages/countrycontinent.jsp").forward(request, response);

	}

}
