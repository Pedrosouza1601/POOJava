//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //STATIC - NAO USA PROGRAMACAO ORIENTADA A OBJETOS

    public static void main(String[] args) {
        // Produto -
        // tamanho, cor, preco, unidade, marca, nome




        //TIPO NOME = new TIPO()


        Carro carro1 = new Carro("1.0", "Argo", "Fiat");
        carro1.mostrarInformacoes();

        Carro carro2 = new Carro("2.0", "Hyundai", "HB20");
        carro2.mostrarInformacoes();

        Musica musica1 = new Musica("Hoje e sexta feira","Mc Ryan SP", 600);
        musica1.mostrarInformacoes();

        Aluno aluno1 = new Aluno("Pedro", 8.0);
        aluno1.verificarNota();
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno("Ismael", 6.0);
        aluno2.verificarNota();
        aluno2.verificarStatus();

        ContaBancaria conta =  new ContaBancaria();
        conta.saldo = 5500.00;
        conta.titular = "Pedro";

        conta.depositar(300);
        conta.sacar(500);

        System.out.println("Saldo atual: " + conta.saldo);





    }
}