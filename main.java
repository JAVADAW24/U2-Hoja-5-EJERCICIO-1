/**
En un restaurante especializado en huevos fritos con chorizo necesitan un 
programa que les calcule cuántos platos de huevos con chorizo pueden preparar 
con la cantidad de existencias disponibles en la cámara frigorífica. 

Diseña una clase denominada Restaurante con los siguientes métodos:

• constructor( int, double): recibirá el número de docenas de huevos y de kilos 
  de chorizo disponible en el frigorífico. 
  
• addHuevos( int): incrementa el número de docenas de huevos.

• addChorizos( double): incrementa el número de kilos de chorizo.

• getNumPlatos(): devuelve el número de platos de huevos con chorizo que se 
pueden ofrecer con las existencias actuales, teniendo en cuenta que cada plato 
necesita una media de 2 huevos y 200 gramos de chorizo.

• sirvePlato(): disminuye el número de huevos y de kilos de chorizo porque se ha 
servido un plato (2 huevos menos y 200 gramos de chorizo menos).

• getHuevos(): devuelve el número de huevos (no de docenas) que quedan en la cámara.

• getChorizo(): devuelve el número de kilos de chorizo que quedan en la cámara.

Realiza en el programa principal la definición de un Restaurante, de modo que se 
puedan probar todos los métodos para un objeto de tipo Restaurante.

@author Daw120
 */
package com.solomongo.ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Restaurante menu=new Restaurante();                
System.out.print("\n\t *** ALMACEN ------------------------------\n");                
Scanner tecladoHuevos = new Scanner(System.in); 
System.out.print("\n  Introduce docenas de huevos disponibles >>> "); 
int cantidadDocena=tecladoHuevos.nextInt(); 
int huevosInicial = cantidadDocena*12; 
System.out.print("\t--> En total hay "+huevosInicial+" huevos");
float docenas=huevosInicial/12;
System.out.printf(" (%,.1f",docenas); System.out.printf(" docenas).\n");
                    menu.setHuevos(huevosInicial);
Scanner tecladoChorizos = new Scanner(System.in); 
System.out.print("\n  Introduce kilos de chorizo disponibles >>> "); 
int cantidadKilos=tecladoChorizos.nextInt(); 
float chorizosInicial =(cantidadKilos*5);
System.out.print("\t--> Quedan ");
System.out.printf("%,.0f",chorizosInicial); System.out.print(" raciones de 200grs");
float kilos=chorizosInicial/5;
System.out.printf(" (%,.1f",kilos); System.out.print(" kg).\n");
                      menu.setChorizos(chorizosInicial);                     
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
Scanner tecladoAnadirChorizos = new Scanner(System.in); 
System.out.print(">>> anadir chorizo, en kilos (+) "); 
int anadirChorizos=tecladoAnadirChorizos.nextInt(); 
float chorizosAnadidosTotal=chorizosInicial+(anadirChorizos*5); 
System.out.print("    Ahora hay ");
float kilos2=anadirChorizos+kilos;
System.out.printf("%,.0f",chorizosAnadidosTotal); System.out.print(" raciones de 200grs");
System.out.printf(" (%,.1f",kilos2); System.out.print(" kg).\n\n\tvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n\n");    
int platoA=(int) huevosAnadidosTotal;
int platoB=(int) chorizosAnadidosTotal;
System.out.print("    - Con "+platoA+" huevos pueden acabarse: "+platoA/2+" platos;\n");   
System.out.print("    - Con "+platoB+" raciones de chorizo de 200 grs.."); 

int total = (platoA/2)<(platoB) ? (platoA/2) :platoB;
System.out.print("\n\n\t  PUEDEN SERVIRSE "+total+" PLATOS EN TOTAL:)");
System.out.print("\n\n\tvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n\n");
Restaurante menosPlato=new Restaurante(); 
menosPlato.setSirvePlato(total-1);
System.out.print("  * por cada plato servido quedan en el almacen:\n");
System.out.print("    "+menosPlato.getSirvePlato()+" platos ("); 
System.out.print((platoA-2)+" huevos y "+(platoB-1)+" raciones de chorizo).\n\n");  
   

 
    }
}
