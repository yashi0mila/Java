/*Descrição: Coverte um número em reais para dólar 
 Autora: Camila Gonçalves Kobayashi
 Data: 07.05.2023
*/

import java.util.Scanner;

public class exercicio3{
    
     public static void main(String args []){

        Scanner leitor = new Scanner (System.in);

        //Variáveis
        double real, dolar;

        //Inicialização das variáveis
        real = 0.0;
        dolar = 0.0;

        System.out.println("Digite um valor em real: ");
        real=leitor.nextDouble();

        dolar = (real/4.93);

        System.out.println("O valor em dólar é igual a: "+ dolar);
     }
}