/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema15;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]tabla = new int[10][10];
        int[]fila = new int[10];
        int[]columna = new int [10];
        llenarTabla(tabla);
        sumarFila(tabla, fila);
        sumarColumna(tabla, columna);
    }
    public static int[][] llenarTabla(int[][]a){
        int c,b;
        Random numAleatorio = new Random();
           for(int i=0;i<10;i++){
               c = numAleatorio.nextInt();
              for(int j=0;j<10;j++){
               b = numAleatorio.nextInt();   
                  System.out.print(b+"\t");
              }
               System.out.println(c+"\n");//h
            }
           return a;
            }
    public static void sumarFila(int[][]b, int[]f){
        int suma = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
             suma=suma+b[i][j];
         }
        suma=f[i];
        }
            System.out.print(suma);
    }
    public static void sumarColumna(int[][]b, int[]c){
        int suma = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
             suma=suma+b[i][j];
         }
        suma=c[i];
        }
        System.out.print(suma);
    }
}
