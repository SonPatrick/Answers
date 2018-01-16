//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 4 : Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano.
//Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre 
//uma mensagem informando o saldo médio e o valor do crédito. (use o comando caso-de e não faça repetições) Saldo médio Percentual:
//de 0 a 200 nenhum crédito
//de 201 a 400 20% do valor do saldo médio
//de 401 a 600 30% do valor do saldo médio
//acima de 601 40% do valor do saldo médio.

package exercicios;
import javax.swing.JOptionPane;

public class Exercicios {
	private static double salMed;
    private static double valCred;
    private static int opt;

	public static void main(String[] args) {
		salMed = Double.parseDouble(JOptionPane.showInputDialog("Saldo médio : \n"));
		valCred = (int) salMed;
	
		if(salMed >=0 && salMed <=200){
			JOptionPane.showMessageDialog(null, "Nenhum crédito");
			
		}else if(salMed >=201 && salMed <=400){
			valCred=salMed+(salMed*0.20);
			JOptionPane.showMessageDialog(null, "Seu crédito é :"+ valCred);
			
		}else if(salMed >=401 && salMed <=600){
			valCred=salMed+(salMed*0.30);
			JOptionPane.showMessageDialog(null, "Seu crédito é :"+ valCred);
			
		}else if(salMed >=201 ){
			valCred=salMed+(salMed*0.40);
			JOptionPane.showMessageDialog(null, "Seu crédito é :"+ valCred);	
		}
				
	} 
} 

