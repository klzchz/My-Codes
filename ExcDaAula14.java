
package exc.da.aula.pkg14;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author cil.8093898840
 */
public class ExcDaAula14 {

  public static void main(String[] args) {

        int[] a = {24, 33, 99, 11, 68, 2, 77, 38, 55,};
        int troca;
        int begin;
        int middle;
        int end;
       
                        
        for (int x = 0; x < a.length - 1; x++) {
            int valor = x;
            for (int y = valor + 1; y < a.length; y++) {
                if (a[y] < a[valor]) {
                    valor = y;
                }
            }
            troca = a[x];
            a[x] = a[valor];
            a[valor] = troca;
        }
                
        int vlr = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor a ser localizado!"));
        int vm = (a[0] + a[a.length - 1]) / 2;
        int control = 0; 
        
        
        if (vlr > vm) {
            for (int x = 0; x < a.length; x++) {
                if (a[x] == vlr) {
                    JOptionPane.showMessageDialog(null, "Valor=> " + vlr +" Posição=> " + x, "Pesquisa_Binária", JOptionPane.INFORMATION_MESSAGE);
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                JOptionPane.showMessageDialog(null, "Valor inexistente " + vlr, "Pesquisa_Binária", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            for (int x = 0; x < a.length; x++) {
                if (a[x] == vlr) {
                    JOptionPane.showMessageDialog(null, "Valor=> " + vlr + " Posição=> " + x, "Pesquisa_Binária", JOptionPane.INFORMATION_MESSAGE);
                    control = 1;
                    break;
                }
            }
            if (control == 0) {
                JOptionPane.showMessageDialog(null, "Valor inexistente " + vlr, "Pesquisa_Binária", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Valores Ordenados => " + Arrays.toString(a),"Seleção e Troca",JOptionPane.PLAIN_MESSAGE); 
                
        System.exit(0);
  }
}
