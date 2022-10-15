/**
 * @author Daw120
 */
package com.solomongo.ejercicio1;

    public class Restaurante {
    private int huevos, numPlatos;
    private double chorizos;
 
    public Restaurante(){}  
     
    public Restaurante (int huevos, int numPlatos, double chorizos){ 
        this.huevos=huevos; 
        this.chorizos=chorizos; 
        } 
      
      //gets
      
     public int getHuevos()
     {
     return huevos;
     }
      
     public double getChorizos()
     {
     return chorizos;
     }
      
     public int getNumPlatos()
     {
     return numPlatos;
     }
    
     public int addHuevos()
     {
     return huevos; 
     }
   
     public int getSirvePlato()  {  return numPlatos;  } 
     
     
     //sets
 
     public void setHuevos(int huevos)
     {
     this.huevos=huevos; 
     }
 
     public void setChorizos(double chorizos)  
     {
     this.chorizos=chorizos; 
     } 
     
     public void setSirvePlato(int numPlatos) { this.numPlatos=numPlatos;  }
    
}
