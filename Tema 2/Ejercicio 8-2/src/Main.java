import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que pida tres números al usuario y calcule:
    la suma de los tres,
    el promedio,
    el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero.
    Usa paréntesis para controlar la precedencia de operadores.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = scan.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = scan.nextInt();
        int suma = numero1 + numero2 + numero3;
        System.out.println("La suma de los tres numeros da de resultado: " + suma);
        double promedio = suma/3;
        System.out.println("El promedio de los tres numeros es: " + promedio);
        double combix = (numero1 * numero2) / numero3;
        System.out.println("El resultado de multiplicar el primer numero " +
                            "por el segundo y dividirlo entre el tercero es: " + combix);
    }
}
