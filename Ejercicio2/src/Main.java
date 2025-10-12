import java.sql.SQLOutput;

public class Main {
    /*
    Crea un programa que defina una variable llamada puntuación con valor inicial 0.
    Luego, modifica su valor tres veces y muestra el resultado final.
     */
    public static void main (String[] args){
        int valor = 0 ;
        System.out.println("Valor inicial: " + valor);
        valor = 3;
        System.out.println("Primera modificacion del valor: " + valor);
        valor = 5;
        System.out.println("Segunda modificacion del valor: " + valor);
        valor = 8 ;
        System.out.println("El valor final es: " + valor + " Mi numero favorito");
    }
}
