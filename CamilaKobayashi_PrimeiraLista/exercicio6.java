/*Descrição: Calcula o perímetro de um círculo
 Autora: Camila Gonçalves Kobayashi
 Data: 07.05.2023
*/

import java.util.Scanner;

public class exercicio6{
   
     public static void main(String args []){

        Scanner leitor = new Scanner (System.in);

        //Variáveis
        Double raio, perimetro;

        //Inicialização das variáveis
        raio = perimetro = 0.0;

        System.out.println("Insira o valor do raio desse círculo: ");
        raio = leitor.nextDouble();

        perimetro = (2*3.14 * raio);

        System.out.println("O perímetro do circulo equivale a: "+perimetro);
     }
}
     