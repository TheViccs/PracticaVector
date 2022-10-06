# PracticaVector

En este programa lo que se quizo hacer es buscar la forma de iterar dentro de un vector, anidado en otro vector.

for (Tipo variable : variable)
        {
            System.out.println("Group: " + aux.getGrupo() + " Teacher " + aux.getM1().getName() + " Group:"); <-- Informacion del primer vecto 
            for (Alumno aux1 : aux.getAl()) {
                System.out.println(i++ + "[" + aux1.getName() + "]"); <-- Infromsción de vector anidado (i solo es un contador) 

            }
        }




