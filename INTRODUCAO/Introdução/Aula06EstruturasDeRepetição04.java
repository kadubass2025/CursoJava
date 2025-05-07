package INTRODUCAO.Introdução;

public class Aula06EstruturasDeRepetição04 {
    public static void main(String[] args) {
        // Valores de parcelas que vc pode pagar um  carro de até 30.000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <=valorTotal ; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
