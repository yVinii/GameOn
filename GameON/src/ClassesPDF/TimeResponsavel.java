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
public class TimeResponsavel {
    @JsonProperty("nome")
    private String nome;
    
    @JsonProperty("responsavel")
    private String responsavel;
    
    public TimeResponsavel(String nome, String responsavel) {
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
