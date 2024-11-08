/**Categoría de Edad: Clasificar a una persona en una categoría de edad
  (niño, adolescente, adulto) en función de su edad.
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio6_CategoriaEdad {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
    //proceso
        System.out.println("ingrese edad");
        edad = tcl.nextInt();
    
        if (edad >4 && edad <12){
                System.out.println("niño");      
        }else if (edad >12 && edad <18){
            System.out.println("Adolecente");   
        }else if (edad >18 && edad <65){
            System.out.println("Adulto");    
        }else {
            System.out.println("Su edad no esta dentro de los parametros");
        }
            
    }
  
}
