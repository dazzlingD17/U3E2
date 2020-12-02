package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Metodos lis = new Metodos();  
     boolean X=true;
     int opc;
     Scanner lector = new Scanner(System.in);
       while(X){ 
        System.out.println("\n-------MENU------");
         System.out.println("Seleccione una opcion");
        System.out.println("[1] Insertar dato");
        System.out.println("[2] Mostrar lista");
        System.out.println("[3] Borrar dato");
        System.out.println("[4] Salir");
       
        opc=lector.nextInt();
        switch(opc){
            case 1:
            String elemento;
            Scanner Lector = new Scanner(System.in);
            System.out.println("inserte un elemento ");
            elemento=Lector.nextLine();
            lis.insertar(elemento);
            break;
            
            case 2:
            lis.Mostrar();
            break;
            
            case 3:
            lis.eliminar();
            break;
            
            case 4:
            X= false;
            break;
            
            default:
                System.out.println("opcion incorrecta");
        }
        
        

       } 
    }
    
}
