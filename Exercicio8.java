//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 8 : leia um vetor de 10 posições e acumule os valores do primeiro elemento no segundo,
//deste no terceiro e assim por diante. Ao final, escreva o vetor obtido.

package exercicios;

public class Exercicios {
    public static void main(String[] args) {  
        Integer[] vetor = new Integer[10];  
          
        for (int i = 0; i < 10; i++) {  
            vetor[i] = i + 1;  
        }  
          
        for (int i = 0; i <= vetor.length -1; i++) {  
            int antigo = vetor[i];  
            if (i > 0) {  
                vetor[i] += vetor[i-1];  
            }  
            System.out.printf("Vetor na posição %s era %s agora é %s\n", i, antigo, vetor[i]);  
        }  
    }  
}  
