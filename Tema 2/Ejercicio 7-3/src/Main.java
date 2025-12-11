import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida una nota numérica (0-10) y determine la calificación: 
    Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
     */
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Que nota has sacado?:");
        double nota = scan.nextDouble();
        if (nota < 5){
            System.out.println("Has suspendido");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Has aprobado con un: " + nota + " Suficiente");
        } else if (nota >= 7 && nota <= 8.9) {
            System.out.println("Has aprobado con un: " + nota + " Notable");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("Has aprobado con un: " + nota + " Sobresaliente");;
        } else if (nota == 10) {
            System.out.println("Enorabuena has sacado matricula de honor");
        }else{
            System.out.println("La nota que has intorducido no es correcta");
        }
    }
}
