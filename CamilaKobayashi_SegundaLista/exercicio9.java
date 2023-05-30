/*Descrição:Identificar se é igual ou maior
Autora: Camila Gonçalves Kobayashi
Data: 30.05.2023 */

import java.util.Scanner;

public class exercicio9{
    public static void main (String[] args){

         Scanner leitor= new Scanner(System.in);

         //variáveis

         double n1,n2;

         //inicialização

         n1=n2=0.0;

         System.out.println("Digite o primeiro número: ");
         n1=leitor.nextDouble();

         System.out.println("Digite o segundo número: ");
         n2=leitor.nextDouble();


         if(n1==n2){
         System.out.println("Os números são iguais!");
         }else if(n1>n2){
            System.out.println("O primeiro é maior!");
         }else{
            System.out.println("O segundo é maior!");
         }
           
         }
}