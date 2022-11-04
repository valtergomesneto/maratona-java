package academy.devdojo.maratonajava.javacore.construtores.teste;

import academy.devdojo.maratonajava.javacore.introducaosobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("akudama drive", "TV", 12, "ação");
        anime.imprime();
    }
}
