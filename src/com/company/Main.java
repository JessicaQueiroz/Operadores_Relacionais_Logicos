package com.company;

public class Main {

    public static void main(String[] args) {

    	boolean resultado;
	    boolean resultado2;
	    boolean resultado3;
	    int num1 = 4;
	    int num2 = 2;
	    boolean logico1;
	    boolean logico2;
	    int idade=18;

		// Operadores relacionais
		resultado = 1==2;
	    resultado2 = 1 != 2;
	    resultado3 = num1 > num2;

		// Operadores lógicos
		logico1 = idade>=18 && idade<=40;
		logico2 = false || true;

		System.out.println(resultado);
	    System.out.println(resultado2);
	    System.out.println(resultado3);
		System.out.println(logico1);
		System.out.println(logico2);
    }
}
