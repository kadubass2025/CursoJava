package INTRODUCAO.JavaCore.BintroducaoMetodos.Test;

import INTRODUCAO.JavaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 2);
        System.out.println(result);//Uma forma de retornar

        System.out.println(calculadora.divideDoisNumeros02(20,2));// outra forma de retornar

        calculadora.imprimeDivisaoDoisNumeros(40,0);//Uma forma de imprimir
    }
}
