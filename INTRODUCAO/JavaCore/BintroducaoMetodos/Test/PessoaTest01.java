package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*pessoa.nome  = "kakaroto";
        pessoa.idade = 200;*/
        pessoa.setNome("kakaroto");
        pessoa.setIdade(45);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());




    }
}
