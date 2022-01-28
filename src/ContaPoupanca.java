
public class ContaPoupanca extends Conta{

	@Override
	public void extrato() {
		System.out.println(" *** extrato da conta poupanca***");
		super.imprimirInfosComuns();
	}
	
	
	
}
