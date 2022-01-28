
public class main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		Conta pp = new ContaPoupanca();
		System.out.println(cc.getAgencia());
		System.out.println(cc.getNumero());
		System.out.println(cc2.getAgencia());
		System.out.println(cc2.getNumero());
		cc2.depositar(200);
		pp.depositar(500);
		 cc.extrato();
		 cc2.extrato();
		 pp.extrato();
		 cc2.transferir(50, cc);
		 cc.extrato();
		 cc2.extrato();
		 pp.investir(100);
		 pp.extrato();
		 pp.resgate();
		 pp.extrato();
		 
		

	}

}
