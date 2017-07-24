package example.library.vo;

import java.io.Serializable;

public class Author implements Serializable {

	private String name;
	
	private String lastName;
	
	private String nationality;

	public Author(String name, String lastName, String nationality) {
		this.setName(name);
		this.setLastName(lastName);
		this.setNationality(nationality);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
