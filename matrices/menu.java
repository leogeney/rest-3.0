/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-18
 */
public class menu {
    String platos[] = new String[3];
    int datos[][];
    String semana[] = {"lunes", "martes" , "miercoles" , "jueves" , "viernes","sabado"};
    Plato plato1,plato2,plato3;
    
    



   
  

   

    
   
    public void crearMenu(){
    
    //platos = new String[cantidad];
    
   // int i = 0;
    
   // while(i<cantidad){
     //   platos[i] =JOptionPane.showInputDialog( "ingrese el plato " + (i+1));
   // i++;
   // }
       String nPlato1,nPlato2,nPlato3;
       int prPlato1,prPlato2,prPlato3;
       
        nPlato1 = JOptionPane.showInputDialog("Nombre del plato 1");
        prPlato1 = Integer.parseInt(JOptionPane.showInputDialog("Precio del plato 1"));

        
        nPlato2 = JOptionPane.showInputDialog("Nombre del plato 2");
        prPlato2 = Integer.parseInt(JOptionPane.showInputDialog("Precio del plato 2"));

        
        nPlato3 = JOptionPane.showInputDialog("Nombre del plato 3");
        prPlato3 = Integer.parseInt(JOptionPane.showInputDialog("Precio del plato 3"));


   
   
   
         plato1 = new Plato(nPlato1,prPlato1);
         plato2 = new Plato(nPlato2,prPlato2);
         plato3 = new Plato(nPlato3,prPlato3);

        platos[0] = plato1.getNombre();
        platos[1] = plato2.getNombre();
        platos[2] = plato3.getNombre();
    }
    
    
    
    public void ingresarDatos(){
    datos = new int[6][platos.length];
    
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < platos.length; j++) {
                datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("ventas del dia " +semana[i]+": plato " +platos[j]) );
            }
        }
    
    }
    public void conocerPlatosTotales(){
        
        int platosTotales= 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < platos.length; j++) {
                platosTotales+=datos[i][j];
            }
        }
        JOptionPane.showMessageDialog(null,"los platos vendidos fueron:" + platosTotales + " en total. ");
        JOptionPane.showMessageDialog(null,"el promedio de todos los platos es: " + platosTotales/(platos.length*6) );

    }
    
    
    public void conocerSemanaMayor(){
        int filaMayor = 0,sumaMaxima = 0;
        
        for (int i = 0; i < 6; i++) {
            int sumaFila = 0;
            for (int j = 0; j < platos.length; j++) {
                sumaFila+=  datos[i][j];
            }
            
            if(sumaFila > sumaMaxima){
            sumaMaxima =sumaFila;
            filaMayor = i;
            }
            
        }
                JOptionPane.showMessageDialog(null,"Dia de la semana donde mas se vendio fue de: " + filaMayor );
                JOptionPane.showMessageDialog(null,"promedio del dia la semana que mas se vendio" + filaMayor/platos.length);

                
                int filaMenor = 0;
            int sumaMinima = Integer.MAX_VALUE;
    
            for (int i = 0; i < 6; i++) {
            int sumaFilam = 0;
            for (int j = 0; j < platos.length; j++) {
                sumaFilam+=  datos[i][j];
            }
            
            if(sumaFilam < sumaMinima){
            sumaMinima =sumaFilam;
            filaMenor = i;
            }
            
        }
                    JOptionPane.showMessageDialog(null,"promedio del dia de la semana que menos se vendio" + filaMenor/platos.length);

    
                     Random random = new Random();
        int indiceAleatorio = random.nextInt(platos.length); 
        String datoAleatorio = platos[indiceAleatorio]; 

                            JOptionPane.showMessageDialog(null,"el plato recomendado es: " + datoAleatorio);

        int diaAleatorio = random.nextInt(semana.length); 
        String datoAlea = semana[diaAleatorio]; 

                                    JOptionPane.showMessageDialog(null,"mejor dia de la semana para almorzar:" + datoAlea );

                            
                                        
        int numFilas = datos.length;
        int numColumnas = datos[0].length;

        
        int[] sumaColumnas = new int[numColumnas];
                                    
                                    
                     for (int j = 0; j < platos.length; j++) {
            int suma = 0;
            for (int i = 0; i < 6; i++) {
                suma += datos[i][j];
            }
            sumaColumnas [j] = suma;
        }

        
        int columnaMayor = 0;
        int sumaMax = sumaColumnas[0];

        for (int j = 1; j < numColumnas; j++) {
            if (sumaColumnas[j] > sumaMax) {
                sumaMax = sumaColumnas[j];
                columnaMayor = j;
            }
        }

                                                  JOptionPane.showMessageDialog(null,"cantidad de platos que mas se vendieron" + columnaMayor   );

                            
                            
                            
                            
        
}
    
    public void EncontrarDia(){
     int mayor = 0;
    String fila = "";
    int columna = 0;

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < datos.length; j++) {
            if (datos[i][j] > mayor) {
                mayor = datos[i][j];
                fila = semana[i];
                columna = j;
            }
        }
    }
                            JOptionPane.showMessageDialog(null,"el plato que mas se vendio fue el: " +columna+ " del dia:" + fila + " y fueron" + mayor);

    
    int menor = 0;
    String filam = "";
    int columnam = 0;

    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < datos.length; j++) {
            if (datos[i][j] > mayor) {
                menor = datos[i][j];
                filam = semana[i];
                columnam = j;
            }
        }
    }
                            JOptionPane.showMessageDialog(null,"el plato que mas se vendio fue el: " +columnam+ " del dia:" + filam + " y fueron" + menor);
                            
                            
                            
                            
                            
                            
    }
    
    
    
    
    
   
    
    
}
