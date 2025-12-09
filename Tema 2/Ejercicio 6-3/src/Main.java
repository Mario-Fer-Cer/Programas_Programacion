import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
    Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que edad tienes: ");
        int edad = scan.nextInt();
        if (edad >= 16){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }
    }
}
