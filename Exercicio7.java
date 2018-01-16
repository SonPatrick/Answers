//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 7 : Leia um vetor de 12 posições e troque os 6 primeiros valores pelos 6 últimos e vice-e-versa. Escreva ao final o vetor obtido.
package exercicios;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        int vec[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int temp[] = Arrays.copyOf(vec, 6);
        
	System.arraycopy(vec, 6, vec, 0, 6);
        System.arraycopy(temp, 0, vec, 6, 6);
        
	for (int i = 0; i < vec.length; i++)
            System.out.print(vec[i] + " ");        
    }
}
