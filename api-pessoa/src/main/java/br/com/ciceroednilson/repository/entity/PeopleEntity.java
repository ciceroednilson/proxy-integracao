package br.com.ciceroednilson.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_pessoa")
@Entity
public class PeopleEntity {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name =  "id_pessoa")
	private int id;
	  
	@Column(name =  "ds_nome")
	private String name;
	  
	@Column(name =  "fl_sexo")
	private String gender;
	  
	@Column(name =  "dt_nascimento")
	private java.sql.Date birthDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public java.sql.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.sql.Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
