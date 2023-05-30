/*Descricão: conta de 10 a 0
Autora:Camila Gonçalves Kobayashi
Data:30.05.2023*/

public class exercicio5{
    public static void main(String[] args){

        //variáveis

        int numeros,n1;
        numeros=0;
        n1=11;

        for(numeros= n1-1; numeros<=10 && numeros>=0; numeros--){
            System.out.println(numeros);
        }
        System.out.println("Fim");
    }
}