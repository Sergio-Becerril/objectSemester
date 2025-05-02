package edu.udelp.semester4.examen2;

	public class LargePackage implements Package {
	    private static final double WEIGHT = 10.0;
	    private static final double BASE_COST = 20.00;

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
	    	String tipo="large";
	        return tipo;
	    }
	}

