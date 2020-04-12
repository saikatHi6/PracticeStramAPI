package org.quick.test;

public class Cat {
	private String name;

	   public Cat(String name) {
	       this.name = name;
	   }

	   public Cat() {
	   }

	   public static void main(String[] args) throws Throwable {

	       for (int i = 0 ; i < 10000000; i++) {

	           Cat cat = new Cat();
	           cat = null;// The first object becomes available for garbage collection here
	       }
	   }

	   @Override
	   protected void finalize() throws Throwable {
	       System.out.println("The Cat is destroyed!");
	   }
}
