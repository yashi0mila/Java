/*Descrição: lê dois números inteiros e mostra os que estão entre eles
 Autora: Camila Gonçalves Kobayashi
 Data: 16.05.2023*/

 import java.util.Scanner;
 
 public class exercicio2_laco{

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        //Criação e atribuição de variáveis
        int n1 = 0;
        int n2 = 0;
        int numeros = 0;

        System.out.println("Digite um número: ");
        n1 = leia.nextInt();

        System.out.println("Digite mais um número: ");
        n2 = leia.nextInt();
        
        for(numeros= n1+1; numeros<n2; numeros++){
            System.out.println("Número: "+numeros);
        }
    }
 }

