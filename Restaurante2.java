// corregido de clase.


    public class Restaurante {
    private int huevo; //  no hace falta gaurtdar esto, se va sacando: numPlatos;
    private double chorizo; 
   /* public Restaurante(){}// no hace falta sin parametros, este si usamos con parametros.... */ 
     
    public Restaurante (int numDocenas, int huevo, double kilosChorizo){ //int numPlatos,
        this.huevo=12*numDocenas; 
        this.chorizo=kilosChorizo; 
        }   
  
    public void addHuevos(int  numDocenas) // va VOID porque no devuelve nada solo incrementa..
    {
    this.huevo+=12*numDocenas;      // incrementadno los huievos con un mas
    }   
     public void addChorizos(int  kilosChorizo) 
    {
    this.chorizo+=kilosChorizo;       
    }
     
//get
     public int getNumPlatos()
     {
     int platoHuevo=huevo/2;
     int platoChorizo=(int)(chorizo*1000/200);//un cast para que de enteros; SE CAMBIA EL DOUBLE priemro por int yse castea
     int numPlatos=(platoHuevo<=platoChorizo)? platoHuevo: platoChorizo;    
     return numPlatos;
     }
      
   public void getSirvePlato() // VOID no devuelve, modifica los valores
   {
       if( getNumPlatos()>=1){
       }
       this.huevo=huevo -=2;
       this.chorizo=chorizo -=0.2;
       
       if( getNumPlatos()>=1){
       }
       else{
           System.out.print("no se puede");
       } 
   } 
     
  
     public int getHuevos()
     {
      int platoHuevo=huevo/2;
     int platoChorizo=(int)(chorizo*1000/200);//un cast para que de enteros; SE CAMBIA EL DOUBLE priemro por int yse castea
     int numPlatos=(platoHuevo<=platoChorizo)? platoHuevo: platoChorizo;    
     return numPlatos;
     //return huevo;
     }
     
     public double getChorizos()
     {
     return chorizo;
     }

    void cantidadKilos(int cantidadKilos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}
