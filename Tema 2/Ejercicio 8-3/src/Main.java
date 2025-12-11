import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
    Muestra el resultado por consola.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero1 = scan.nextDouble();
        System.out.println("Introduce otro numero: ");
        double numero2 = scan.nextDouble();
        if (numero1 < numero2){
            System.out.println("El numero " + numero1 + " Es menor al numero: " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("El primer numero y el segundo son el mismo numero");
        }else {
            System.out.println("El numero " + numero1 + " Es mayor al numero: " + numero2);
        }
    }
}
