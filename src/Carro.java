public class Carro {
    public String descricao;
    public String marca;
    public String modelo;
    public String nome;

    public void mostrarInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Descricao: " + descricao);
        System.out.println("Nome do carro: " + nome);

    }

    public Carro(String descricao, String marca, String nome) {
        this.descricao = descricao;
        this.marca = marca;
        this.nome = nome;
    }

}
