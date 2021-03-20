
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbuel
 */
public class Punto3 
{
    public static void main (String[] args) 
    {
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 1:\n");
           System.out.println("Ingrese la dimension de los vectores:");
           int dimension = input.nextInt();
           int[][] Vectorcolumna;
           int[][] Vectorfila;
           int[][] Vectorresultado;
           Vectorcolumna = new int[dimension][1];
           Vectorfila = new int[1][dimension];
           Vectorresultado = new int[dimension][1];
           Llenar (Vectorcolumna);      
           Graficar(Vectorcolumna);
           Llenar (Vectorfila);
           Graficar(Vectorfila);       
           Multiplicacion (Vectorcolumna,Vectorfila,Vectorresultado,dimension);
    }     
    
    static int[][] Llenar (int[][] matriz)
    {
        Scanner input = new Scanner(System.in);
        for (int x=0; x < matriz.length; x++) 
           {
             for (int y=0; y < matriz[x].length; y++) 
             {    
                System.out.println("Ingrese el numero para la posicion (" + (x+1) + "-" + (y+1) +")"); 
                int a = input.nextInt(); 
                matriz[x][y] = a;
             }     
           }
        return matriz;
    }
    static int[][] Graficar (int[][] matriz)
    {
        System.out.print("El vector graficado es: " + "\n");
        for (int x=0; x < matriz.length; x++) 
           {
             for (int y=0; y < matriz[x].length; y++) 
             {
                System.out.print (matriz[x][y] + "\t");
                if (y==matriz[x].length-1) System.out.print("\n");
             }     
           }
        return matriz;
    }
    static int[][] Multiplicacion (int[][] matriz1, int[][] matriz2, int[][] matriz3, int n)
    {
        for (int x=1; x < n+1; x++)
           {
            int multiplicacion = matriz1[x-1][0]*matriz2[0][x-1];
            matriz3[x-1][0] = multiplicacion;
           }  
        int suma = matriz3[0][0];
           for (int i = 1;i<matriz3.length;i++)
           {
               suma = suma + matriz3[i][0];
           }
           System.out.print ("El resultado de la multiplicacion por vectores es " + suma + "\n");
        return matriz3;
    }
}       

