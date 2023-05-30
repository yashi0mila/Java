/*Descrição:Descobre se é par ou ímpar
Autora: Camila Gonçalves Kobayashi
Data: 30.05.2023
 */

import java.util.Scanner;

public class exercicio10{
    public static void main(String[] args){

        Scanner leitor= new Scanner(System.in);

        //variáveis

        int n1;

        //inicialização da variável

        n1=0;

        System.out.println("Insira um número para a sua verificação: ");
        n1=leitor.nextInt();

        if(n1/2==0){
            System.out.println("Esse número é par!");
        }else{
            System.out.println("Esse número é ímpar!");
        }
    }
}
