public class App {
    public static void main(String[] args) {

        //Primera parte

        int resultado = sumaParams(10, 15, 5);

        System.out.println(resultado);

        //Segunda Parte

        Coche miCoche = new Coche();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        miCoche.AñadirPuerta();
        System.out.println(miCoche.puertas);
             
    }

    public static int sumaParams(int a, int b, int c) {
        return a + b + c;
    }

    static class Coche {

        public int puertas = 0;

        public void AñadirPuerta() {
            this.puertas++;
        }
    }


 
}
