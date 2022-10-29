package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Resultado da divisão abaixo: \n");
        double resultado = calculadora.divideDoisNumeros( num1, num2 );
        System.out.println(resultado);


        calculadora.imprimeDivisãoDeDoisNumeros(10.0, 0.0);
    }
}
