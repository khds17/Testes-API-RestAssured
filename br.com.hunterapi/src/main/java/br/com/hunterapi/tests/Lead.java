package br.com.hunterapi.tests;

public class Lead {

	private String email;
	private String first_name;
	private String last_name;
	private String position;
	private String company;
	private String company_industry;
	private String company_size;
	private Integer confidence_score;
	private String website;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany_industry() {
		return company_industry;
	}

	public void setCompany_industry(String company_industry) {
		this.company_industry = company_industry;
	}

	public String getCompany_size() {
		return company_size;
	}

	public void setCompany_size(String company_size) {
		this.company_size = company_size;
	}

	public Integer getConfidence_score() {
		return confidence_score;
	}

	public void setConfidence_score(Integer confidence_score) {
		this.confidence_score = confidence_score;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}
