/*Descrição: Programa para calcular 15% de desconto de um produto
Autora: Camila Gonçalves Kobayashi
Data: 17.05.2023*/

import java.util.Scanner;

public class exercicio1{

    public static void main(String[] args){
        Scanner leia= new Scanner(System.in);

    //Variáveis
    Double valororiginal, res =0.0;
    Double valordesconto = 15.0;

    System.out.println("Insira o valor do produto: ");
    valororiginal= leia.nextDouble();

    res= (15*valororiginal)/100;

    System.out.println("Seu produto resulta em "+res+" reais, com 15% de desconto");
    }

}