package edu.udelp.semester4.process;

public abstract class FiguresProcess <T> {
	
	protected abstract Double perimeter (T figure);
	protected abstract Double area (T figure);
	
	public void calculate(T figure) {
		
		System.out.println("El perimetro es: " + perimeter(figure));
		System.out.println("El area es : " + area(figure));

	}
		
}
