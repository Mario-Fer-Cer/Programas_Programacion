import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha aprobado
    (nota mayor o igual a 5) o ha suspendido.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la nota que tienes");
        double nota = scan.nextDouble();
        if (nota >= 5){
            System.out.println("Enorabuena, has aprobado " + nota);
        }else{
            System.out.println("Lo siento, has suspendido " + nota);
        }
    }
}
