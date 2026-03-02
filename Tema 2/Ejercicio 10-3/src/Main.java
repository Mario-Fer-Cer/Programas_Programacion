import java.util.Scanner;
public class Main {
    /*Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
    La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no,
    indica el motivo (demasiado bajo o demasiado alto).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cual es tu altura: ");
        double altura = scan.nextDouble();
        if (altura < 1.20){
            System.out.println("Eres demasiado bajo.");
            System.out.println("Altura minima recomendada 1,20 M");
        } else if (altura > 2.00) {
            System.out.println("Eres demasiado alto.");
            System.out.println("Altura maxima recomendada 2,00 M");
        }else{
            System.out.println("Puedes subir");
        }
    }
}
