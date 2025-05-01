import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluacion = 0; //nueva variable

        while (nota!=-1){
            System.out.println("Escribe la nota que darias a Matrix");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaEvaluaciones += nota; //cambio a += que es lo mismo
                totalEvaluacion++; //adiciona mas uno
            }

        }
        System.out.println("La media de evaluaciones para Matrix es;" + mediaEvaluaciones / totalEvaluacion);
        }
    }
