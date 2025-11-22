import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
    Calcula el precio final después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.println("Introduce el valor del descuento (Un numero del 0 al 100): ");
        double porcentaje = scan.nextDouble();
        System.out.println("Precio original: " + precio + "€");
        double porcentajedecim = porcentaje/100;
        double porcentajeprecio = porcentajedecim * precio;
        System.out.println("El " + porcentaje + "% de " + precio + "€ es: " + porcentajeprecio + "€");
        double preciofinal = precio - porcentajeprecio;
        System.out.println("El precio final es de: " + preciofinal + "€");
    }
}
