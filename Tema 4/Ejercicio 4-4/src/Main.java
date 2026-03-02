import java.util.Scanner;
public class Main {
    /*
    Crea un programa con un array de 7 números. Pide al usuario un número a buscar y usa un bucle for para recorrer el array.
    Si el número existe, muestra su posición. Si no existe, indica que no se encontró.
     */
    public static void main (String[] args){
        int ini;
        int correcto = 0;
        Scanner scan = new Scanner(System.in);
        int [] numeros = {7, 12, 8, 74, 29, 4, 18};
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();
        for (ini = 0; ini < numeros.length;){
            if(numero == numeros[ini]){
                numero = correcto;
            }else{
                ini++;
            }
        }
        if (numero == correcto){
            System.out.println("El numero esta dentro del array");
        }else{
            System.out.println("El numero " + numero + " no se encuentra en el array");
        }
    }
}
