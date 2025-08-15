public class Musica {
    public String titulo;
    public String artista;
    public int duracaoEmSegundos;

    public void mostrarInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracao em Segundos: " + duracaoEmSegundos);
    }

    public Musica(String titulo, String artista, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }


    }

