/*Descrição: 10 atributos para a classe alimento
Autora: Camila Gonçalves Kobayashi
Data:07.06.2023 */
import java.util.Scanner;
public class exercicio1_lista6{
    
    public static void main(String[] args){
        Scanner leitor= new Scanner(System.in);

        //Cria uma instância da classe alimento
        alimento fruta = new alimento("Arredondado", "Doce", "Floral", 'P', 100.45 );

        //acessando atributos
        System.out.println(fruta.formato1);
        System.out.println(fruta.sabor1);
        System.out.println(fruta.aroma1);
        System.out.println(fruta.tamanho1);
        System.out.println(fruta.qntdcarboidrato1);

    }
}

class alimento{
    String formato1, sabor1, aroma1;
    char tamanho1;
    double qntdcarboidrato1;

    public alimento(String formato, String sabor, String aroma, char tamanho,double qntdcarboidrato){
        formato1 = formato;
        sabor1 = sabor;
        aroma1 = aroma;
        tamanho1 = tamanho;
        qntdcarboidrato1 = qntdcarboidrato;
    }
}

