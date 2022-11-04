package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTeste01 {

    //relacionamento de N para 1
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Ananias");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("ICEIA", professores);

        escola.imprime();

    }
}
