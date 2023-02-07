package org.jpa.demo.Hibername;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="Employee_Login")
public class Elogin {
	
	@Id
	@Column(name="Employee_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Employee_UserName", nullable = false)
	private String name;
	
	@Column (name="Employee_Password", nullable = false)
	private String password;
	
	@Column (name="Employee_Date")  // No need to fill this part you want to set black values
	private LocalDate Date;
	
	
	
	
	@Override
	public String toString() {
		return "Elogin [id=" + id + ", name=" + name + ", password=" + password + ", Date=" + Date + "]";
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
