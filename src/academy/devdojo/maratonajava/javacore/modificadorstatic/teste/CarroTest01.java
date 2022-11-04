package academy.devdojo.maratonajava.javacore.modificadorstatic.teste;

import academy.devdojo.maratonajava.javacore.modificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 230);
        Carro carro2 = new Carro("I30", 235);
        Carro carro3 = new Carro("UnoComEscadaTeto", 249);
        Carro.setVelocidadeLimite(181);

        carro.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
