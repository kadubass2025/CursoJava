package INTRODUCAO.Introdução;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {//Comando Crtl+Alt+L formata o código
        int[][] arrayInt = new int[3][];
        int[] array = {1, 2, 3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;//outra forma chamando a variável
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{10}, {23, 24}, {32, 35, 40}};//Outra forma de criar um array multidimensional

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.print(num + " ");

            }
        }
    }
}
