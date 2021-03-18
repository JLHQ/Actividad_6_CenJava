package actividad6cenjava;
import java.util.Scanner;
/**
 * @author Luis_
 */
public class Actividad6CenJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Nombre, calif = null;
        int sum = 0;
        int calificaciones[] = new int[5];
        System.out.println("Ingresa el nombre del estudiante: ");
        Nombre = scan.nextLine();
        System.out.println("Ingresa las calificaciones una por una: ");
        for(int i = 0; i < calificaciones.length; i++){
            calificaciones[i] = scan.nextInt();
        }
        //Primer metodo "Promedio"
        for(int i = 0; i < calificaciones.length; i++){
            sum = sum + calificaciones[i];
        }
        double promedio = sum / calificaciones.length;
        //Segundo metodo "Calificacion"
        if(promedio <= 50){
            calif = "F";
        }
        if(promedio >= 51 && promedio <= 60){
            calif = "E";
        }
        if(promedio >= 61 && promedio <= 70){
            calif = "D";
        }
        if(promedio >= 71 && promedio <= 80){
            calif = "C";
        }
        if(promedio >= 81 && promedio <= 90){
            calif = "B";
        }
        if(promedio >= 91 && promedio <= 100){
            calif = "A";
        }
        //Tercer metodo "Impresion"
        System.out.println("Nombre del estudiante: "+Nombre);
        for(int i = 0; i < calificaciones.length; i++){
            System.out.println("Calificacion " + i +": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación; " + calif);
    }
    
}
