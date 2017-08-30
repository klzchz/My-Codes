package class_pesq_exercicio15;

import javax.swing.JOptionPane;

public class Class_pesq_exercicio15 {
    
    public static void main(String[] args) {
 
       int[] vet = {10,5,20,15,30,25,40,35,45,55,60,50};
        int troca =0;
        String fim ="";

    for (int x=0; x< vet.length -1; x++){
       int valor=x;
              for(int i=valor+1;i <vet.length; i++){
	if (vet[i]<vet[valor]){
                      valor= i;
	}
              }	   
             
   troca= vet[x];
   vet[x]= vet[valor];
   vet[valor]=troca;
   
    }
    for(int x=0; x< vet.length;x++){
       fim+=" "+vet[x];
    }  

        int usuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int media = vet.length / 2;
        int controla = 0;

        if (usuario > vet[media]) {
            for (int cont = media; cont < vet.length; cont++) {
                fim = " ";
                if (vet[cont] == usuario) {
                  
                    controla = 1;
                    for(int cont1 = media; cont1<vet.length;cont1++){
                        fim = fim +" "+ vet[cont1];
                    }
                 JOptionPane.showMessageDialog(null, fim,
 	"Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            if (controla == 0) {
                JOptionPane.showMessageDialog(null, "Valor não encontrado " + usuario, 
		"Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            for (int cont = 0; cont < media; cont++) {
                fim = " ";
                if (vet[cont] == usuario) {
                    
                    controla = 1;
                    for(int cont2 = 0; cont2 < media; cont2++){
                         fim = fim +" "+ vet[cont2];
                    }
                  JOptionPane.showMessageDialog(null, fim,
 	"Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
            if (controla == 0) {
                JOptionPane.showMessageDialog(null, "Valor não encontrado ",
  		 "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}
    

