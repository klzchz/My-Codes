
package Algoritimo;

import javax.swing.JOptionPane;


public class Troca {
    /*Algoritimo de troca  pede  os numero de um vetor qualquer de tamnho 10 e
    e ordena os valores do menor para o maior  , mostrando  os valores digitados 
    depois mostra o maior e o menor valor das posições
    
    */
    public static void main(String[] args) {
         int a[];
         a= new int [10];
          
         int Troca = 0;
          int MAX = a.length ;
           int MIN =a.length;
         
           for(int i=0;i<a.length;i++){
                
       a[i] =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero"));
           }
          
          for(int x = 0; x <a.length - 1;x++){
              int valor = x;
              
          for(int I = valor+1;I<a.length;I++){
              if(a[I]<a[valor]){
                  valor = I;
              }
          }
            Troca = a[x];
            a[x] = a[valor];
            a[valor] = Troca;
           }
          
   
          for(int x = 0;x <a.length;x++){
               
              
              
             // JOptionPane.showMessageDialog(null, " Valor ordenado > " + a[x] + " Troca  > ", "Pesquisa_Binária", JOptionPane.INFORMATION_MESSAGE);
             
             System.out.println(+a[x]+" ");
             
          }
          for(int y = 0;y < a.length-1;y++){
       if(a[y] < MIN){
          MIN = a[y];
       
     }
          }
          System.out.println("O valor Menor e " + MIN);
          
            for(int z = 0;z < a.length-1;z++){
       if(a[z] > MAX){
          MAX = a[z];
       
     }
            }
          System.out.println("O valor Maior e " + MAX);
          
           System.exit(0);
        
      
            }
          }


