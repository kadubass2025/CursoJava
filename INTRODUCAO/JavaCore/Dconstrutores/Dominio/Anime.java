package INTRODUCAO.JavaCore.Dconstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;


    public Anime(String nome,String tipo, int episodios, String genero){
        System.out.println("AGORA COM O CONSTRUTOR!!");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(){//SOBRECARGA CONSTRUTOR

    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }



    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

