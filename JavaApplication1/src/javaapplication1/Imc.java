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
    
      public Imc(float f){
          //este codigo no tiene que ver con los con los contructores
          byte  b=2;
          short s=2;
                  int i=2;
                  long l=2;
                 // reasignamos 
               /*casting forzado */     
                  b=(byte)i;
                  l=i;
                  s=(short)l;
                  s=b;
                  l=s;
                  s=(short)l;
                  s=(short)i;
                  l=b;
                  
      }
      
        public float calcular() {
        
        float resultado=peso/(altura*altura);
        return resultado;
        
        
             if(resultado >= 20 );
              
             
                 System.out.println("moriras");
                 
             
            if(resultado >=20 & resultado<25)
                System.out.println("bien sano");
            
            if(resultado >=25 &  resultado<30)
              System.out.println("tamal");
               
            if(resultado>=30)
               System.out.println("panzon");
             
        
         
        
            
        
    }
        
        
  public Imc(float p,float a){
      peso=p;
      altura=a;
      
  }
  
  }
    

