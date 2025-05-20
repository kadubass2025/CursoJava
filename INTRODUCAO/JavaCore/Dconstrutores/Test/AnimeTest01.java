package INTRODUCAO.JavaCore.Dconstrutores.Test;


import INTRODUCAO.JavaCore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {// USANDO CONSTRUTOR
        Anime anime = new Anime("Takukunacara", "Peida", 50, "MACHO");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();


        //anime.init("Acuda Kuru", "TV", 50, "Ação");
        //anime.setGenero("Ação");

        /*anime.setNome("Acuda kuru");
        anime.setTipo("TV");
        anime.setEpisodios(50);*/


    }

}
