package INTRODUCAO.Introdução;

import java.util.Scanner;

public class Aula05SWITCHEstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número de 1 a 7 para saber se é FDS ou dia de semana");
        byte dia = scanner.nextByte();

        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Opção inválida!!");

                scanner.close();
        }

    }
}
