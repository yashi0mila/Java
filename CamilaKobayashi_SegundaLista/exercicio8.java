/*Descrição: Algoritmo para identificar se o aluno foi aprovado ou reprovado
Autora: Camila Gonçalves Kobayashi
Data: 29.05.2023*/

import java.util.Scanner;

public class exercicio8{
    public static void main(String[] args){
        Scanner leitor= new Scanner(System.in);

        //variáveis

        double n1;

        //inicialização

        n1=0.0;

        System.out.println("Insira a nota que precisa ser verificada: ");
        n1=leitor.nextDouble();

        if(n1>=5 && n1<=10){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}