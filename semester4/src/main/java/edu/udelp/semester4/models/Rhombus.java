package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class Rhombus extends Figure {
	
	private Double longer, shorter;
	
	public Double getLonger() {
		return longer;
	}
	public void setLonger(Double longer) {
		this.longer = longer;
	}
	public Double getShorter() {
		return shorter;
	}
	public void setShorter(Double shorter) {
		this.shorter = shorter;
	}
	
}
