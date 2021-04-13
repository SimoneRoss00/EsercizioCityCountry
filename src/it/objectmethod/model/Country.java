package it.objectmethod.model;

public class Country {
	
	private String code;
	private String name;
	private String Continent;
	private String Region;
	private int surfaceArea;
	private int indepYear;
	private int Population;
	private int lifeExpectancy;
	private int GNP;
	private int GNPOld;
	private String localName;
	private String govermentForm;
	private String headOfState;
	private int capital;
	private String code2;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String continent) {
		Continent = continent;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public int getSurfaceArea() {
		return surfaceArea;
	}
	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public int getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	public int getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(int lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public int getGNP() {
		return GNP;
	}
	public void setGNP(int gNP) {
		GNP = gNP;
	}
	public int getGNPOld() {
		return GNPOld;
	}
	public void setGNPOld(int gNPOld) {
		GNPOld = gNPOld;
	}
	public String getLocalName() {
		return localName;
	}
	public void setLocalName(String localName) {
		this.localName = localName;
	}
	public String getGovermentForm() {
		return govermentForm;
	}
	public void setGovermentForm(String govermentForm) {
		this.govermentForm = govermentForm;
	}
	public String getHeadOfState() {
		return headOfState;
	}
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	@Override
	public String toString() {
		String value="\n"+code+" "+name+" "+ Continent+" "+Population+surfaceArea+" "+"\n";
		return value;
	}
	
	
	
}
