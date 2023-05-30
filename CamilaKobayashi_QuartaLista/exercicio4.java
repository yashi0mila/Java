/*Descricão: verifica a quantidade de caracteres
Autora:Camila Gonçalves Kobayashi
Data:30.05.2023*/

import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //variáveis

        String t1;
        
        t1=" ";

        System.out.println("Digite uma palavra: ");
        t1=leitor.nextLine();

     

        if(t1.length() <= 10){
            System.out.println("Essa palavra é uma palavrinha" + t1.length());
        }else{
            System.out.println("Essa palavra é um palavrão" + t1.length());
        }

    }
}