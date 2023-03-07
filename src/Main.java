public class Main {
    public static void main(String[] args) {
        // Primera parte, le damos valores a la funcion suma y lo guardamos en una variable.
        int resultado = suma(3,4, 4);
        System.out.println("El resultado de la suma es " + resultado);

        // Segunda parte, creamos el objeto MiCoche y le añadimos la funcion de añadir
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("Mi coche posee " + miCoche.puertas + " puertas");
    }

    // Pimera parte, creamos una funcion suma con tres parametros.
    public static int suma(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
}
// Segunda parte, creamos la clase coche y declaramos la variable
// para almacenar las puertas y una funcion para incrementarla.
class Coche {
        public int puertas = 4;

        public void AgregarPuerta(){
            this.puertas++;
        }

    }
