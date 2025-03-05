package edu.udelp.semester4.process;

import edu.udelp.semester4.models.NSidesRegular;

public class NSidesRegularProcess implements IFigureProcess<NSidesRegular> {
	
	@Override
	public Double perimeter(NSidesRegular figura) {
		return figura.getSide()*figura.getN();
		
	}
	@Override
	public Double area(NSidesRegular figure) {
		return (perimeter(figure)*figure.getAr())/2;
	}
	
}
