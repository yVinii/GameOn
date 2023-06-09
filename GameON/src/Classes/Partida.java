package Classes;

public class Partida {
    private String time1;
    private String time2;
    private String camp;
    private int golsT1;
    private int golsT2;
    
    public String getTime1() {
        return time1;
    }

    public void setTime1(String time) {
        this.time1 = time;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public Partida() {
    }

    public Partida(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Partida(String time1, String time2, String camp) {
        this.time1 = time1;
        this.time2 = time2;
        this.camp = camp;
    }
    
    
}
