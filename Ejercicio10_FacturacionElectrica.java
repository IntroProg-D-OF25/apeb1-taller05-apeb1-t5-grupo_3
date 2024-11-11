/**Facturación eléctrica: Desarrollar una solución que permita 
 * calcular y mostrar el valor a cancelar de una planilla de luz.
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios 
 * consumidos en el mes. Si el usuario tiene edad mayor a 65 años,
 * se debe descontar el 10% por pertenecer a la tercera edad.*
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        // Declaración de variables
        double costo_por_kwh, kilovatios_consumidos, total;
        int edad;

        // Solicitar datos al usuario
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        costo_por_kwh = tcl.nextDouble();

        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        kilovatios_consumidos = tcl.nextDouble();

        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();

        // Calcular el total a pagar
        total = costo_por_kwh * kilovatios_consumidos;

        // Aplicar descuento del 10% si la persona tiene más de 65 años
        if (edad > 65) {
            total = total - (total * 0.10);  // Descuento del 10%
        }

        // Mostrar el total a pagar de forma más sencilla
        System.out.println("El total a cancelar es: " + total); 
}
}
/***
 * Ingrese el costo por kilovatio/hora: 67
Ingrese el n�mero de kilovatios consumidos en el mes: 127.80
Ingrese su edad: 67
El total a cancelar es: 7706.34
 */