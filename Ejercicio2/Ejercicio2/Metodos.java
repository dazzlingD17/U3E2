package Ejercicio2; 

public class Metodos { 
    String cola[]=new String [5];

int ultimo=-1; 
public void insertar(String elemento){ 
    if (ultimo==5)
        System.out.println("La Lista se encuentra llena"); 
    
    else{ 
        cola[++ultimo]=elemento;
        System.out.println("Elemento insertado");
     }
    
}
public void eliminar(){
   if(ultimo==-1){
    System.out.println("lista vacia");
    }
    else{
    for(int i=0;i<ultimo;i++){
cola[i]=cola[i+1];
}
cola[ultimo]="";
    ultimo--;
}
} 
 
 public void Mostrar(){
     if(ultimo==-1){
         System.out.println("lista vacia");
     }
    else{
    for(int i=0;i<=ultimo;i++) {
        System.out.println(cola[i]);
    }
} } }
