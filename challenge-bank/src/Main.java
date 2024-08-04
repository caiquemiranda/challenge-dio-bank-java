public class Main {
        public static void main(String[] args) {
            Conta cc = new ContaCorrente();
            Conta cp = new ContaPoupanca();

            cc.depositar(1000.0);
            cp.depositar(500.0);

            cc.imprimirExtrato();
            cp.imprimirExtrato();

            cc.transferir(200.0, cp);
            cc.imprimirExtrato();
            cp.imprimirExtrato();
        }

}
