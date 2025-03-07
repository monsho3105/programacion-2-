package p2_semana4_1;
public class Listas {
    int []listaA;
    int []listaB;
    int []listaC;

    public Listas() {
    }
    
    public void Llenar_Lista_C (int[]listaA, int[]listaB, int[]listaC){
        for (int i = 0; i <listaA.length; i++) {
            if (listaA[i]==listaB[i]) {
                listaC[i]=1;   
            } else {
                listaC[i]=0;
            }   
        }
        System.out.println("Lista A:");
        for (int i = 0; i <listaA.length; i++) {
            System.out.print(listaA[i]+", ");
            }
        System.out.println(" ");

        System.out.println("Lista B:");
        for (int i = 0; i <listaB.length; i++) {
            System.out.print(listaB[i]+", ");
            
        }
                System.out.println(" ");

              System.out.println("la Lista C : ");
              System.out.println(" ");
            for (int j = 0; j <listaC.length; j++) {
          
                System.out.print(listaC[j]+", ");
                
            }

    
     
    
    }}
