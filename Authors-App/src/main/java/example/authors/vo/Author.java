package example.authors.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Author")
public class Author implements Serializable {

	private String name;
	
	private String lastName;

	public Author(String name, String lastName) {
		this.setName(name);
		this.setLastName(lastName);
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
	
	
}
