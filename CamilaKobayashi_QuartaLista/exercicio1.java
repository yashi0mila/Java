/*Descrição: verifica se é divisível por 4
Autora: Camila Gonçalves Kobayashi
Data:30.05.2023*/

import java.util.Scanner;

public class exercicio1{

    public static void main(String[] args){
        Scanner leitor= new Scanner(System.in);

        //variáveis

        double n1,res;

        //inicialização das variáveis
        n1=0.0;
        res=0.0;

        System.out.println("Insira um número: ");
        n1=leitor.nextInt();

        res=n1*n1;

        if(res%4==0){
            System.out.println("Ele é divisível por 4");
        }else{
            System.out.println("Ele não é divisível por 4");
        }

    }
}