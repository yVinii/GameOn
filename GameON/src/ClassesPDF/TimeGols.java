/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesPDF;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author mathe
 */
public class TimeGols {
    @JsonProperty("nome")
    private String nome;
    
    @JsonProperty("gols")
    private String gols;

    public TimeGols(String nome, String gols) {
        this.nome = nome;
        this.gols = gols;
    }

    public String getNome() {
        return nome;
    }

    public String getGols() {
        return gols;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGols(String gols) {
        this.gols = gols;
    }
}
