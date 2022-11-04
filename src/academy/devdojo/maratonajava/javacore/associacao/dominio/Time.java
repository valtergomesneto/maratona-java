package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprime() {
        System.out.println(this.nome = nome);
        if (jogadores == null) return;

        for (Jogador soccer : jogadores) {
            System.out.println(soccer.getNome());
        }
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
