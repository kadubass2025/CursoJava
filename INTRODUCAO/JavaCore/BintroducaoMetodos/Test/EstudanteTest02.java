package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Estudante;
import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Lívia do Amor";
        estudante01.idade = 42;
        estudante01.sexo = 'F';

        estudante02.nome = "Ricardo Santos";
        estudante02.idade = 42;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
