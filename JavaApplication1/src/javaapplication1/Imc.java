/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso ;
    float altura;
    
      public Imc(){
          peso=78f;
          altura=1.68f;
      }
    
    
    public float calcular() {
        
        float resultado=peso/(altura*altura);
        return resultado;
    }
 
    
}
