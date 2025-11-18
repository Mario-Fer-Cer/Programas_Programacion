public class Main {
    /*
    Escribe un programa que almacene la información de un producto
    (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
     */
    public static void main (String[] args){
    final String titulo = "INFORMACION DEL PRODUCTO";
    final String separador = "------------------------------";
    String producto = "Auriculares edicion limitada de starfield";
    double precio = 120;
    String codigo = "STRF-Aux-847";
    String disponible = "SIN STOCK";
        System.out.println(titulo + "\n" + separador);
        System.out.println("Nombre del producto: " + producto);
        System.out.println("Precio del producto:" + precio + "€");
        System.out.println("Codigo del producto:" + codigo);
        System.out.println("Stock:" + disponible);
    }
}
