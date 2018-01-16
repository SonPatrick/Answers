//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 5 : Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes
//a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.

package exercicios;

public class Exercicios {
    public static void main(String[] args) {  
       int[]vetor = new int[12];
		int  x, y,b,a,soma;
		
		for(int i =0; i<12; i++){
			vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("digite um numero da posição "+(i)));
		}
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
		
		a = vetor[x];
		b = vetor[y];
		
		soma = a+b;
		
		JOptionPane.showMessageDialog(null, "Resultado: "+soma);
				
	} 
} 

