package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class Circle {
	
	private Double radius;

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

}
