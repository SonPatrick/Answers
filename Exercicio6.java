//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 6 : Declare um vetor de 10 posições e o preencha com os 10 primeiros números impares e o escreva.
package exercicios;

public class Exercicios {
    public static void main(String[] args){
        int[] vetor = new int[10];
        int i = 0, slot = 0;
        do{
            if(i % 2 == 1){
                vetor[slot] = i;
                slot++;
            }
            i++;
        }while(slot < 10);
            for( i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    } 
}
