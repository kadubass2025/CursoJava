package INTRODUCAO.Introdução;

public class Aula06EstruturasDeRepetição03 {
    public static void main(String[] args) {
        //Crie um contador de 0 a 50 mas que ele interrompa quando chegar em 25
        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
