/*Descrição:Recebe três números e se a soma for diferente de 48 ou 71, continua recebendo 3 valores infinitamente
Autora: Camila Gonçalves Kobayashi
Data: 30.05.2023*/

import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args){

        Scanner leitor= new Scanner(System.in);

        //variáveis

        int n1,n2,n3,res;

        //inicialização das variáveis

        n1=n2=n3=res=0;

        System.out.println("Insira um valor: ");
        n1=leitor.nextInt();
        
        System.out.println("Insira mais um valor: ");
        n2=leitor.nextInt();

        System.out.println("Insira mais um valor: ");
        n3=leitor.nextInt();

        res=n1+n2+n3;

        while(res !=48 && res!=71){
            
            
            System.out.println("Insira um valor: ");
        n1=leitor.nextInt();
        
        System.out.println("Insira mais um valor: ");
        n2=leitor.nextInt();

        System.out.println("Insira mais um valor: ");
        n3=leitor.nextInt();

        res=n1+n2+n3;



        }
          System.out.println("Você atingiu o resultado");
        }
    }
