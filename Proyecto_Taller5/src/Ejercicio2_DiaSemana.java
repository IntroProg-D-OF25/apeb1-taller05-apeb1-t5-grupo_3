/**Día de la Semana: Mostrar el nombre del día de la semana en función del
   número ingresado (1 para lunes, 2 para martes, etc.).*
 * @author David Merino
 */
import java.util.Scanner;
public class Ejercicio2_Diasemana{
    public static void main(String[] args) {
        int nundia;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame un numero de dia");
        nundia = tcl.nextInt();
        
        switch (nundia){
            case 1 : System.out.println("lunes");
                break;
            case 2: System.out.println("martes");
                break;
            case 3: System.out.println("miercoles");
                break;
            case 4: System.out.println("jueves");
                break;
            case 5: System.out.println("viernes");
                break;
            case 6: System.out.println("sabado");
                break;
            case 7 : System.out.println("domingo");
                break;
            default : System.out.println("Error");     
       
        } 
    }
    
}
/***
 * Dame un numero de dia
  5
  viernes
 */
