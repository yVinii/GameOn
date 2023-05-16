package Classes;
import static Metodos.CPFValidacao.validarCPF;
import javax.swing.JOptionPane;
public class Jogador extends Pessoa{
    private String cpf;
    private String time;
    private int gols;

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(Time time) {
        String nt = time.getNome();
        this.time = nt;
    }
    
    
    
    public Jogador() {
    }

    public Jogador(String cpf, String nome) {
        super(nome);
        boolean validacao = validarCPF(cpf);
        if(validacao == true){
            this.cpf = cpf;
        }else{
            JOptionPane.showMessageDialog(null, "O CPF está inválido", "CPF", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        boolean validacao = validarCPF(cpf);
        if(validacao == true){
            this.cpf = cpf;
        }else{
            JOptionPane.showMessageDialog(null, "O CPF está inválido", "CPF", JOptionPane.ERROR_MESSAGE);
            }
    }
    
}
