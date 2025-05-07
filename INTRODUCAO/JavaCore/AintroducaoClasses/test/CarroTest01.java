package INTRODUCAO.JavaCore.AintroducaoClasses.test;

import INTRODUCAO.JavaCore.AintroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Corolla XEI";
        carro01.categoria = "Sedan";
        carro01.ano = 2019;

        carro02.nome = "Duster SCE";
        carro02.categoria = "SUV";
        carro02.ano = 2025;

        //carro01 = carro02; Uma forma de vc buscar a mesma referencia de outro objeto

        System.out.println("Nome: "+carro02.nome+ ", Categoria: "+ carro02.categoria+ ", Ano: "+carro02.ano);
        System.out.println("Nome: "+carro01.nome+ ", Categoria: "+ carro01.categoria+ ", Ano: "+carro01.ano);
    }
}


