public class decisiones {
//Toma de decisiones
//
    public static void main(String[] args) {
        //trae las variables del otro archivo
        int fechaDeLanzamiento = 2019; //se usa "int" para numero entero
        boolean inlcuidoEnElPan = true; //Booleano
        double notaDeLaPelicula = 8.2;   //dato fluctuante con decimal
        /* Nueva variable*/
        String tipoPlan = "plus";
//crea un if else
        if (fechaDeLanzamiento >2022){ //uso de operadores relacionales
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }
//operador logico OR || para booleano y .equals para comparativo
        if (inlcuidoEnElPan || tipoPlan.equals("plus")){
            System.out.println("Disfruta tu pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plan actual");
       }
    }
}
