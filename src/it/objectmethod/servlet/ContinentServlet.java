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
import it.objectmethod.model.Continent;

@WebServlet("/ContinentServlet")
public class ContinentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Continent> list = new ArrayList<>();
		CitycountryDao cityDao = new CitycountryDaoImpl();
		list = cityDao.allContinent();
		request.setAttribute("allContinent", list);
		request.getRequestDispatcher("pages/continent.jsp").forward(request, response);
	}

}
