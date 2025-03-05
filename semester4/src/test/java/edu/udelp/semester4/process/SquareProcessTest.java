package edu.udelp.semester4.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.udelp.semester4.models.Square;

class SquareProcessTest {
	
	@Test
	void testSquarePerimeter() {
		SquareProcess instance=new SquareProcess();
		Square cuadrado=new Square();
		
		cuadrado.setSide(2D);
		
		Double result =instance.perimeter(cuadrado);
		assertEquals(8, result);
		
	}

	@Test
	void testAreaCuadrado() {
		
	}
	
}
