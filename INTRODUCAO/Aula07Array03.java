package INTRODUCAO;

public class Aula07Array03 {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40};// outra forma de declarar arrays

       /*for (int i = 0;i < nomes.length;i++)
        System.out.println(nomes[i]);*/

        for (int i : num) {// outra forma de utilizar o for
            System.out.println(i);
        }

    }
}

