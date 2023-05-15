/*Descrição: Calcula a média de quatro notas
Autora: Camila Gonçalves Kobayashi
Data: 07.05.2023
*/
import java.util.Scanner;

//Classe principal
public class exercicio1

    //Método que será executado primeiro
     public static void main(String args []) {

        Scanner leitor = new Scanner(System.in);

    //Criação de variáveis
    double n1, n2, n3, n4, media;

    //Inicialização das variáveis
    media = n1 = n2 = n3 = n4 = 0;

    System.out.println("Digite a primeira nota: ");
    n1= leitor.nextDouble();
    
    System.out.println("Digite a segunda nota: ");
    n2 = leitor.nextDouble();

    System.out.println("Digite a terceira nota: ");
    n3 = leitor.nextDouble();

    System.out.println("Digite a quarta nota: ");
    n4 = leitor.nextDouble();

    //Calcula a média
    media = (n1+n2+n3+n4)/4;

    //Mostra se o aluno passou, reprovou ou está de recuperação
    if (media <=5){
        System.ou.println("Está de recuperação");
    }else{
        System.out.println("Passou");
    }

    //Mostra a média
    System.out.println("A média é: " + media);
        
    }



