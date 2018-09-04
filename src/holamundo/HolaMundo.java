/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.*;
/**
 *
 * @author luisignacio
 */
public class HolaMundo {
    public static int opcion,var1,var2,resultado;
    public static float resultado2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        primerMenu();
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        while(opcion!=5){
            System.out.println("Ingresa una opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
            case 1:
                System.out.println("Ingresa la variable 1: ");
                var1 = sc.nextInt();
                System.out.println("Ingresa la variable 2: ");
                var2 = sc.nextInt();
                suma(var1,var2);
                break;
            case 2:
                System.out.println("Ingresa la variable 1: ");
                var1 = sc.nextInt();
                System.out.println("Ingresa la variable 2: ");
                var2 = sc.nextInt();
                resta(var1,var2);
                break;
            case 3:
                System.out.println("Ingresa la variable 1: ");
                var1 = sc.nextInt();
                System.out.println("Ingresa la variable 2: ");
                var2 = sc.nextInt();
                multiplica(var1,var2);
                break;
            case 4:
                System.out.println("Ingresa la variable 1: ");
                var1 = sc.nextInt();
                System.out.println("Ingresa la variable 2: ");
                var2 = sc.nextInt();
                divide(var1,var2);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
            System.out.println("");
            primerMenu();
           
        }
        System.out.println("Fin de aplicacion");
    }
    public static float divide(int var1, int var2) {
        resultado2=(var1/var2);
        System.out.println("La division de "+var1+" / "+var2+" es "+resultado2);
        return(resultado2);
        
    }
    public static int multiplica(int var1, int var2) {
        resultado=var1*var2;
        System.out.println("La multiplicacion de "+var1+" * "+var2+" es "+resultado);
        return(resultado);
        
    }
    public static int resta(int var1, int var2) {
        resultado=var1-var2;
        System.out.println("La resta de "+var1+" - "+var2+" es "+resultado);
        return(resultado);
        
    }
    public static int suma(int var1, int var2) {
        resultado=var1+var2;
        System.out.println("La suma de "+var1+" + "+var2+" es "+resultado);
        return(resultado);
        
    }
    
    public String signo(int number) {
        if(number >= 0 ) {
            return "positivo";
        } else {
            return "negativo";
        }
    }
   
    public static void primerMenu() {
        System.out.println("Menu Opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        
    }
    
    
}
