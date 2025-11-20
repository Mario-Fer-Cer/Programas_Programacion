import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
    Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scan.nextInt();
        System.out.println("Tienes carnet (Responde true si tienes)(Responde false si no tienes)");
        boolean carnet = scan.nextBoolean();
        boolean mayor = edad >= 21;
        System.out.println("La persona es mayor de 21 Años: " + mayor);
        System.out.println("Tiene carnet de conducir: " + carnet);
        boolean alquiler = mayor == true && carnet == true;
        System.out.println("La persona puede alquilar el vehiculo: " + alquiler);
    }
}
