
package projetos.antigos;


public class ProjetosAntigos {

   public static void main(String[] args) {
   /* Algoritimo está errado o certo é ele mostrar os maior valor do array e o menor e 
      depois mostrar a média aritimética 
   */
   int [] a = {20,5,10,25,35,40};
   int MAX = a[0];
   int MIN = a[0];
   int mediaArt = 0;

   
   for(int y = 0;y < a.length;y++){
       if(a[y] > MAX){
          MAX = a[y];
       
     }
       System.out.println("O valor maior e " + MAX);
          
   }
   for(int y = 0;y < a.length;y++){
       if(a[y] < MIN){
           MIN = a[y];
     }
        System.out.println("O valor menor e " + MIN);
        
    mediaArt = mediaArt + a[y];
           
        }
        mediaArt = mediaArt / a.length;
        
        
        
        System.out.println("Media aritmética e  " + mediaArt);
    }
}
