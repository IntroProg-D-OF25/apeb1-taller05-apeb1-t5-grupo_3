import java.util.Scanner;
/**
 * Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción, la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * @author Juan Vargas
 */
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la descripción del artículo: ");
        String descripcion = tcl.nextLine();
        System.out.print("Ingresa la cantidad que se requiere: ");
        int cantidad = tcl.nextInt();
        System.out.print("Ingresa el precio unitario del artículo: ");
        double precioUnitario = tcl.nextDouble();
        double costoTotal = cantidad * precioUnitario;
        if (cantidad > 50) {
            costoTotal = costoTotal * 0.85; 
            System.out.println("Se aplicó un descuento del 15% por superar 50 unidades.");
        }
                System.out.println("Artículo: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Costo total: $" + costoTotal);
    }
}
/***
 *      SIN DESCUENTO
 * Ingresa la descripción del artículo: laptop
 * Ingresa la cantidad que se requiere: 25
 *Ingresa el precio unitario del artículo: 200
 * Artículo: laptop
 * Cantidad: 25
 * Precio unitario: $200.0
 * Costo total: $5000. 
 *      CON DESCUENTO
 * Ingresa la descripción del artículo: laptop
 * Ingresa la cantidad que se requiere: 55
 * Ingresa el precio unitario del artículo: 200
 * Se aplicó un descuento del 15% por superar 50 unidades.
 * Artículo: laptop
 * Cantidad: 55
 * Precio unitario: $200.0
 * Costo total: $9350.0
 */