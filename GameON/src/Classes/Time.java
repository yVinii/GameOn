package Classes;
import java.util.ArrayList;

public class Time {
    private String nome;
    private String tecnico;
    private Jogador jogador;
    private ArrayList<String> jogadores;

    public Time() {
        jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<String> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() < 15) {
            String nomeJ = jogador.getNome();
            jogadores.add(nomeJ);
        } else {
            System.out.println("Não é possível adicionar mais jogadores. Limite máximo atingido.");
        }
    }

    public void removerJogador(Jogador jogador) {
        String nomeJ = jogador.getNome();
        jogadores.remove(nomeJ);
    }
}