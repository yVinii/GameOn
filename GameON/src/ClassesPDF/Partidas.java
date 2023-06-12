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
public class Partidas {
    @JsonProperty("times")
    private TimeGols[] times;

    public Partidas(TimeGols[] times) {
        this.times = times;
    }
    
    public TimeGols[] getTimes() {
        return times;
    }

    public void setTimes(TimeGols[] times) {
        this.times = times;
    }
    
    
}
