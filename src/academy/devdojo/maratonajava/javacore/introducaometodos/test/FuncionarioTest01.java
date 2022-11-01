package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Valter");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1300,1500,2900});

        funcionario.imprimeFuncionario();

    }
}
