package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
        System.out.println("Finalizando CalculadoraTest01!");
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
        System.out.println("Subtração!");
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        int resultado = num1 * num2;
         System.out.println(resultado);
    }

    public double divideDoisNumeros(double num1, double num2){

        if(num2 == 0 || num1 == 0){
            return 0;
        }
        double resultado =  num1 / num2;
        return resultado;
    }

    public void imprimeDivisãoDeDoisNumeros(double num1, double num2){
        if(num2 == 0 || num1 == 0){
            System.out.println("Não existe divisão por zero!");
            return;
        }else {
            System.out.println(num1 / num2);

        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " +num1);
        System.out.println("num2 " +num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int temp: numeros) {
            soma += temp;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int temp: numeros) {
            soma += temp;

        }
        System.out.println(soma);

    }
}
