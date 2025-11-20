import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida al usuario dos números enteros por consola y muestre el resultado
    de las cinco operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scan.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double resto = numero1 % numero2;
        System.out.println("La suma de los dos numeros da un total de: " + suma);
        System.out.println("La resta de los dos numeros da un total de: " + resta);
        System.out.println("La multiplicacion de los dos numeros da un total de: " + multiplicacion);
        System.out.println("La division de los dos numeros da un total de: " +  division);
        System.out.println("El resto de la division es:" + resto);
    }
}
