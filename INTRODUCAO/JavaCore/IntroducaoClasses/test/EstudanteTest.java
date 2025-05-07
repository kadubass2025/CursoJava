package INTRODUCAO.JavaCore.IntroducaoClasses.test;

import INTRODUCAO.JavaCore.IntroducaoClasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "kakaroto";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
