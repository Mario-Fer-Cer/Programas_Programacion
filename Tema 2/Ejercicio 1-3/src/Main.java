import java.util.Scanner;
/*
Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
Muestra un mensaje indicando si puede votar o no.
 */
public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que edad tienes: ");
        int edad = scan.nextInt();
        if (edad >= 18){
            System.out.println("Tienes " + edad + " puedes votar");
        }else{
            System.out.println("Tienes " + edad + " no puedes votar, aun eres menor de edad");
        }
    }
}
