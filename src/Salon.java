import java.util.Arrays;

public class Salon {

    private String grupo;
    public Alumno al [] = {};
    public Maestra m1;

    public Salon(String grupo, Alumno[] al, Maestra m1) {
        this.grupo = grupo;
        this.al = al;
        this.m1 = m1;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Alumno[] getAl() {
        return al;
    }

    public void setAl(Alumno[] al) {
        this.al = al;
    }

    public Maestra getM1() {
        return m1;
    }

    public void setM1(Maestra m1) {
        this.m1 = m1;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "grupo='" + grupo + '\'' +
                ", al=" + Arrays.toString(al) +
                ", m1=" + m1 +
                '}';
    }
}
