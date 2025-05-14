package INTRODUCAO.JavaCore.BintroducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void diminuirDoisNumeros(){
            System.out.println(21-6);
    }
    public void multiplicarDoisNumeros(int nun1, int nun2){
        System.out.println(nun1*nun2);
    }

    public double dividirDoisNumeros (double num1,double num2){
        return num1/num2;
    }
    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    }

