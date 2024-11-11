import java.util.Scanner;
/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Juan Vargas
 */
public class Ejercicio3_Mayor3num {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        double num1 = tcl.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = tcl.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double num3 = tcl.nextDouble();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        }
        else if (num1 >= num2 && num1 >= num3) {
            System.out.println("El mayor número es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El mayor número es: " + num2);
        } else {
            System.out.println("El mayor número es: " + num3);
        }
       
    }
}

/***
 * Ingresa el primer número: 5
 * Ingresa el segundo número: 2
 * Ingresa el tercer número: 9
 * El mayor número es: 9.0
 * Ingresa el primer número: 8
 * Ingresa el segundo número: 8
 * Ingresa el tercer número: 8
 * Los tres números son iguales.
 */