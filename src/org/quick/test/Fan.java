package org.quick.test;

public class Fan {
	
	String name;
    int quotient;
    
    public Fan(String name,int quotient){
        this.name = name;
        this.quotient = quotient;
    }
    
    @Override
    public String toString(){
    	return name;
    }

}
