package it.objectmethod.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.objectmethod.dao.CitycountryDao;
import it.objectmethod.model.City;
import it.objectmethod.model.Continent;
import it.objectmethod.model.Country;
import it.objectmethod.utils.ConnectionUtils;

public class CitycountryDaoImpl implements CitycountryDao {

	@Override
	public City infoCity(String name) {
		City city = null;
		try {
			Connection conn = ConnectionUtils.getConnection();
			String sql = "SELECT * FROM city WHERE Name=?";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, name);

			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				city = new City();
				city.setIdCity(resultSet.getInt("ID"));
				city.setCountryCode(resultSet.getString("CountryCode"));
				city.setName(resultSet.getString("Name"));
				city.setDistrict(resultSet.getString("District"));
				city.setPopulation(resultSet.getInt("Population"));

			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return city;
	}

	@Override
	public List<Country> infoCountry(String name, String continent) {
		Country coun = null;
		List<Country> cl = new ArrayList<Country>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			String sql = "SELECT * FROM country WHERE ((''=? OR Name=?) AND Continent=?) OR (Name=? AND(''=? OR Continent=?))";
			PreparedStatement st = conn.prepareStatement(sql);

			st.setString(1, name);
			st.setString(2, name);
			st.setString(3, continent);
			st.setString(4, name);
			st.setString(5, continent);
			st.setString(6, continent);

			ResultSet resultSet = st.executeQuery();

			while (resultSet.next()) {
				coun = new Country();
				coun.setCode(resultSet.getString("Code"));
				coun.setName(resultSet.getString("Name"));
				coun.setContinent(resultSet.getString("Continent"));
				coun.setPopulation(resultSet.getInt("Population"));
				coun.setSurfaceArea(resultSet.getInt("SurfaceArea"));
				cl.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public List<Continent> allContinent() {
		Continent coun = null;
		List<Continent> cl = new ArrayList<>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			String sql = "SELECT Continent FROM country GROUP BY Continent";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				coun = new Continent();
				coun.setName(resultSet.getString("Continent"));
				cl.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cl;
	}

	@Override
	public List<Country> viewCountry(String code) {
		Country coun = null;
		List<Country> clist = new ArrayList<Country>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			String sql = "SELECT Code,Population FROM country WHERE Continent=?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,code);
			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				coun = new Country();
				coun.setCode(resultSet.getString("Code"));
				coun.setPopulation(resultSet.getInt("Population"));
				clist.add(coun);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clist;

	}
	
	@Override
	public List<City> viewCity(String cname) {
		City cit = null;
		List<City> citylist = new ArrayList<City>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			String sql = "Select c.Name ,c.Population FROM city c INNER JOIN country c2 ON c.CountryCode =c2.Code WHERE c2.Code =?";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,cname);
			ResultSet resultSet = st.executeQuery();
			while (resultSet.next()) {
				cit = new City();
				cit.setName(resultSet.getString("Name"));
				cit.setPopulation(resultSet.getInt("Population"));
				citylist.add(cit);
			}
			resultSet.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return citylist;

	}

}
