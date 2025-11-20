public class Main {
    /*
    Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad)
    en variables y muestre un mensaje de presentación por consola.
     */
    public static void main (String[] args){
        String nombre = "Mario ";
        String apellido1 = "Fernandez ";
        String apellido2 = "Cervera";
        int edad = 28;
        String ciudad = "Madrid";
        System.out.println("Hola me llamo " + nombre + apellido1 + apellido2 + "\n" +
                "Tengo: " + edad + " años y vivo en: " + ciudad);
    }
}
