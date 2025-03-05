package edu.udelp.semester4.process;

import edu.udelp.semester4.models.Rhombus;

public class RhombusProcess {
	public Double perimetro(Rhombus rhombus) {
		return rhombus.getSide()*4;
	}
	
	public Double area(Rhombus rhombus) {
		return (rhombus.getLonger()*rhombus.getShorter())/2;
	}
	
}
