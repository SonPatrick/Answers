//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 10 : Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.

package exercicios;

public class Exercicios {
    private static int matrix[][] = new int [5][5];   
    private static int i, j;
    
    public static void main(String[] args) {  
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                 if(i==j){
                     matrix[i][j] = 1;
                }else{
                     matrix[i][j] = 0;
                 }
            }        
        }
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
             System.out.print(matrix[i][j]+"");
            }
        System.out.print("\n");
        }
        
    }
}
    

