package p2_ejerciciosuml;
import java.util.Scanner;
public class P2_EjerciciosUML {
    public static void main(String[] args) {

        //Por medio del escaner se establece el tamano del arreglo 
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos alumnos desea ingresar?");
        int Num_Alumnos = leer.nextInt() ; 
        double []Alturas  = new double [Num_Alumnos];

        // Utilizando el Bucle for, se lleba el arreglo
        for (int i = 0; i<Alturas.length; i++) {
            System.out.println("Ingrese la altura # "+(i+1)+": ");
            Alturas[i]=leer.nextDouble();       
    }
        // se crea un objeto
        Estatura estatura = new Estatura(Alturas);

        // se llaman los metodos que calculan la estaura maxima y minima
        System.out.println("La estatura mayor es: " + estatura.calcularAlturaMax());
        System.out.println("La estatura menor es: " + estatura.calcularAlturaMin());

 
}
}
    