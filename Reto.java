public class Reto {

    public static void main(String[] args) {
        System.out.println("Convertir de decimal a binario");

        int numeroDelUsuario;

        numeroDelUsuario = 15;

        if (numeroDelUsuario <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {

            String binario = "";
            while (numeroDelUsuario > 0) {
                binario = (numeroDelUsuario % 2) + binario;
                numeroDelUsuario = numeroDelUsuario / 2;
            }

            System.out.println("El número en binario es: " + binario);
        }

    }

}