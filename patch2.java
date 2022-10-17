// casi corregido de clase...........


import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        /*Restaurante menu=new Restaurante();  no existe el construxtor por defecto*/              
Restaurante menu=new Restaurante(4,5);

System.out.print("cuantos platos se pueden servir: "+menu.getNumPlatos()+" platos totales."); 

menu.getNumPlatos();
System.out.print("cuantos platos se "+menu.getChorizos()+"pueden servir: "+menu.getChorizos()+" platos totales."); 



System.out.print("\n\t *** ALMACEN ------------------------------\n");                
Scanner tecladoHuevos = new Scanner(System.in); 
System.out.print("\n  Introduce docenas de huevos disponibles >>> "); 
int cantidadDocena=tecladoHuevos.nextInt(); 
int huevosInicial = cantidadDocena*12; 
System.out.print("\t--> En total hay "+huevosInicial+" huevos");
float docenas=huevosInicial/12;
System.out.printf(" (%,.1fdocenas",docenas); 
                 //   menu.getHuevos(huevosInicial);
Scanner tecladoChorizos = new Scanner(System.in); 
System.out.print("\n  Introduce kilos de chorizo disponibles >>> "); 
int cantidadKilos=tecladoChorizos.nextInt(); 
float chorizosInicial =(cantidadKilos*5);
System.out.print("\t--> Quedan ");
System.out.printf("%,.0f",chorizosInicial); System.out.print(" raciones de 200grs");
float kilos=chorizosInicial/5;
System.out.printf(" (%,.1f",kilos); System.out.print(" kg).\n");
                   //   menu.setChorizos(chorizosInicial);                     
int platoA1=(int) huevosInicial;
int platoB1=(int) chorizosInicial;
System.out.print("\n- Con "+platoA1+" huevos."+" podrian hacerse "+platoA1/2+" platos."); 
System.out.print("\n- Con "+platoB1+" raciones de chorizo de 200 grs..");  


int total1 = (platoA1/2)<(platoB1) ? (platoA1/2) :platoB1;


System.out.print("\n\n    PUEDEN SERVIRSE "+total1+" PLATOS DE MOMENTO..");
System.out.print("\n\n\n\t *** PEDIDOS ------------------------------------\n");  
Scanner tecladoAnadirHuevos = new Scanner(System.in); 
System.out.print("\n>>> anadir huevos, unidad (+) ");
int anadirHuevos=tecladoAnadirHuevos.nextInt(); 
int huevosAnadidosTotal=anadirHuevos+huevosInicial; 
System.out.print("    Ahora hay "+huevosAnadidosTotal+" huevos en total");
float docenas2=huevosAnadidosTotal/12;
System.out.printf(" (%,.1f",docenas2); System.out.print(" docenas).\n");
/////////////////////////////////////////////////////


Scanner tecladoChorizos222 = new Scanner(System.in); 
System.out.print(">>> anadir chorizo, en kilos (+) "); 
int anadirKilos=tecladoChorizos222.nextInt(); 
menu.cantidadKilos(cantidadKilos);
System.out.print(">>> anadir chorizo, en kilos (+) "+tecladoChorizos222+anadirKilos);

double chorizosInicial=(int)(menu.getChorizos()/0.2); 
System.out.print("    Ahora hay "+chorizosInicial);
        float anadirChorizos = 0;
float kilos=anadirChorizos+kilos;
        Object[] chorizosAnadidosTotal = null;
System.out.printf("%,.d raciones de 200grs",chorizosAnadidosTotal); //letra d en format si da entreros

 
    }
}
