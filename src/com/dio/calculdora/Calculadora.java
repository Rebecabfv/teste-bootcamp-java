package com.dio.calculdora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o primeiro valor:");
		a= scan.nextInt();
		System.out.println("Digite o segundo valor:");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao (a,b);
		int multiplicacao = multiplicacao (a,b);
		int divisao = divisao(a,b);
		
		System.out.println("O resultado da soma �: " + soma);
		System.out.println("O resultado da subtra��o �: " + subtracao);
		System.out.println("O resultado da multiplica��o �: " + multiplicacao);
		System.out.println("O resultado da divis�o �: " + divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
}
