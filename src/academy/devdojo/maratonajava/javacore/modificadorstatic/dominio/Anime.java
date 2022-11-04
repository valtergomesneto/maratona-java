package academy.devdojo.maratonajava.javacore.modificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //ordem
    //0 - Bloco de inicialização é executado quando a JVM carregar a classe
    //1 - Alocado espaco em memoria pro objeto
    //2 - cada atributo de classe é criado e inicializado com valores default ou qualquer for passada
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2");

    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização NÃO ESTATICO!!!");
    }

    public Anime(String nome){this.nome = nome; }

    public Anime() {

        for (int episodio: this.episodios) {

            System.out.println(episodio + " ");

        }
    }

    public Anime(String nome, int[] episodios) {
        this();
        this.nome = nome;
        this.episodios = episodios;
    }
}
