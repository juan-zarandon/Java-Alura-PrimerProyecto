import java.util.Scanner;

public class AppBancaria {

    public static void main(String[] args) {

        //adicionar datos del cliente
        String nombre = "Tony Stark";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*************");
        System.out.println("\nNombre del cliente" + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El Saldo es: " + saldo + "$");
        System.out.println("*************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3- Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
            case 1:
                System.out.println("el saldo es" + saldo + "$") ;
                break;
            case 2:
                System.out.println("cual es el valor a retirar");
                double valorARetirar = teclado.nextDouble();
                if (saldo > valorARetirar){
                    System.out.println("saldo insuficiente");
                }else {
                    saldo = saldo - valorARetirar;
                    System.out.println("el saldo actualizado es:"+ saldo);
                }
                break;
            case 3:
                System.out.println("cual es el valor a depositar?");
                double valorADepositar = teclado.nextDouble();
                saldo += valorADepositar;
                System.out.println("el saldo actualizado es:"+ saldo);
                break;
            case 9:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("opcion no valida");
            }
        }
        teclado.close();
    } // Fin del método main

} // Fin de la clase AppBancaria


/* primero descomponer el problema en:

adicionar datos del cliente
menu de opciones
vizualizar saldo
hacer deposito
hacer retiro
 */