public class Main {
    /*
    Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char)
     y muestra tanto su valor como su tipo.
     */
    public static void main (String[] args){
        String nombre = "Mario";
        int edad = 28;
        boolean validacion = true;
        double altura = 1.63;
        char inicial = 'M';
        String estudios = "DAM Desarrollo de aplicaciones multiplataforma";

        System.out.println("Nombre: " + nombre + "\nMi nombre empieza por la letra: " + inicial);
        System.out.println("Mi edad es de: " + edad +" Años\nMido: " + altura + "\nEstoy estudiando en la actualidad: " + validacion);
        System.out.println("Estoy cursando: " + estudios);
    }
}
