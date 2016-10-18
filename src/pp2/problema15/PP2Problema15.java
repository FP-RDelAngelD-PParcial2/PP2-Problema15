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
        llenarTabla(tabla);
        mostrarVector(tabla);

    }
    public static int[][] llenarTabla(int[][]a){
        int c;
        Random numAleatorio = new Random();
           for(int i=0;i<a.length;i++){
               for(int j=0; j<a.length; j++){
                   a[i][j]=numAleatorio.nextInt(100+1);
                     if(j==10){
                         c=0;
                          for(int k=0; k<a.length;k++){
                              c=a[i][k]+c;
                          }
                          a[i][j]=c;
                     }
               }
            }
           return a;
     }
    public static void mostrarVector(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
