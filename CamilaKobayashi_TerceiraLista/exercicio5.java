/*Descrição: Descobre o antecessor e o sucessor
Autora: Camila Gonçalves Kobayashi
Data: 29.05.2023*/

import java.util.Scanner;

public class exercicio5{

    public static void main(String[] args){
        
        Scanner leitor= new Scanner(System.in);

        //Variáveis
        
        int n1, res, res2;

        //inicialização

        n1=res=res2=0;

        System.out.println("Digite um número: ");
        n1=leitor.nextDouble();

        res = n1-1;
        res2 = n1+1;

        System.out.println("A ordem desses números será: " +res+n1+res2);
    }
}