public class Main {
    /*
    Escribe un programa que defina un array de 10 números enteros.
    Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.
     */
    public static void main (String[] args){
        int ini;
        int contador = 0;
        int [] numeros = new int[10];
        for (ini = 0; ini < numeros.length; ini ++) {
            numeros [ini] = (int) (Math.random() * 100) + 1;
        }
        for (ini = 0; ini <= numeros.length; ini ++) {
            if(numeros [ini] >= 50){
                contador ++;
            }
        }
        System.out.println("Hay en la array; " + contador + "Numeros mayores a 50");
    }
}
