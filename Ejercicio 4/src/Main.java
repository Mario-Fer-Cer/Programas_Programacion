public class Main {
    /*
    Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.
    */
    public static void main (String[] args) {
        String titulo = "La cancion del lobo";
        String autor = "T.J. Klune";
        int ano = 2015;
        int paginas = 704;
        boolean disponibilidad = true;

        System.out.println("Titulo: " + titulo + "\nAutor: " + autor);
        System.out.println("Año de publicacion: " + ano + "\nNumero de paginas: " + paginas);
        System.out.println("¿Disponible en la bilioteca?: " + disponibilidad);
    }
}
