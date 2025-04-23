package INTRODUCAO;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares até 100
        int number = 0;
        while (number <= 100){
            System.out.print(number + ", ");
            number+=2;
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)// VERIFICA SE O NUMERO É PAR EX: I=10/2 RESTO ==0 ENTÃO É PAR
            System.out.print(i + ", ");
        }
    }
}
