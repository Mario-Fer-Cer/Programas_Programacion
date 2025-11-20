import javax.imageio.stream.ImageInputStreamImpl;

public class Main {
    /*
    Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit. Usa una variable para la temperatura
    en Celsius y muestra el resultado de la conversión.
    La fórmula para convertir de Celsius a Fahrenheit es:
    F = C × 9/5 + 32
     */
    public static void main (String[] args){
        double grados = 25;
        double fahrenheit = grados * 9 / 5 + 32;
        System.out.println("La temperatura en grados es de: " + grados + " Cº");
        System.out.println("La temperatura en fahrenheit es de : " + fahrenheit + " Fº");
    }
}
