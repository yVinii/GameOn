package Classes;

public class Partida {
    private Time time1;
    private Time time2;
    private Campeonat camp;
    private int golsT1;
    private int golsT2;
    
    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Campeonat getCamp() {
        return camp;
    }

    public void setCamp(Campeonat camp) {
        this.camp = camp;
    }

    public Partida() {
    }

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Partida(Time time1, Time time2, Campeonat camp) {
        this.time1 = time1;
        this.time2 = time2;
        this.camp = camp;
    }
    
    
}
