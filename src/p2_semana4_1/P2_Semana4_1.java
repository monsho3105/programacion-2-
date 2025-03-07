package p2_semana4_1;

import java.util.Scanner;

public class P2_Semana4_1 {
    public static void main(String[] args) {
        // Dado una lista A de componentes reales de 10 elementos y otra lista B de 10 elementos. Se pide
        //comparar los elementos de la lista A con los elementos de la lista B y en una lista C almacenar 1 si
        //los elementos son iguales y 0 si no lo son. Construir un programa que muestre todas las listas.
        Scanner leer=new Scanner (System.in);
        System.out.println("por favor ingrese cuantos elemetos quiere que aparezcan en la listas A & B");
        int Tamano_Lista = leer.nextInt();
        int []ListaA= new int [Tamano_Lista];         
        int []ListaB= new int [Tamano_Lista];         
        int []ListaC= new int [Tamano_Lista];         
        
        for (int i = 0; i <ListaA.length; i++) {
            System.out.print("ingrese el elemento # "+(i+1)+" de la lista A :");
            ListaA[i]=leer.nextInt();
            
        }
        System.out.println("hora vamos a llenar la lista B");
        for (int i = 0; i < ListaB.length; i++) {
            System.out.print("ingrese el elemento # "+(i+1)+" de la lista B :");
            ListaB[i]= leer.nextInt();
        }

        
        Listas Objeto = new Listas();
        Objeto.Llenar_Lista_C(ListaA, ListaB, ListaC);
       
        
        
        
        
    }    
}
