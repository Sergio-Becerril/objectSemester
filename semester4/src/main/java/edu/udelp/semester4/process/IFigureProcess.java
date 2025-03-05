package edu.udelp.semester4.process;

public interface IFigureProcess <T> {
	
	Double perimeter (T figure);
	Double area (T figure);
	
	public default void calculate(T figure) {
		
		System.out.println("El perimetro es: " + perimeter(figure));
		System.out.println("El area es: " + area(figure));

	}
	
}
