package INTRODUCAO.Introdução;

public class Aula05IFELSEEstruturasCondicionais02 {
    public static void main(String[] args) {
        //Atividade: imprima
        //se idade < 15 imprima categoria infantil
        //se idade >=15 && idade < 18 imprima categoria juvenil
        //se idade >=18 imprima adulto

        int idade = 20;

        if(idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulto");

        }
    }
}       //OUTRA FORMA DE ESCREVER O MESMO CÓDIGO
        /*int idade = 20;
        String categoria
        if(idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil"
        }else{
            categoria = "Categoria Adulto"
        }
        System.out.println(categoria);
*/