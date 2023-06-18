public class Futbolista {
    //atributos
    String equipo;
    int dorsal;
    String pais;

    //constructor

    public Futbolista(String equipo, int dorsal, String pais) {
        this.equipo = equipo;
        this.dorsal = dorsal;
        this.pais = pais;
    }

    //getters and setters
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}
