//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 9 : Leia um vetor contendo letras de uma frase inclusive os espaços em branco. Retirar os espaços em branco do vetor e depois escreve-los.
package exercicios;

import javax.swing.JOptionPane;


public class Exercicios {
    private static String frase;
    private static String noSpace;
    private static int count;
    
	public static void main(String[] args) {  
		frase = JOptionPane.showInputDialog("Digite uma frase aqui");
				
		noSpace = frase.replaceAll(" ","");
		count=noSpace.trim().length();
		
		JOptionPane.showMessageDialog(null,"sua frase é :\n\n"+noSpace+"\n\n que contém : "+count+" caracteres");
	} 
} 

