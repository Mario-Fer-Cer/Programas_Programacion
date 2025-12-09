import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero.
     */
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numero = scan.nextInt();
        if (numero > 0){
            System.out.println("El numero " + numero + " es mayor a 0");
        } else if (numero == 0){
            System.out.println("El numero es 0");
        } else{
            System.out.println("El numero " + numero + " es menor a 0");
        }
    }
}
