/**Calculo de impuestos: Desarrollar una solución que permita leer los datos
 * de un automóvil (marca, origen y costo) imprima el impuesto por pagar y el
 * precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto
 * es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio12_CalculoImpuestos {
 public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String marca, origen;
        double costo, impuesto, precioVenta;

        System.out.print("Ingrese la marca del automóvil: ");
        marca = tcl.nextLine();

        System.out.print("Ingrese el origen del automóvil (Alemania, Japón, Italia, USA): ");
        origen = tcl.nextLine().toLowerCase();

        System.out.print("Ingrese el costo del automóvil: ");
        costo = tcl.nextDouble();

        switch (origen) {
            case "alemania":
                impuesto = costo * 0.20;
                break;
            case "japon":
                impuesto = costo * 0.30;
                break;
            case "italia":
                impuesto = costo * 0.15;
                break;
            case "usa":
                impuesto = costo * 0.08;
                break;
            default:
                impuesto = 0;
                System.out.println("Origen no reconocido, no se aplicará impuesto.");
        }

        precioVenta = costo + impuesto;

        System.out.println("Impuesto por pagar: " + impuesto);
        System.out.println("Precio de venta (incluido el impuesto): " + precioVenta);
}
}
