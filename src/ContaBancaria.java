public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        saldo = saldo - valor;
    }


}
