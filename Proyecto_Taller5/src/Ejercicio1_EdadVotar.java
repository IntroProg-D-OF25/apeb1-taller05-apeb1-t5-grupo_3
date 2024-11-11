import java.util.Scanner;
/***
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author Juan Vargas
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame una edad: ");
        edad = tcl.nextInt();
        if (edad>18)
            System.out.println("VOTA");
        else
            System.out.println("NO VOTA");
    }
}
/***
 * Dame una edad: 
 * 5
 * NO VOTA
 * Dame una edad: 
 * 19
 * VOTA
 */
