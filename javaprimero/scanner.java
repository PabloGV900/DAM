import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer de la consola
        
        System.out.print("Introduce un número: "); // Mensaje para el usuario
        int numero = scanner.nextInt(); // Leer un número entero
        
        System.out.println("Has introducido: " + numero); // Mostrar el número introducido
        
        scanner.close(); // Cerrar el scanner
    }
}
