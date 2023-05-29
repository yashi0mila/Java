/*Descrição: Troca de valores
Autora: Camila Gonçalves Kobayashi
Data:29.05.2023*/

import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //variáveis

        double n1, n2, res;

        //inicialização

        n1=n2=res=0.0;

        System.out.println("Insira um valor: ");
        n1=leitor.nextDouble();

        System.out.println("Insira outro valor: ");
        n2= leitor.nextDouble();

        res=n1;
        n1=n2;
        n2=res;

        System.out.println("A inversão deles resulta em: "+n1+" e "+n2);
    }
}