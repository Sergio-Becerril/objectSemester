package edu.udelp.semester4.process;

import edu.udelp.semester4.models.Circle;

public class CircleProcess extends FiguresProcess <Circle>{
	
	@Override
	protected Double perimeter(Circle figura) {
		
		return Math.PI*figura.getRadius()*2;
	}

	@Override
	protected Double area(Circle figura) {
		// TODO Auto-generated method stub
		return Math.PI*figura.getRadius()*figura.getRadius();
	}
}
