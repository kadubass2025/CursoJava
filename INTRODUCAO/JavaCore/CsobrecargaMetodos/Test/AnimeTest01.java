package INTRODUCAO.JavaCore.CsobrecargaMetodos.Test;

import INTRODUCAO.JavaCore.CsobrecargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Acuda Kuru", "TV", 50, "Ação");
        //anime.setGenero("Ação");

        /*anime.setNome("Acuda kuru");
        anime.setTipo("TV");
        anime.setEpisodios(50);*/

        anime.imprime();
    }

}
