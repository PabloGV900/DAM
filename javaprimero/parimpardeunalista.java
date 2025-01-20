public class parimpardeunalista {
  
    public static void main(String[] args){
      
      int[] numeros = { 2, 3, 1, 4, 5, 6, 7, 8, 9,10,11,12};
      
      for ( int i = 0; i < numeros.length; i++) {
        
        if ( i % 2 == 0) {
          
          System.out.println( i + " es par.");
          
        }
        
        else {
          
          System.out.println (i + " es impar.");
          
        }
        
      }
      
    
    }
  }
