import java.util.Scanner;
public class Main {
    /*
    Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario que introduzca 5 nombres, guardándolos en el array. Al
    final, muestra todos los nombres almacenados.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String [] nombres = new String[5];
        int ini;
        int numero;
        for (ini = 0; ini < nombres.length; ini++){
            numero = ini + 1;
            System.out.println("Introduce el nombre " + numero + ":");
            String nombre = scan.next();
            nombres[ini] = nombre;
        }
        System.out.println("Nombres introducidos: ");
        for (ini = 0; ini < nombres.length; ini++){
            System.out.println(nombres[ini]);
        }
    }
}
