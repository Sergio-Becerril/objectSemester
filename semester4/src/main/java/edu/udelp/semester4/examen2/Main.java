package edu.udelp.semester4.examen2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		
		//1
		String[] tipos = {"small", "medium", "large"};
		for (String tp : tipos) {
			try {
				Package paq = FactoryPackage.createPackage(tp);
				System.out.println(paq);
			} catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
		}

		//2
		//Builder
		Package paq = FactoryPackage.createPackage("small");
		
        ShippingOrder order = Builder.create().Package(paq).recipientName("Jorge").shippingAddress("Chalco")
        		.insurance(true).express(false).build();
        
        //3
        //Clone
        ShippingOrder order2 = order;
        ShippingOrder order3 = (ShippingOrder) order.clone();
        ShippingOrder order4 = order;
        
        order.setRecipientName("Xavi");


        System.out.println(order);
        
        order.setShippingAddress("Brazil");
        
        System.out.println(order2);
        System.out.println(order3);
        order.setExpress(true);
        System.out.println(order4);
	}

	
}
