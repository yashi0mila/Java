/*Descrição: Calcula a área de um triângulo
Autora: Camila Gonçalves Kobayashi
Data: 29.05.2023*/

import java.util.Scanner;

 public class exercicio3{

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //Variáveis

        double base, altura, res;

        //inicialização

        base=altura=res=0.0;

        System.out.println("Insira o valor da base: ");
        base= leitor.nextDouble();

        System.out.println("Insira o valor da altura: ");
        altura= leitor.nextDouble();

        res= (base*altura)/2;

        System.out.println("O valor da área é igual a: "+res);
    }
 }
