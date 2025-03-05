package edu.udelp.semester4;

import edu.udelp.semester4.models.*;
import edu.udelp.semester4.process.*;

/**
 * Hello world!
 */
public class Figures {
	
    public static void main(String[] args) {
    	
    	Square sq=new Square();
		SquareProcess sqP=new SquareProcess();
		Circle ci=new Circle();
		CircleProcess ciP=new CircleProcess();
		Rectangle rec=new Rectangle();
		RectangleProcess recP=new RectangleProcess();
		NSidesRegular nS=new NSidesRegular();
		NSidesRegularProcess nSP=new NSidesRegularProcess();
		
		sq.setSide(3D);
		sqP.calculate(sq);
		
		ci.setRadius(4D);
		ciP.calculate(ci);
		
		rec.setSide(2D);
		rec.setBigSide(5D);
		recP.calculate(rec);
		
		nS.setAr(4D);
		nS.setSide(5D);
		nS.setN(5D);
		nSP.calculate(nS);
        
    }
}
