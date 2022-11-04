package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {

        //associação de 1 para N

        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }

}
