package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Json;
import com.google.gson.Gson;

public class LendoJson01 {
    public static void main(String[] args) {
        //string com informação representada em json
        String aux = "{\"titulo\":\"JSON James\",\"ano\":2012,\"generos\":[\"Western\"]}";

        Gson gson = new Gson();

        Json f = gson.fromJson(aux, Json.class);

        //imprime os resultados
        System.out.println(f.titulo);
        System.out.println(f.ano);
        System.out.println(f.generos.toString());

    }
}
