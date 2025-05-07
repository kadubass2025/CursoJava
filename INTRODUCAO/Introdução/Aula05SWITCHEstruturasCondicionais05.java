package INTRODUCAO.Introdução;

import java.util.Scanner;

public class Aula05SWITCHEstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite um número de 1 a 7 para saber o dia da semana:");
        byte dia = scanner.nextByte();

        //Imprima o dia da semana considerando o 1 dia como domingo
        //byte dia = 7; bloqueado para uso do scanner
        //CHAR, INT, BYTE, SHORT, ENUM, STRING (PODEM SER USADOS DENTRO DO SWITCH)
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break; //no switch o uso do break é importante, pois se não utilizar ele vai continuar imprimindo os dias seguintes neste caso
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida!!");
                break;

        }
        System.out.println("\nDigite a letra M ou F para saber o sexo:");
            String sexo = scanner.next().toUpperCase();//toUpperCase: transforma a letra digitada em maiúscula
            //String sexo = "M";
            switch (sexo){
                case "M":
                    System.out.println("HOMEM");
                    break;
                case "F":
                    System.out.println("MULHER");
                    break;
                default:
                    System.out.println("Letra inválida!!");
            }


        /*if (dia == 1){ USANDO O IF SERIA UMA FORMA DE FAZER SO QUE COM MUITO MAIS TRABALHO E SEM BOAS PRÁTICAS
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else {
            System.out.println("Nenhum nem outro");
        }*/
        scanner.close();
    }
}
