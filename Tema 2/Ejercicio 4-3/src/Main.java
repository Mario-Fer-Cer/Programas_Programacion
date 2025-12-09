import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€,
    aplica un descuento del 10%. Muestra el importe original y el importe final a pagar.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cual es el precio de compra del producto: ");
        double precio = scan.nextDouble();
        if (precio >= 100){
            //double descuento = (precio * 10)/100;//
            double descuento = precio * 0.10;
            double precioFinal = precio - descuento;
            System.out.println("Se te ha aplicado un escuento en tu compra");
            System.out.println("Descuento aplicado: " + descuento + "€");
            System.out.println("Total a pagar: " + precioFinal + "€");
        }else{
            System.out.println("Total a pagar: " + precio + "€");
        }
    }
}
