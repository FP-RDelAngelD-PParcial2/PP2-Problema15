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
        Random numAleatorio = new Random(); //Se genera el numero aleatorio
           for(int i=0;i<a.length;i++){
               for(int j=0; j<a.length; j++){
                   a[i][j]=numAleatorio.nextInt(9+1);//Se llena el arreglo con numeros hasta el 9 (decision personal para que la tabla no se vea
                                                     //feo y esas cosas)
                     if(j==10){ //Si j es igual a 10 toma el valor de los valores de las filas
                         c=0;
                          for(int k=0; k<a.length-1;k++){
                              c=a[i][k]+c;
                          }
                          a[i][j]=c;
                     }
                     if(i==10){ //Si i es igual a 10 toma el valor de los valores de las columnas
                         c=0;
                         for(int k=0;k<a.length-1;k++){
                             c=a[k][j]+c;
                         }
                         a[i][j]=c;
                     }
                     System.out.print("[" + a[i][j] + "]"); //Se imprime la tabla
               }
               System.out.print("\n");
            }
           return a;
     }
    public static void mostrarVector(int[][]a){ //Se muestran las filas y las columnas
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
