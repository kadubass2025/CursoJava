package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Stark Federal");
        funcionario.setIdade(40);
        funcionario.setSalarios(new double[]{1200, 5000, 12000});

        funcionario.imprime();

    }
}
