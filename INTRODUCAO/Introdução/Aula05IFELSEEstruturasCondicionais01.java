package INTRODUCAO.Introdução;

public class Aula05IFELSEEstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade>=18;

        //A confição IF sempre tem que retornar verdadeiro ou falso (booleano)
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado!!");
        }else {
            System.out.println("Não Autorizado!!");
        }
        // !(NEGAÇÃO) uma forma de "ELSE" para falar caso contrário
        if (!isAutorizadoComprarBebida) {
            System.out.println("Raposo, não pode!!");

        }
    }
}
