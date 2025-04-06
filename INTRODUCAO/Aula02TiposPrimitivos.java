package INTRODUCAO;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {//atalho para não ter que digitar sempre public static digita psvm+tab
        //TIPOS PRIMITIVOS: int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000;
        byte idadeByte  = 10;
        short idadeshort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 'M';
        float salarioFloat = (float)2500.0d; /*casting é vc forçar uma variável a aceitar uma quantidade maior
        de caracter usa-se a palavra da variável entre() e coloca a primeira letra da variável que vc quer, neste caso double*/

        //Classe
        String nome = "Goku";/*String é uma classe e não um tipo primitivo, e começa sempre com a
        primeira letra maiúscula*/

        System.out.println("A idade é "+idade+" anos");//atalho ctrl D, duplica a linha
        System.out.println(verdadeiro);
        System.out.println(salarioFloat);
        System.out.println(caracter);
        System.out.println("Oi meu nome é "+nome);//atalho para System.out.println: vc digita sout+tab

    }
}
