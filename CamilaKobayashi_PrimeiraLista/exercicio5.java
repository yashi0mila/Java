/*Descrição: Classifica uma pessoa pela idade
 Autora: Camila Gonçalves Kobayashi
 Data: 07.05.2023
*/

import java.util.Scanner;

public class exercicio5{
   
     public static void main(String args []){

        Scanner leitor = new Scanner (System.in);

        //Variáveis
         int idade;

         //Inicialização das variáveis
         idade = 0; 
         
         System.out.println("Insira a sua idade: ");
         idade = leitor.nextInt();

         if(idade>65){
            System.out.println("Você é um idoso!");
         }else if(idade>19){
            System.out.println("Você é um adulto!");
         }else if(idade>12){
            System.out.println("Você é um adolescente!");
         }else{
         System.out.println("Você é uma criança");
         }
      }
}
