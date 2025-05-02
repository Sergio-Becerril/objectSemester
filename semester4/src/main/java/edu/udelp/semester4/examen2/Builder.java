package edu.udelp.semester4.examen2;

public class Builder extends ShippingOrder {
    
	public static Builder create(){
        return new Builder();
    }
	
	public ShippingOrder build() {
        return (ShippingOrder) this;
    }
	
    public Builder Package(Package paq) {
        this.paq = paq;
        return this;
    }

    public Builder recipientName(String name) {
        this.recipientName = name;
        return this;
    }

    public Builder shippingAddress(String address) {
        this.shippingAddress = address;
        return this;
    }

    public Builder insurance(boolean insurance) {
        this.insurance = insurance;
        return this;
    }

    public Builder express(boolean express) {
        this.express = express;
        return this;
    }

    
}