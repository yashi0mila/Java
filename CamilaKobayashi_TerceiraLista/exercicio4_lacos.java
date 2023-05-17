/*Descrição: Mostra somente os números ímpares de 0 a 1000
Autora: Camila Gonçalves Kobayashi
Data:17.05.2023*/

public class exercicio4_lacos{
    public static void main(String[] args){

        //variáveis
        int n1= 0;

        do{
            n1++;
            if(n1 % 2!=0)
            System.out.println("Número ímpar: "+n1);
        }while(n1<1000);
    }
}