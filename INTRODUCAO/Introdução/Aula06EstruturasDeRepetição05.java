package INTRODUCAO.Introdução;


public class Aula06EstruturasDeRepetição05{
    public static void main(String[] args) {
        double valorTotal = 30000;

        // Começa em 30 parcelas (valor mínimo de R$ 1000)
        for (int parcela = 30; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            System.out.printf ("Parcela %d - R$ %.2f%n", parcela, valorParcela);
        }
    }
}