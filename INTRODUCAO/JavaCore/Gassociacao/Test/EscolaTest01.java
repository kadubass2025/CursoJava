package INTRODUCAO.JavaCore.Gassociacao.Test;

import INTRODUCAO.JavaCore.Gassociacao.dominio.Escola;
import INTRODUCAO.JavaCore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Prof. Getúlio");
        Professor professor2 = new Professor("Prof. Adolf");
        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Escola Adroaldo", professores);
        escola.imprime();
    }
}
