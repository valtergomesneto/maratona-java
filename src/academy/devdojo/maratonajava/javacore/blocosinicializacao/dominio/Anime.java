package academy.devdojo.maratonajava.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //ordem
    //1 - Alocado espaco em memoria pro objeto
    //2 - cada atributo de classe é criado e inicializado com valores default ou qualquer for passada
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i +1;
        }
    }

    public Anime(){
    }

    public Anime(String joão) {
        this();

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
