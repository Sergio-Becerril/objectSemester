package edu.udelp.semester4.examen2;

//ShippingOrder.java
public class ShippingOrder implements Cloneable{
	
	protected Package paq;
	protected String recipientName;
	protected String shippingAddress;
	protected boolean insurance;
	protected boolean express;

	public ShippingOrder() {}

	public Package getPaq() {
		return paq;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public boolean isExpress() {
		return express;
	}

	@Override
	public String toString() {
        return "ShippingOrder{" +
                "package='" + paq + '\'' +
                ", recipient name='" + recipientName + '\'' +
                ", shipping address='" + shippingAddress + '\'' +
                ", insurance='" + insurance + '\'' +
                ", express='" + express + '\'' +
                '}';
    }
	
	protected Object clone() throws CloneNotSupportedException {
        return Builder.create().Package(paq).recipientName(recipientName).shippingAddress(shippingAddress)
        		.insurance(insurance).express(express).build();
    }


	public void setPaq(Package paq) {
		this.paq = paq;
	}

	public boolean isInsurance() {
		return insurance;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public void setExpress(boolean express) {
		this.express = express;
	}
	
	
	
}
