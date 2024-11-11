/**Calcular el índice de masa corporal (IMC) de una persona y clasificarla 
 * en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 *
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio8_Calculadora_IMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
   double peso, altura, imc;

        System.out.print("Ingrese su peso en kg: ");
        peso = tcl.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        altura = tcl.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }

}

/***
 * Ingrese su peso en kg: 67
Ingrese su altura en metros: 1.97
Su IMC es: 17.264036692519777
Clasificaci�n: Bajo peso
 */