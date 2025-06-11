package INTRODUCAO.JavaCore.Gassociacao.Test;

import INTRODUCAO.JavaCore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Cafú");
        Jogador jogador03 = new Jogador("Dida");
        Jogador [] jogadores = {jogador01, jogador02, jogador03};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
