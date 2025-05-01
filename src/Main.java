
public class Main {
//asignando valores a las peliculas

    public static void main(String[] args) {
//        System.out.println("Bienvenido a Screen Match");
//        System.out.println("Pelicula: Matrix");

        //creacion de variable con Camel Case
        int fechaDeLanzamiento = 1999; //se usa "int" para numero entero
        boolean inlcuidoEnElPan = true; //Booleano
        double notaDeLaPelicula = 8.2;   //dato fluctuante con decimal

// comentario multilinea con /* y */

        double media = (8.2 + 6.0 + 9.0) / 3; //calculo de promedio
        System.out.println(media); //imprimir con atajo "sout" System.out.println(variable)

        // String es una clase con ciertos metodos
        // usamos text block para cadenas de texto multilinea ponendo 3 veces "
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula de fin de milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento; //concatenacion con variable a string
        System.out.println(sinopsis);
        //Casteo o conversion - de doble a entero de forma explicita
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);


    }
}
//     atajos alt + 1 abre panel lateral carpetas
