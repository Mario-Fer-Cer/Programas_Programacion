import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones
    relacionales entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int numero2 = scan.nextInt();
        boolean mayor = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;
        boolean mayorigu = numero1 >= numero2;
        boolean menorigu = numero1 <= numero2;
        System.out.println("Numero uno es mayor a numero 2: " + mayor);
        System.out.println("Numero uno es menor a numero 2: " + menor);
        System.out.println("Numero uno es igual a numero 2: " + igual);
        System.out.println("Numero uno es diferente a numero 2: " + diferente);
        System.out.println("Numero uno es mayor o igual a numero 2: " + mayorigu);
        System.out.println("Numero uno es menor o igual a numero 2: " + menorigu);
    }
}
