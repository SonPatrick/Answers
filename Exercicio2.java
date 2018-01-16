//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 2 : O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
//(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escreva um algoritmo que leia
//o custo de fábrica de um carro e escreva o custo ao consumidor.
import javax.swing.JOptionPane;

public class main {
	private static double distribuidor = 0.28;
	private static double impostos = 0.45;
	private static double precoConsumidor;
	private static double custoFabrica ;
	private static double aux1, aux2;


	public static void main(String[] args) {
		custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fábrica do carro : ", custoFabrica));
		
		aux1 = precoConsumidor*distribuidor;
		aux2 = precoConsumidor*impostos;
		precoConsumidor = precoConsumidor-(aux1+aux2);
		
		JOptionPane.showMessageDialog(null,"Custo de Fábrica : "+custoFabrica+ " Valor total para o consumidor :"+precoConsumidor);
				
	}
}

