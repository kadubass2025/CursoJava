package INTRODUCAO.JavaCore.FmodificadorEstatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios ={1,2,3,4,5,6,7,8,9,10,11,12};

    static {//desta forma o sendo static o bloco é inicializado apenas uma vez
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO APENAS UMA VEZ");
        episodios = new int[100];
        for (int i=0; i<episodios.length;i++){
            episodios[i] = i+1;
        }
    }
    {// sem o static toda vez que criar um objeto ele será inicializado
        System.out.println("DENTRO DO BLOCO DE INICIALIZAÇÃO TODA VEZ QUR CRIAR UM OBJETO");
    }

    public Anime(String nome) {
        this.nome = nome;
    }


    public Anime() {
        episodios = new int[100];
        for (int i=0; i<episodios.length;i++){
            episodios[i] = i+1;
        }

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
