package Classes;
public class Funcionario extends Pessoa{
    private String senha;
    private String usuario;

    public Funcionario() {
    }

    public Funcionario(String senha, String usuario, String nome) {
        super(nome);
        this.senha = senha;
        this.usuario = usuario;
    }
    
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
