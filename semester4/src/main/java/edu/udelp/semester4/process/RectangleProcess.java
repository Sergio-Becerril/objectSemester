package edu.udelp.semester4.process;

import edu.udelp.semester4.models.Rectangle;

public class RectangleProcess implements IFigureProcess<Rectangle> {
	
	@Override
	public Double perimeter(Rectangle figure) {
		return figure.getBigSide()*2+figure.getSide()*2;
	}
	@Override
	public Double area(Rectangle figure) {
		return figure.getBigSide()*figure.getSide();
	}
}
