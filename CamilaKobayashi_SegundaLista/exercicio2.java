/*Descrição: Programa para receber três números e descobrir qual é o maior
Autora: Camila Gonçalves Kobayashi
Data: 17.05.2023*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        //Variáveis

        Double n1, n2, n3 = 0.0;

        System.out.println("Digite um número: ");
        n1 = leia.nextDouble();

        System.out.println("Digite mais um número: ");
        n2 = leia.nextDouble();

        System.out.println("Digite mais um número: ");
        n3 = leia.nextDouble();

        if(n1>n2 && n1>n3)
        System.out.println(+n1+": Este número é maior que os outros!");

        else if(n2>n1 && n2>n3)
        System.out.println(+n2+": Este número é maior que os outros!");
        
        else
        System.out.println(+n3+": Este número é maior que os outros!");



    }
    
}
