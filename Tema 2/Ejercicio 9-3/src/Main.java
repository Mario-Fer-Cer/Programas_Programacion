import java.util.Scanner;
public class Main {
    /*
    Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario.
    Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9),
    por debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu peso: ");
        double peso = scan.nextDouble();
        System.out.println("Intorduce tu altura en metros: ");
        double altura = scan.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        /*
        math.pow sirve para hacer numeros elevados poniendo (el valor a elevar, numero al cual se eleva)
        En la operacion anterior altura se elvaria al cuadrado
        */
        double redondeo = Math.round(imc * 100.0) / 100.0;
        /*
        math.round sirve para redondear un numero cada 0 de la multiplicacion y division es la
        cantidad de decimales que se veran en pantalla
        En la operacion anterior veremos solo 2 decimales
         */
        System.out.println("Tu IMC es de: " + redondeo);
        if (imc < 18.5) {
            System.out.println("Tu peso esta por debajo del peso normal");
        } else if (imc > 24.9) {
            System.out.println("Tu peso esta por encima del peso normal");
        } else{
            System.out.println("Estas en un peso normal");
        }
    }
}
