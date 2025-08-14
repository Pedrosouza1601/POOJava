//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //STATIC - NAO USA PROGRAMACAO ORIENTADA A OBJETOS

    public static void main(String[] args) {
        // Produto -
        // tamanho, cor, preco, unidade, marca, nome




        //TIPO NOME = new TIPO()
        Produto prod1 = new Produto();
        //       Instanciar a Classe
        prod1.nome = "Monitor";
        prod1.preco = 550.00;
        prod1.marca = "Dell";

        prod1.mostrarInformacoes();


        Produto prod2 = new Produto();
        prod2.nome = "Notebook";
        prod2.preco = 900.00;
        prod2.marca = "Dell";

        prod2.mostrarInformacoes();

        Carro carro1 = new Carro();
        carro1.marca = "Argo";
        carro1.nome = "Fiat";
        carro1.descricao = "1.0";
        carro1.mostrarInformacoes();

        Carro carro2 = new Carro();
        carro2.marca = "Hyundai";
        carro2.nome = "HB20";
        carro2.descricao = "2.0";
        carro2.mostrarInformacoes();

        Musica musica1 = new Musica();
        musica1.artista = "Mc Ryan SP";
        musica1.titulo = "Hoje e sexta feira";
        musica1.duracaoEmSegundos = 600;
        musica1.mostrarInformacoes();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        aluno1.nota = 8.0;
        aluno1.verificarNota();
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ismael";
        aluno2.nota = 6.0;
        aluno2.verificarNota();
        aluno2.verificarStatus();





    }
}