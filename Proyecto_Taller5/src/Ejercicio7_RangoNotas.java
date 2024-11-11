import java.util.Scanner;
/**
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Juan Vargas
 */
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingresa la calificación (0-100): ");
        int calificacion = tcl.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("La letra asignada es: A");
        } else 
            if (calificacion >= 80 && calificacion < 90) {
            System.out.println("La letra asignada es: B");
        } else 
            if (calificacion >= 70 && calificacion < 80) {
            System.out.println("La letra asignada es: C");
        } else 
            if (calificacion >= 60 && calificacion < 70) {
            System.out.println("La letra asignada es: D");
        } else 
            if (calificacion >= 0 && calificacion < 60) {
            System.out.println("La letra asignada es: F");
        } else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
        }
    }
}
/***
 * Ingresa la calificación (0-100): 75
 * La letra asignada es: C
 * Ingresa la calificación (0-100): 101
 * Calificación inválida. Debe estar entre 0 y 100.
 */