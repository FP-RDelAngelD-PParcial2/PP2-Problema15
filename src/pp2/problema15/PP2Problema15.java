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
    }
    public static int[][] llenarTabla(int[][]a){
        Scanner entradaEscaner = new Scanner(System.in);   
        for (int i=0; i<10; i++){ 
            for(int j=0; j<10; j++){
               System.out.print("Introduce un número para la posición [" + i + "] [" + j + "]"); //i inidica la posición
               a[i][j]=entradaEscaner.nextInt(); 
            }
        }
        return a;
    }
    public static void sumarFila(int[][]b){
        int sumaFila; 
        for(int i=0; i<10; i++){
             for(int j=0; j<10; j++){
                sumaFila=i+j;
             }
         }
    }
    public static void sumarColumna(int[][]b){
         for(int i=0; i<10; i++){
             for(int j=0; j<10; j++){
                
             }
         }
    }
}
