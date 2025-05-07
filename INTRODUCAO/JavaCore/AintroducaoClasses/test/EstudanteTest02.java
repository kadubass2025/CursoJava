package INTRODUCAO.JavaCore.AintroducaoClasses.test;

import INTRODUCAO.JavaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Xandão";
        estudante.idade = 41;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
