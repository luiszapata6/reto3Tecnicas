
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
public class punto1 
{
    public static void main (String[] args) 
    {
           Scanner input = new Scanner(System.in);
           System.out.println("Punto 1:\n");
           System.out.println("Ingrese el numero de filas:");
           int n = input.nextInt();
           System.out.println("Ingrese el numero de columnas:");
           int m = input.nextInt();
           int[][] matriz;
           matriz = new int[n][m];
           Llenar (matriz);
           Graficar (matriz);
           
           
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
}
