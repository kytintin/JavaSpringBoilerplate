package com.entities;

import javax.persistence.*;


@Entity
@Table(name="users")
public class Users
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;

	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	public void setUsers(int id,String first_name,String last_name,String email)
	{
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getfirst_name()
	{
		return first_name;
	}
	
	public String getlast_name()
	{
		return last_name;
	}
	
	public String getEmail()
	{
		return email;
	}
}
