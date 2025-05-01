package INTRODUCAO;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5; meses
        //30,28,31,30; dias
        int[][] dias = new int[3][3];
        dias[0][0] = 31;//comando crtl D duplica a linha
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 28;
        dias[1][1] = 27;
        dias[1][2] = 26;
           //i  j
        dias[2][0] = 25;
        dias[2][1] = 24;
        dias[2][2] = 23;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {//sempre coloque[i] para correr todas a linhas do array

                System.out.println("Na posição [" + i + "][" + j + "] está armazenado o número " + dias[i][j]);

            }
        }
        System.out.println("-------------------------------------");

        for (int[]arrayBase: dias) {// aqui usamos o FOREACH ele pega todo o array e passa linha por linha int[][]
            for (int numeros: arrayBase){
                System.out.println("Aqui está o resultado: " + numeros);
            }

        }
    }
}
