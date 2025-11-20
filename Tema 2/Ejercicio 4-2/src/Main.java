import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
    Muestra el resultado por consola.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Elije un numero: ");
        int numero = scan.nextInt();
        int comprobacion = numero % 2;
        if (comprobacion == 0){
            System.out.println("El numero: " + numero + " Es par");
        }else{
            System.out.println("El numero: " + numero + " Es impar");
        }

    }
}
