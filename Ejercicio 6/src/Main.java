public class Main {
    /*
    Escribe un programa que declare dos variables numéricas, realice las operaciones básicas
    (suma, resta, multiplicación y división) y muestre los resultados por consola.
     */
    public static void main(String[] args){
        int numero1 = 576 ;
        int numero2 = 365 ;
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1/numero2;
        System.out.println("Los numeros elegidos son: " + numero1 + " y " + numero2);
        System.out.println("La suma de los numeros hacen un total de: " + suma);
        System.out.println("La resta de los numeros hacen un total de: " + resta);
        System.out.println("La multiplicacion de los numeros hacen un total de: " + multiplicacion);
        System.out.println("La division de los numeros hacen un total de: " + division);
    }
}
