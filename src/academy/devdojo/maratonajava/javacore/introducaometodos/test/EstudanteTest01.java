package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante imp = new ImpressoraEstudante();

        estudante01.nome = "Valter";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Michel";
        estudante02.idade = 22;
        estudante02.sexo = 'M';

       imp.Imprime(estudante01);
        System.out.println("-------------");
       imp.Imprime(estudante02);


    }
}
