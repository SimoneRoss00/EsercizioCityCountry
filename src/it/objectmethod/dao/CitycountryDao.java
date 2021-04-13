package it.objectmethod.dao;

import java.util.List;

import it.objectmethod.model.City;
import it.objectmethod.model.Continent;
import it.objectmethod.model.Country;

public interface CitycountryDao {

	public City infoCity(String name);
	
	public List<Country> infoCountry(String name, String continent );
	public List<Continent> allContinent();
	public List<Country> viewCountry(String name);
	public List<City> viewCity(String cname);
}
