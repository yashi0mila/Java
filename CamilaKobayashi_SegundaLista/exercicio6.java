/*Descrição: Descobre o valor total de picolés a partir da quantia dos próprios
Autora: Camila Gonçalves Kobayashi
Data: 29.05.2023*/

import java.util.Scanner;

public class exercicio6{
    
    public static void main(String[] args){

        Scanner leitor= new Scanner(System.in);

        //variáveis

        double kiwi, laranja, roma, res;

        //inicialização das variáveis

        kiwi=laranja=roma=res=0;

        System.out.println("Digite a quantidade de kiwi que você pretende comprar: ");
        kiwi=leitor.nextDouble();

        System.out.println("Digite a quantidade de laranjas que você pretende comprar: ");
        laranja=leitor.nextDouble();

        System.out.println("Digite a quantidade de romãs que você pretende comprar: ");
        roma=leitor.nextDouble();

        res = kiwi * 3.20 + laranja * 2.39 + roma * 7.99;

        System.out.println("Sua compra deu: "+ res + " reais");
    }
}