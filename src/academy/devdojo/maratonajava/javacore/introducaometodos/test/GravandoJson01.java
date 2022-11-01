package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Json;
import com.google.gson.Gson;

import java.util.ArrayList;
public class GravandoJson01 {
    public static void main(String[] args) {
        Json f = new Json();
        f.titulo = "JSON x XML";
        f.ano = 2012;
        f.generos = new ArrayList();
        f.generos.add("Aventura");
        f.generos.add("Ação");
        f.generos.add("Ficção");

        //instancia um objeto da classe Gson
        Gson gson = new Gson();

        //pega os dados do filme, converte para JSON e armazena em string
        String aux = gson.toJson(f);

        //imprime os resultados
        System.out.println(aux);
    }
}
