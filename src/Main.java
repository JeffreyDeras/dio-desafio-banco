public class Main {
    public static void main(String[] args) {

        Cliente Venilton = new Cliente();
        Venilton.setNome("Venilton");


        Conta cc = new ContaCorrente(Venilton);
        Conta poupanca = new ContaPoupanca(Venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
