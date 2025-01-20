/*Este es el algoritmo de los numeros primos */

public class Nprimos {

    public static void main(String[] args) {

        int num = 4;    /*Declaro mi variable y su valor */

        boolean primo = true;     /*Declaro una variable boolean a la que llamo primo y la doy el valor de true */

        for (int i = 2; i < num; i++) {   /*Aqui le estoy indicando un bucle en el que crea una variable i que su valor es 2
                                            y le digo que mientras 2 sea menor que mi variable num que en este caso es 5 le sume 1
                                            de esta forma a 2 le sumará de 1 en 1 hasta que sea igual que mi variable para si poder 
                                            dividirlo entre si mismo*/

            if (num % i == 0) {           /*Aqui le estoy poniendo la condicion de que: si mi variable num al dividirla entre mi 
                                            variable i me da de resto 0 me indique que el numero no es primo o lo que es lo mismo
                                            poner que mi variable primo es false ya que si el numero es divisible por los numeros 
                                            anteriores a el no es primo */

                primo = false;

                break;                    /*con este break estoy diciendole a mi programa que termine el bucle */
            }
        }

        if (primo)                        /*Con este if pongo la condición de que si mi resultado es un primo true saque por pantalla 
                                            que el numero es primo */

            System.out.println("El numero " + num + " es primo.");

        else                              /*Con este else le estoy diciendo que si el if no se cumple saque por pantalla que el numero
                                            no es primo */

            System.out.println("El numero " + num + " no es primo.");

    }

}
