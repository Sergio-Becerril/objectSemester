package edu.udelp.semester4.examen2;

public class SmallPackage implements Package {
	
    private double WEIGHT = 1.0;
    private double BASE_COST = 5.00;

    @Override
    public double getWeight() {
        return WEIGHT;
    }

    @Override
    public double getBaseCost() {
        return BASE_COST;
    }

    @Override
    public String toString() {
    	String tipo="small";
        return tipo;
    }

    
}
