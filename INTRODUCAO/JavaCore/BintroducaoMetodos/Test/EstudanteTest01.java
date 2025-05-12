package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Estudante;
import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Lívia do Amor";
        estudante01.idade = 42;
        estudante01.sexo = 'F';

        estudante02.nome = "Ricardo Santos";
        estudante02.idade = 42;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        /*System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
*/

    }
}
