// importar clases

import java.util.Random;
import java.util.Scanner;

//Configurar la clase principal y el método
public static void main(String[] args) {
    //Generar el número aleatorio
    Random random = new Random();
    int numeroAleatorio = random.nextInt(101);
// Inicializar el Scanner para la entrada del usuario
    Scanner scanner = new Scanner(System.in);
    //Inicializar la variable para contar los intentos
    int intentos = 0;
    //Implementar el bucle para controlar los intentos
    int adivinanza = 0;
    while (intentos < 5) {
        //: Pedir al usuario que adivine el número
        System.out.println("Intento #" + (intentos + 1) + ".Adivina el numero de 0 a 100");
        adivinanza = scanner.nextInt();
        intentos++;
        //Verificar la adivinanza y proporcionar retroalimentación
        if (adivinanza == numeroAleatorio) {
            System.out.println("Felicitaciones adivinaste en" + intentos + "intentos");
            break; //sale del bucle
        } else if (adivinanza < numeroAleatorio) {
            System.out.println("el numero es mayor.");
        } else {
            System.out.println("el numero es menor");
        }
    }
    if (intentos == 5 && adivinanza != numeroAleatorio) {
        System.out.println("Se acabaron los intentos. El número era: " + numeroAleatorio);
    }

    scanner.close();
}


/*desafio
Practica los conceptos que se enseñaron durante esta clase con el siguiente desafío:

Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.
 */