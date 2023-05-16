/*Descrição: Lê 4 números, calcula o quadrado de cada, soma e mostra
Autora: Camila Gonçalves Kobayashi
Data: 07.05.2023*/

import java.util.Scanner;

//Classe principal
public class exercicio2{
    
     public static void main(String args []){

        Scanner leitor = new Scanner (System.in);

        //Variáveis
        int n1, n2, n3, n4, soma;

        //Inicializa as variáveis
        soma = 0;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0; 

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = leitor.nextInt();

        System.out.println("Digite o quarto número: ");
        n4 = leitor.nextInt();

        //Calcula o quadrado
        soma = (n1^2) +(n2^2) + (n3^2) + (n4^2);

        System.out.println("O resultado dessa soma é igual a: "+soma);

     }
}