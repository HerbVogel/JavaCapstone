package com.herb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
@Entity
public class Permit {
	
private Long id;

@NotNull
@Min(01)
@Max(50)
private int spot_nbr;

@NotNull
@NotNull(message = "Name cannot be null")
@Size(min = 1, max = 45, message = "Last Name must be between 1 and 30 characters")
private String last_name;

@NotNull(message = "Name cannot be null")
@Size(min = 1, max = 45, message = "First Name must be between 1 and 30 characters")
private String first_name;

@NotNull
@Size(min = 1, max = 20, message = "Model must be between 1 and 30 characters")
private String car_model;

@NotNull
@Size(min = 1, max = 20, message = "Make must be between 1 and 30 characters")
private String car_make;

@NotNull
@Size(min = 1, max = 20, message = "Color must be between 1 and 30 characters")
private String car_color;

@NotNull
@Size(min = 1, max = 10, message = "Car Tag must be between 1 and 6 characters")
private String car_tag_nbr;

	public Permit() {
	}

	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the spot_nbr
	 */
	public int getSpot_nbr() {
		return spot_nbr;
	}
	/**
	 * @param spot_nbr the spot_nbr to set
	 */
	public void setSpot_nbr(int spot_nbr) {
		this.spot_nbr = spot_nbr;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the car_model
	 */
	public String getCar_model() {
		return car_model;
	}
	/**
	 * @param car_model the car_model to set
	 */
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	/**
	 * @return the car_make
	 */
	public String getCar_make() {
		return car_make;
	}
	/**
	 * @param car_make the car_make to set
	 */
	public void setCar_make(String car_make) {
		this.car_make = car_make;
	}
	/**
	 * @return the car_color
	 */
	public String getCar_color() {
		return car_color;
	}
	/**
	 * @param car_color the car_color to set
	 */
	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}
	/**
	 * @return the car_tag_nbr
	 */
	public String getCar_tag_nbr() {
		return car_tag_nbr;
	}
	/**
	 * @param car_tag_nbr the car_tag_nbr to set
	 */
	public void setCar_tag_nbr(String car_tag_nbr) {
		this.car_tag_nbr = car_tag_nbr;
	}



		
		
	}