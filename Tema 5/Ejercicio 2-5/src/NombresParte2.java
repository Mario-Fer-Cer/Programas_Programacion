public class NombresParte2 {/*
    Ejercicio 1. Crea una clase llamada Persona con dos atributos: nombre y edad. Define un constructor que inicialice estos atributos.
    En el método main, crea un objeto de tipo Persona y muestra sus datos.
    Ejercicio 2. Amplía la clase Persona del ejercicio anterior añadiendo métodos getter y setter para los atributos nombre y edad.
    Crea un objeto, modifica sus valores usando los setters y muestra los datos usando los getters.
     */
    public static void main(String[] args){
        Persona datos = new Persona("Raul",25);
        System.out.println("Los datos de la persona son: ");
        System.out.println("Nombre: " + datos.nombre);
        System.out.println("edad: " + datos.edad);
    }
    public static class Persona {

        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

    }
}
