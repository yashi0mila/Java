/*Descrição: Algoritmo para verificar se o número (entre 94 e 456) está correto
Autora: Camila Gonçalves Kobayashi
Data: 29.05.2023*/

import java.util.Scanner;

public class exercicio7{
    public static void main(String[] args){

        Scanner leitor= new Scanner(System.in);

        //variáveis

        double n1;

        //inicialização
        
        n1=0.0;

        System.out.println("Insira o número escolhido ou o resultado obtido: ");
        n1= leitor.nextDouble();

        if(n1>=94 && n1<=496){
        System.out.println("Acertou");

        }else{
        System.out.println("Tente de novo");
        }
    }
}