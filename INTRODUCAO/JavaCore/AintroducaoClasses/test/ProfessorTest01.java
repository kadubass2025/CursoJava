package INTRODUCAO.JavaCore.AintroducaoClasses.test;

import INTRODUCAO.JavaCore.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Frederico";
        professor.idade = 45;
        professor.sexo = 'M';
        System.out.println
        ("Nome: " + professor.nome + ", " + "Idade: " + professor.idade + ", " + "Sexo: " + professor.sexo);
    }

}
