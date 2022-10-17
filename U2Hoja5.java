/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package u2hoja5.u2hoja5;

/**
 *
 * @author Eloy
 */
public class U2Hoja5 {

    public static void main(String[] args) {
    
    Restaurante plato1=new Restaurante(0,0);
    plato1.addHuevos(10);
    plato1.addChorizos(10);
    System.out.println("El numero de platos disponibles es de: "+plato1.getNumPlatos());
    plato1.getHuevos();
    plato1.getChorizo();
    plato1.sirvePlato();
    plato1.getHuevos();
    plato1.getChorizo();
    System.out.println("El numero de platos disponibles es de: "+plato1.getNumPlatos());
    }
}
