/**Descuento en Compras: Calcular el precio final de un producto con un descuento 
 del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 *
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio4_DescuentoCompras {
    public static void main(String[] args) {
        float precio_final;
        float descuento = 0.10f;
        float precio_producto;
        Scanner tcl = new Scanner(System.in);
  //proceso
        System.out.println("Ingrese el valor del producto");
        precio_producto = tcl.nextFloat();
        
        if (precio_producto >100){
            precio_final = precio_producto - (descuento * precio_producto);
            System.out.println("El precio final es " + precio_final);
        }else { 
            precio_final = precio_producto;
            System.out.println("El precio del producto es " + precio_final);
            
            
        }
    }
}
/***
 * Ingrese el valor del producto
   125.50
   El precio final es 112.95
 */