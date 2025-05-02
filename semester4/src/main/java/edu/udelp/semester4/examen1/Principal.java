package edu.udelp.semester4.examen1;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Examen		
		//1
//		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
//		
//		Vehiculo vehicle;
//		
//		  vehiculos.add(new Automovil("Ford", "Focus", 2019, 4));
//        vehiculos.add(new Automovil("Chevrolet", "Malibu", 2021, 4));
//        vehiculos.add(new Motocicleta("Ducati", "Panigale V4", 2022, "Deportiva"));
//        vehiculos.add(new Motocicleta("Kawasaki", "Ninja 650", 2023, "Deportiva"));
//		
//        
//        for (int i = 0; i < vehiculos.size(); i++) {
//        	vehicle = vehiculos.get(i);
//            vehicle.mostrarDetalles();
//            System.out.println("----------------");
//        }
		
        //2
		
		Vehiculo auto = VehiculoFactory.create(TipoVehiculo.AUTOMOVIL);
		auto.mostrarDetalles();
		
		auto=VehiculoFactory.create(TipoVehiculo.MOTOCICLETA);
		auto.mostrarDetalles();
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DATE, 1);
		System.out.println(cal);
		System.out.println(cal.getTime());
		
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(df.format(cal.getTime()));
		
		
		
	}
	
	

}
