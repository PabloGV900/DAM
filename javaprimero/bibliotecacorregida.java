import java.util.Scanner;

public class bibliotecacorregida {

    public static String[] titulos = {
            "Cien años de soledad - Gabriel García Márquez",
            "Don Quijote de la Mancha - Miguel de Cervantes",
            "Orgullo y prejuicio - Jane Austen",
            "1984 - George Orwell",
            "El gran Gatsby - F. Scott Fitzgerald",
            "Moby Dick - Herman Melville",
            "El ruido y la furia - William Faulkner",
            "Crimen y castigo - Fiódor Dostoyevski",
            "El viejo y el mar - Ernest Hemingway",
            "La casa de los espíritus - Isabel Allende",
            "La sombra del viento - Carlos Ruiz Zafón",
            "El túnel - Ernesto Sabato",
            "Fahrenheit 451 - Ray Bradbury",
            "Cumbres borrascosas - Emily Brontë",
            "La metamorfosis - Franz Kafka",
            "Los miserables - Victor Hugo",
            "El alquimista - Paulo Coelho",
            "Harry Potter y la piedra filosofal - J.K. Rowling",
            "El principito - Antoine de Saint-Exupéry",
            "Rayuela - Julio Cortázar"
    };
    
    public static String[] estadoprestamo = {
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado",
            "no prestado", "no prestado"
    };
    
    static Scanner opcion = new Scanner(System.in);
    static int elegir = 0;

    public static void main(String[] args) {
        while (elegir != 4) {
            imprimemenu();
            elegir = opcion.nextInt();
            opcion.nextLine();

            if (elegir == 1) {
                listalibros();
            } else if (elegir == 2) {
                System.out.println("¿Qué número de libro quieres prestar?:");
                int nlib = opcion.nextInt();
                opcion.nextLine();
                prestalibros(nlib);
            } else if (elegir == 3) {
                System.out.println("¿Qué número de libro quieres devolver?:");
                int nlib = opcion.nextInt();
                opcion.nextLine();
                devuelvelibros(nlib);
            } else if (elegir == 4) {
                break;
            }
        }
        System.out.println("Gracias por usar nuestro programa");
    }

    public static void listalibros() {
        for (int i = 0; i < titulos.length; i++) {
            System.out.print(i + "  ");
            System.out.println(titulos[i]);
        }
    }

    public static void imprimemenu() {
        System.out.println("+------------------------+");
        System.out.println("|    1. Lista de libros   |");
        System.out.println("|    2. presta libros     |");
        System.out.println("|    3. devuelve libros   |");
        System.out.println("|    4. salir             |");
        System.out.println("+-------------------------+");
        System.out.print("Selecciona opción: ");
    }

    public static void prestalibros(int numlib) {
        if (numlib < titulos.length && numlib >= 0) {
            if (estadoprestamo[numlib].equals("prestado")) {
                System.out.println(titulos[numlib] + " ya está prestado");
            } else {
                estadoprestamo[numlib] = "prestado";
                System.out.println(titulos[numlib] + " ha sido prestado");
            }
        } else {
            System.out.println("Número de libro inválido");
        }
    }

    public static void devuelvelibros(int numlib) {
        if (numlib < titulos.length && numlib >= 0) {
            if (estadoprestamo[numlib].equals("no prestado")) {
                System.out.println(titulos[numlib] + " no está prestado");
            } else {
                estadoprestamo[numlib] = "no prestado";
                System.out.println(titulos[numlib] + " ha sido devuelto");
            }
        } else {
            System.out.println("Número de libro inválido");
        }
    }
}