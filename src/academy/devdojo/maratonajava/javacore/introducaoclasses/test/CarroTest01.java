package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Fusca";
        carro.ano = 1973;
        carro.modelo = "Sedan";

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.modelo = "Hatch";
        carro2.ano = 1983;

        System.out.println("Carro 01\n" + "Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano " + carro.ano);
        System.out.println("Carro 02\n" + "Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano " + carro2.ano);

    }
}
