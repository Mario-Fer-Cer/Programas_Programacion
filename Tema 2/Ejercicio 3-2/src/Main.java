public class Main {
    /*
    Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores
    de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.
     */
    public static void main (String [] args){
        int valorinicial = 100;
        System.out.println("Valor inicial: " + valorinicial);
        valorinicial += 50;
        System.out.println("Valor inicial + 50: "+ valorinicial);
        valorinicial -= 30;
        System.out.println("Valor actual - 30: " + valorinicial);
        valorinicial *= 2;
        System.out.println("Valor actual * 2: " + valorinicial);
        valorinicial /= 4;
        System.out.println("Valor actual / 4: " + valorinicial);
    }
}
