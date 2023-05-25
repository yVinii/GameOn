package Classes;
import java.util.ArrayList;
public class Campeonato {
    private String nome;
    private String dataElocal;
    private ArrayList<Time> times;

    public Campeonato() {
        times = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataElocal() {
        return dataElocal;
    }

    public void setDataElocal(String dataElocal) {
        this.dataElocal = dataElocal;
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
