package edu.udelp.semester4.models;

import lombok.Data;

@Data
public class NSidesRegular extends Figure {

	private Double n, ar;
	
	public Double getN() {
		return n;
	}
	public void setN(Double n) {
		this.n = n;
	}
	public Double getAr() {
		return ar;
	}
	public void setAr(Double ar) {
		this.ar = ar;
	}

}
