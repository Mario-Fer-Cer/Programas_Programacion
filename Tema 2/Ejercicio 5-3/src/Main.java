import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
    Muestra un mensaje personalizado para cada caso.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scan.nextInt();
        if (numero % 2 == 0){
            System.out.println("El numero " + numero + " es par");
        }else{
            System.out.println("El numero " + numero + " es impar");
        }
    }
}
