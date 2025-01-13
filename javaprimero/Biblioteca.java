import java.util.Scanner;

public class Biblioteca{

    Scanner opcion = new Scanner(System.in);
    int elegir = 0;
    elegir = opcion.nextInt();



  public static void main (String[] args){

  

    while(elegir != 4){
      
      imprimemenu();
      elegir = opcion.nextInt();
      opcion.nextLine();

      if(elegir == 1){

        listalibros();
        
      }else if(elegir == 2){

       System.out.println("Que numero de libro quieres prestar?:");

        int nlib = opcion.nextInt();
        opcion.nextLine();

        prestalibros(nlib);
 
      }else if(elegir  == 3){

        System.out.println("Que numero de libro quieres devolver?:");

        int nlib = opcion.nextInt();
        opcion.nextLine();
    
        devuelvelibros(nlib);

      }else if (elegir == 4){
        
        break;
 
      }     
    }
  }

  public static void listalibros(){

    for(int i = 0; i < titulos.length; i++){
      System.out.print(i + "  ");
      System.out.print(titulos[i]);
      
    }
  }
  public static void imprimemenu(){

System.out.println("1 lista libros");
System.out.println("2 presta libro");
System.out.println("3 devuelve libro");
System.out.println("4 salir");
System.out.print("Selecciona opción: ");

    }

  public static void prestalibros(int n){
    
    for(int i = 0; i < titulos.length; i++){
      System.out.print(i + "  ");
      System.out.print(estadoprestamo[i]);
      
    }
    
    }

  public static void devuelvelibros(int x){



    }
}
