import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida al usuario su edad y si es estudiante (true/false).
    Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos:
    descuento joven (menor de 26 años),
    descuento estudiante, o descuento especial (menor de 26 Y estudiante).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scan.nextInt();
        boolean menor = edad < 26;
        System.out.println("Eres menor de 26: " + menor);
        System.out.println("Intoduce true si eres estudiante y false si no lo eres");
        System.out.println("¿Eres estudiante?: ");
        boolean estudiante = scan.nextBoolean();
        boolean noestudiante = !estudiante == true;
        System.out.println("No, eres estudiante " + noestudiante);
        System.out.println("Tienes descuento joven: " + menor);
        System.out.println("Tienes descuento de estudiante: " + estudiante);
        boolean especial = estudiante && menor == true ;
        System.out.println("Tienes descuento especial: " + especial);
    }
}
