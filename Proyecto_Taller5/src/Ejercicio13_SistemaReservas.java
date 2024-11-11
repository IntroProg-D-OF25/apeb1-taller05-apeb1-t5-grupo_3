import java.util.Scanner;
/**
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar un solución que pida como datos de entrada el número de días y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 * @author Juan Vargas
 */
public class Ejercicio13_SistemaReservas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double precioDiario;
        System.out.print("Ingresa el número de días de hospedaje: ");
        dias = tcl.nextInt();
        System.out.print("Ingresa el precio diario de la habitación: ");
        precioDiario = tcl.nextDouble();
         if (dias <= 5){
            System.out.println("Valor a pagar: " + ((dias * precioDiario) * 0.90));
        }
        else if (dias < 10){
            System.out.println("Valor a pagar: " + ((dias * precioDiario) * 0.90));
        }
        else if (dias < 15){
            System.out.println("Valor a pagar: " + ((dias * precioDiario) * 0.85)); 
        }
        else if (dias > 15){
            System.out.println("Valor a pagar: " + ((dias * precioDiario) * 0.80));
        }    
    }
}
/***
 * Ingresa el número de días de hospedaje: 7
 * Ingresa el precio diario de la habitación: 60
 * Valor a pagar: 378.0
 * 
 * Ingresa el número de días de hospedaje: 16
 * Ingresa el precio diario de la habitación: 40
 * Valor a pagar: 512.0
 */