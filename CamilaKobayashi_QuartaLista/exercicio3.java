import java.util.Random;

/*Descrição:
Autora: Camila Gonçalves Kobayashi
Data:30.05.2023*/



public class exercicio3{
    public static void main(String[] args){
        Random gerador=new Random();


        int cont,lugar,soma;
        cont=lugar=soma=0;

        while(cont<50){
            cont++;
            lugar= gerador.nextInt(50);

            System.out.println(lugar);
            soma+=cont;
        }

        System.out.println("A soma é igual a: "+soma);
    }
}