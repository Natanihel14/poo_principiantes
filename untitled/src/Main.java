import empresa.Electronico;
import empresa.Orden;
import empresa.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Producto producto1 = new Producto(2, "Libreta", 29.99, 5);
        Producto producto2 = new Electronico(4, "Táblet", 899.99, 2, "Samsung");
        Producto producto3 = new Producto(6, "Lápicero", 1.0, 5);

        // Crear una orden
        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);

        // Mostrar los detalles de la orden
        orden.mostrarDetallesOrden();
    }
}