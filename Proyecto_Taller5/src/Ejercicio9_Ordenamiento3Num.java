import java.util.Scanner;
/**
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author Juan Vargas
 */
public class Ejercicio9_Ordenamiento3Num {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = tcl.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = tcl.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = tcl.nextInt();
        int temp;
        if (num1 > num2) { 
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("Números ordenados en orden ascendente: " + num1 + ", " + num2 + ", " + num3);
    }
}
/***
 * Ingresa el primer número: 7
 * Ingresa el segundo número: 9
 * Ingresa el tercer número: 15
 * Números ordenados en orden ascendente: 7, 9, 15
 */