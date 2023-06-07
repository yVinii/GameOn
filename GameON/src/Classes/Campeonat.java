package Classes;
import java.util.ArrayList;
public class Campeonat {
    private String nome;
    private String Informacoes;
    private ArrayList<Time> times;

    public Campeonat() {
        times = new ArrayList<>();
    }

    public Campeonat(String nome, String Informacoes) {
        this.nome = nome;
        this.Informacoes = Informacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInformacoes() {
        return Informacoes;
    }

    public void setInformacoes(String dataElocal) {
        this.Informacoes = dataElocal;
    }
    
    public ArrayList<Time> getTimes() {
        return times;
    }

    public void adicionarTime(Time time) {
        if (times.size() < 8) {
            times.add(time);
        } else {
            System.out.println("Não é possível adicionar mais jogadores. Limite máximo atingido.");
        }
    }

    public void removerTime(Time time) {
        times.remove(time);
    }
}
