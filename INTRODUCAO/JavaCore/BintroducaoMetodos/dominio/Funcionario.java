package INTRODUCAO.JavaCore.BintroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[]salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario:salarios){
            System.out.print("Salários: "+ salario + ", ");
        }
    }
    public void imprimeMediaSalarios(){
        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia Salarial: "+media);
    }
}
