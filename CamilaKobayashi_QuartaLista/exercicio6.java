/*Descrição:soma 10 valores inteiros
Autora: Camila Gonçalves Kobayashi
Data:30.05.2023*/

import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args){
        Scanner leitor= new Scanner(System.in);

        //Variáveis

        int valor,soma=0;
        int cont=1;

        while(cont<=4){
            System.out.println("Digite um número: ");
            valor= leitor.nextInt();
            cont++;
            
            if(valor>0){
                soma+=valor;
              
            }
        }
        System.out.println("A soma dos valores inseridos é: "+soma);
        double raiz= Math.sqrt(soma);
        System.out.println("A raiz quadrada é: "+ raiz);

        
    }
}