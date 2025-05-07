package INTRODUCAO.Introdução;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * Operadores Básicos
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02; /* Operação de entre inteiro resultado será inteiro*/
        System.out.println(resultado);

        // %resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=, esses são operadores lógicos, que sempre retornam valores booleanos true ou false

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDEz = 10 == 10;
        boolean isDezDiferenteDEz = 10 != 10;
        System.out.println("Dez é maior que Vinte? "+isDezMaiorQueVinte);
        System.out.println("Dez é menor que Vinte? "+isDezMenorQueVinte);
        System.out.println("Dez é igual a Vinte? "+isDezIgualVinte);
        System.out.println("Dez é igual a Dez? "+isDezIgualDEz);
        System.out.println("Dez é diferente de Dez? "+isDezDiferenteDEz);

        //Operadores Lógicos
        // && (AND) ambos tem que ser verdadeiro/falso; || (OR) ; ! (NOT).

        // && (AND) nesta caso os dois tinham que ser verdade para retornar verdade
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Está dentro da lei? "+isDentroDaLeiMenorQueTrinta);
        System.out.println("Está dentro da lei? "+isDentroDaLeiMaiorQueTrinta);

        // ||(OR) neste caso apenas um precisa da condição verdade para retornar verdade
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança >valorPlaystation;
        System.out.println("Dá para comprar o Play 5? "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;//2800
        bonus -= 1000;//1800
        bonus *= 2;//3600
        bonus /= 2;//1800
        bonus %= 2;//0
        System.out.println("Bônus agora é: "+bonus);

        //++ --
        int contador = 0;
        contador += 1;// essa é uma forma de acrescentar mais 1
        contador ++;  // essa é uma forma mais limpa e usual de acrescentar mais 1
        contador--;   // essa é uma forma mais limpa e usual de diminuir 1
        ++contador;/* ATENÇÃO: o computador executa o que vem primeiro, se vc cololar o ++ou--
        na frente ele vai executar o ++ ou -- e depois o contador isso muda e muito o resultado final*/
        --contador;
        System.out.println("Contador agora é: "+contador);


    }
}
