package INTRODUCAO.JavaCore.Gassociacao.Test;

import INTRODUCAO.JavaCore.Gassociacao.dominio.Jogador;
import INTRODUCAO.JavaCore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
       Jogador jogador1 = new Jogador("Pelé");
       Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
