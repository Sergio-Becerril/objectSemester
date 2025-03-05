package edu.udelp.semester4.process;

import edu.udelp.semester4.models.Triangle;

public class TriangleProcess {
	
	public Double perimetro(Triangle triangle) {
		return triangle.getSide()+triangle.getSide1()+triangle.getSide2();
	}
	
	public Double area(Triangle triangle) {
		return (triangle.getSide()*triangle.getHeight())/2;
	}
	
}
