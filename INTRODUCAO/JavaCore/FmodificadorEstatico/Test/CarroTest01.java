package INTRODUCAO.JavaCore.FmodificadorEstatico.Test;

import INTRODUCAO.JavaCore.FmodificadorEstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("MERCEDES", 295);
        Carro c3 = new Carro("AUDI", 290);

        Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
