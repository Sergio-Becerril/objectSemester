package edu.udelp.semester4.examen2;

	public class MediumPackage implements Package {
	    private static final double WEIGHT = 5.0;
	    private static final double BASE_COST = 10.00;

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
	    	String tipo="medium";
	        return tipo;
	    }
	}
