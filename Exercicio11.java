//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 11 : Leia uma matriz 8x 8 e escreva o maior elemento da diagonal principal e a soma dos elementos da diagonal secundaria.

package exercicios;

import javax.swing.JOptionPane;

public class Exercicios {
    private static int matrix[][] = new int [8][8];   
    private static int i, j, sum = 0, max =0;
    
    public static void main(String[] args) {  
        for (i=0;i<8;i++){
            for (j=0;j<8;j++){
                
                 matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros da matriz", i));
                
            }        
        }
        max = matrix[i][j];
        
        for (i=0;i<8;i++){
            for (j=0;j<8;j++){
             
                if(matrix[i][j] > max && (i==j)){
                   max = matrix[i][j];
                }
                if(i+j==9){
                    sum = sum + matrix[i][j];
                }
            }       
        }
        System.out.println("O maior valor é = "+max);
        System.out.println("A soma é = "+sum);
    }
}
    

