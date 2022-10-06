public class Main {
    public  static void generate(){

        //Salon 1
        Alumno al1 = new Alumno(8,"Victor",8);
        Alumno al2 = new Alumno(5,"Hugo",4);
        Alumno al3 = new Alumno(2,"Alejandro",6);

         Alumno arrayAlumno [] = {al1,al2,al3};

        //Salon 2
        Alumno al4 = new Alumno(7,"Leo",2);
        Alumno al5 = new Alumno(9,"Chuy",5);
        Alumno al6 = new Alumno(10,"Jorge",7);

        Alumno arrayAlumno2 [] = {al4,al5,al6};

        //Maestra 1
        Maestra m1 = new Maestra("Yessi",24);

        //Maestra 2
        Maestra m2 = new Maestra("Vane",27);

        Salon s1 = new Salon("3A",arrayAlumno,m1);
        Salon s2 = new Salon("5C",arrayAlumno2,m2);

        Salon vector [] = {s1,s2};







        viewData(vector);
    }

    public static void viewData(Salon [] marray){
        int i=1;
        Alumno a;

        for (Salon aux : marray)
        {
            System.out.println("Group: " + aux.getGrupo() + " Teacher " + aux.getM1().getName() + " Group:");
            for (Alumno aux1 : aux.getAl()) {
                System.out.println(i++ + "[" + aux1.getName() + "]");

            }
        }

    }


    public static void main(String[] args) {

        generate();

    }
}