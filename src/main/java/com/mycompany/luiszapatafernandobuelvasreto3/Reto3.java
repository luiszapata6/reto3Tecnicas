
package com.mycompany.luiszapatafernandobuelvasreto3;

import java.util.Arrays;
import java.util.Scanner;



public class Reto3 {
    
    public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);
       
       
       while(true){
        
        
        System.out.println("\nSeleccione una opción: \n");
        System.out.println("1. Crear y ver nueva matriz.");
        System.out.println("2. Cálculos con listado de enteros.");
        System.out.println("3. Multiplicación de vectores.");
        System.out.println("4. Producto cruz.");
        
        
        
           
        var x = input.nextInt();
        
       
           switch (x) {
                case 1:
                   Punto1();
                   break; 
                case 2:
                   Punto2();
                   break;
                 case 3:
                   Punto3();
                   break;
                case 4:
                   Punto4();
                   break;
                default:
                   System.out.println("Por favor seleccione una opción válida.\n");
                   break;
                   }
                }       
    }
    
    
           static void Punto1(){
           
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
           
           static int[][] Llenar (int[][] matriz){
           Scanner input = new Scanner(System.in);
           
        for (int x=0; x < matriz.length; x++){
             for (int y=0; y < matriz[x].length; y++) {    
                System.out.println("Ingrese el numero para la posicion (" + (x+1) + "-" + (y+1) +")"); 
                int a = input.nextInt(); 
                matriz[x][y] = a;
             }     
           }
        return matriz;
    }
    
        static int[][] Graficar (int[][] matriz){
            
        System.out.print("La matriz graficada es: " + "\n");
        for (int x=0; x < matriz.length; x++) {
             for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y] + "\t");
                if (y==matriz[x].length-1) System.out.print("\n");
             }     
           }
        
        return matriz;
    }
    
           static void Punto2(){
           
           Scanner input = new Scanner(System.in);
           System.out.println("Ingrese un listado de enteros separados por coma: ");
           String n = input.nextLine();
           convertidorDeStrings(n);
           }
           
           static void convertidorDeStrings(String n){
           
           
           String[] listaStrings = n.split(",");
           double[] listaEnteros = new double[listaStrings.length];
           for(int i = 0; i < listaStrings.length; i++){
                listaEnteros[i] = Double.parseDouble(listaStrings[i]);               
           }
           System.out.println("\nEl vector formado es: " + Arrays.toString(listaEnteros) + "\n");
           analistaVector(listaEnteros);
}
           
           static double[] analistaVector(double[] listaEnteros){
               
           double suma = 0;    
           double mayor = listaEnteros[0];
           double menor = listaEnteros[0];
           
           for (int j = 0; j < listaEnteros.length; j ++){
                suma = listaEnteros[j] + suma;
                if(listaEnteros[j] < menor){
                menor = listaEnteros[j];
                }
                if(listaEnteros[j] > mayor){
                mayor = listaEnteros[j];
                }
                }
           
           System.out.println("La suma del listado es: "+ suma);
           System.out.println("El promedio del listado es: "+  suma/listaEnteros.length);
           System.out.println("El menor dígito del listado es: "+ menor);
           System.out.println("El mayor dígito del listado es: "+ mayor);
                
           return listaEnteros;
           }
           
         static void Punto3(){
         
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
         Llenar2(Vectorcolumna);      
         Graficar2(Vectorcolumna);
         Llenar2(Vectorfila);
         Graficar2(Vectorfila);       
         Multiplicacion (Vectorcolumna,Vectorfila,Vectorresultado,dimension);
                  
         }
         
         static int[][] Llenar2(int[][] matriz){
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
    static int[][] Graficar2(int[][] matriz){
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
    static int[][] Multiplicacion (int[][] matriz1, int[][] matriz2, int[][] matriz3, int n){
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
           
           
         static void Punto4(){
           
          productoCruz();
           
         }

           static void productoCruz(){
               
           
           Scanner input = new Scanner(System.in);
           
           int[] vector1 = new int[3];
           int[] vector2 = new int[3];
           int[] vector3 = new int[3];

           
           System.out.println("Por favor ingrese los valores del primer vector:\n");
           System.out.println("x:");
           int x1 = input.nextInt();
           vector1[0] = x1;
           System.out.println("y:");
           int y1 = input.nextInt();
           vector1[1] = y1;
           System.out.println("z:"); 
           int z1 = input.nextInt();
           vector1[2] = z1;
           
           System.out.println("\nPor favor ingrese los valores del segundo vector:\n");
           System.out.println("x:");
           int x2 = input.nextInt();
           vector2[0] = x2;
           System.out.println("y:");
           int y2 = input.nextInt();
           vector2[1] = y2;
           System.out.println("z:"); 
           int z2 = input.nextInt();
           vector2[2] = z2;
           
           System.out.println("\nVector 1: " + Arrays.toString(vector1));
           System.out.println("\nVector 2: " + Arrays.toString(vector2));
           
           vector3[0] = (y1*z2) - (y2*z1);
           vector3[1] = -1*((x1*z2) - (x2*z1));
           vector3[2] = (x1*y2) - (x2*y1);
           
           System.out.println("\nEl vector resultado es: " +  Arrays.toString(vector3));
           
           
           }
           
           

}
           
         
           

       


           
           
           
           


    
    

