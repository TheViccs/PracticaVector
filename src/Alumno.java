public class Alumno {

    private int calif;
    private String name;
    private int promedio;


    public Alumno(int calif, String name, int promedio) {
        this.calif = calif;
        this.name = name;
        this.promedio = promedio;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "calif=" + calif +
                ", name='" + name + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
