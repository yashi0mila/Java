/*Descrição: Calcula a média de "N" números
Autora: Camila Gonçalves Kobayashi
Data: 15.05.2023*/

import java.util.Scanner;

public class exercicio3_lacos{
    public static void main(String[] optns){

        Scanner reader = new Scanner(System.in);

        //Variáveis
        int cont;
        double somadora, media;

        //Inicialização das variáveis
        cont = 0;
        somadora = media = 0.0;
        
        while(cont < 500){
            
            System.out.println("Digite um número: ");
            somadora += reader.nextFloat();
            
            cont++;

        }

        //média
        media = somadora/cont;
    
        System.out.println("A média é igual a: "+media);
    }
}