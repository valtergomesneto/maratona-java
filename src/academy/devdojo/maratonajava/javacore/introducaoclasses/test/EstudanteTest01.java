package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Valter";
        estudante.idade = 30;
        estudante.sexo = 'M';

        System.out.println("O nome do estudante é " + estudante.nome + " sua idade é " + estudante.idade + " seu sexo é " + estudante.sexo + "!");
    }
}
