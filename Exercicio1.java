//UNIVERSIDADE FEDERAL DO OESTE DO PARÁ - UFOPA
//INSTITUTO DE ENGENHARIA E GEOCIENCIAS - IEG
//SISTEMAS DE INFORMAÇÃO
//LABORATÓRIO DE PROGRAMAÇÃO
//PROFESSOR : DEAN JAMES
//ACADEMICO : PATRICK J. MACÊDO MATRICULA : 201100896

//LISTA 1 - QUESTÃO 1 : Desenvolva um programa em Java que leia o nome e a idade de 3 pessoas e mostre o nome da pessoa mais 
//velha e o nome da pessoa mais nova.




package exercicios;

import javax.swing.JOptionPane;

public class Exercicios {
private static String nome1;
private static String nome2;
private static String nome3;
private static int idade1;
private static int idade2;
private static int idade3;
private static int opt;
    
    public static void main(String[] args) {
        nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa :");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa"));
        
        nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa :");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa"));
        
        nome3 = JOptionPane.showInputDialog("Digite o nome da terceira pessoa :");
        idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da terceira pessoa"));
        
        opt = Integer.parseInt(JOptionPane.showInputDialog("O que vocẽ deseja saber?\n\t1- Pessoa mais velha\n\t2- Pessoa mais nova"));
       
        switch(opt){
            case 1:
                if(idade1>idade2 && idade1>idade3){
                   JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome1 +" idade : "+idade1);
                }else if(idade2>idade1 && idade2>idade3){
                   JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome2 +" idade : "+idade2);
                }else if(idade3>idade1 && idade3>idade2){
                   JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome3 +" idade : "+idade3);
                }else{
                   JOptionPane.showMessageDialog(null, "Não há resultados");
                }
            break;
            
            case 2:
                if(idade1<idade2 && idade1<idade3){
                    JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome1 +" idade : "+idade1);
                }else if(idade2<idade1 && idade2<idade3){
                   JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome2 +" idade : "+idade2);
                }else if(idade3<idade1 && idade3<idade2){
                    JOptionPane.showMessageDialog(null, "Pessoa mais velha : " +nome3 +" idade : "+idade3);
                }else{
                   JOptionPane.showMessageDialog(null, "Não há resultados");
                }
                
            default: JOptionPane.showMessageDialog(null,"Opção inválida");
        }  
    }    
}
