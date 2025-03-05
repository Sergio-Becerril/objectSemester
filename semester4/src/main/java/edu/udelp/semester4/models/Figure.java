package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class Figure {
	
	private Double side;

	public Double getSide() {
		return side;
	}

	public void setSide(Double side) {
		this.side = side;
	}
	
}
