
package p2_ejerciciosuml;


public class Estatura {
    private double[] alturas;

    // se crea un constructor con el atributo que vamos a usar
    public Estatura(double[] alturas) {
        this.alturas = alturas;
    }

    // Método para calcular la altura máxima
    public double calcularAlturaMax() {
        double max = alturas[0]; 
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > max) {
                max = alturas[i];
            }
        }
        return max;
    }

    // Método para calcular la altura mínima
    public double calcularAlturaMin() {
        double min = alturas[0]; 
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < min) {
                min = alturas[i];
            }
        }
        return min;
    }
}
