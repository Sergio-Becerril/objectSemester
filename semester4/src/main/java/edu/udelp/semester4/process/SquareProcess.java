package edu.udelp.semester4.process;

import edu.udelp.semester4.models.Square;

public class SquareProcess extends FiguresProcess <Square> {
	
	@Override
	protected Double perimeter(Square figure) {
		
		return figure.getSide()*4;
	}

	@Override
	protected Double area(Square figure) {
		// TODO Auto-generated method stub
		return figure.getSide()*figure.getSide();
	}
	
}
