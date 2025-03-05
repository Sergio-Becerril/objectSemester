package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class Rectangle extends Figure {
	
	private Double bigSide;

	public Double getBigSide() {
		return bigSide;
	}

	public void setBigSide(Double bigSide) {
		this.bigSide = bigSide;
	}
	
}
