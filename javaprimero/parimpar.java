/*Este es el algoritmo para saber si un numero es par o impar */

public class parimpar {

    public static void main(String[] args) {
        
        int num1 = 2;  /*Aqui tengo mi variable que va a ser un numero entero */

        if (num1 % 2 == 0){    /*Aqui estoy dandole la condición de que si mi variable num1 que en este caso es 2 al dividirla entre 2 y de resto 0 
                               me saque por pantalla que el numero es par y que sino cumple esta condicion me saque por pantalla que es impar */

            System.out.println("El numero " + num1 + " es par");

            return;
            
        }
        
        System.out.println("El numero " + num1 + " es impar");

    }
    
}
