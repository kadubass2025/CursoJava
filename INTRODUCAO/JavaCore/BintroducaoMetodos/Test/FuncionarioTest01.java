package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Stark Federal";
        funcionario.idade = 40;
        funcionario.salarios = new double[]{1200, 5000, 12000};

        funcionario.imprime();
        funcionario.imprimeMediaSalarios();
    }
}
