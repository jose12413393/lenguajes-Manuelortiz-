/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-107
 */
public class Arreglos1 {
    
     public static void main(String[] args) {
        
                int x=4;
                int []y={7,-20,15}; //inializacion explicita
                int z[]=new int [4]; //inisialisacion implisita 
                 //areglo referenciado
                String mensaje[]={"hola","como","andas","hoy"};
               
                //ciclo for para iterar lso elementos de areglo de string
                for(int i=0;i<mensaje.length;i++){
                    
                    System.out.println(mensaje[i]);
                    
                }//termina ciclo for
                
                
                
                //for mejorado
                for(String valor:mensaje){
                    System.out.println(valor);
                    
                }
    }
    
}