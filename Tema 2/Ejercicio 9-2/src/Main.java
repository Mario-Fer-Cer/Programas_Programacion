import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida al usuario la puntuación de tres exámenes.
    Calcula la nota media y usa operadores relacionales para determinar si ha aprobado (>=5),
    si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la primera nota del examen: ");
        double nota1 = scan.nextDouble();
        System.out.println("Introduce la segunda nota del examen: ");
        double nota2 = scan.nextDouble();
        System.out.println("Introduce la trecera nota del examen: ");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota media de los examenes es de: " + media);
        boolean aprobado = media >= 5;
        System.out.println("Ha aprobado: " + aprobado);
        boolean notable = media >= 7;
        System.out.println("Su nota media es de notable: " + notable);
        boolean sobresaliente = media >= 9;
        System.out.println("Su nota media es de sobresaliente: " + sobresaliente);
    }
}
