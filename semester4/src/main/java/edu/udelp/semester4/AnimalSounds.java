package edu.udelp.semester4;

import edu.udelp.semester4.models.*;

public class AnimalSounds {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.sonido();
		a=new Dog();
		a.sonido();
		a=new Cat();
		a.sonido();
	}
}
