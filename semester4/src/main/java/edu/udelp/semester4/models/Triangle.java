package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class Triangle extends Figure {
	
	private Double side1, side2, height;
	
	public Double getSide1() {
		return side1;
	}
	public void setSide1(Double side1) {
		this.side1 = side1;
	}
	public Double getSide2() {
		return side2;
	}
	public void setSide2(Double side2) {
		this.side2 = side2;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
}
