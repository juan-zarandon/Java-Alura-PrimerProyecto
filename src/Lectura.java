import java.util.Scanner;
//interaccion del usuario - ingresar datos desde la consola
public class Lectura {
    public static void main(String[] args) {

        //clase scaner que permite traer datos del teclao
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo dinos que nota le das a esta Pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
    }
//clase scaner

