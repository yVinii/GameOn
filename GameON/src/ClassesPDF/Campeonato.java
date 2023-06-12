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
public class Campeonato {
    @JsonProperty("campeonatoNome")
    private String campeonatoNome;
    
    @JsonProperty("times")
    private TimeResponsavel[] times;
    
    @JsonProperty("partidas")
    private Partidas[] partidas;

    public String getCampeonatoNome() {
        return campeonatoNome;
    }

    public TimeResponsavel[] getTimes() {
        return times;
    }

    public Partidas[] getPartidas() {
        return partidas;
    }

    public void setCampeonatoNome(String campeonatoNome) {
        this.campeonatoNome = campeonatoNome;
    }

    public void setTimes(TimeResponsavel[] times) {
        this.times = times;
    }

    public void setPartidas(Partidas[] partidas) {
        this.partidas = partidas;
    }
    
    
}
