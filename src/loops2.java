import java.util.Scanner;

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); //inicia Scanner
    double nota = 0;
    double mediaEvaluaciones = 0;
//uso de ciclo for de repeticion
    for (int i = 0; i < 3; i++) {
        System.out.println("Escribe la nota que darias a Matrix");
        nota = teclado.nextDouble();
        mediaEvaluaciones = mediaEvaluaciones + nota;
    }
    System.out.println("La media de evaluaciones para Matrix es;" + mediaEvaluaciones / 3);
}