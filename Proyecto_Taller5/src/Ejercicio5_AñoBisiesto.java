import java.util.Scanner;
/**
 *Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 * @author Juan Vargas
 */
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa un año: ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto. ");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
/***
 * Ingresa un año: 2006
 * 2006 no es un año bisiesto.
 * Ingresa un año: 2024
 * 2024 es un año bisiesto.
 */