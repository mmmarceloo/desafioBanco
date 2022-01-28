
public class ContaCorrente extends Conta{

	@Override
	public void extrato() {
		System.out.println(" *** extrato da conta corrente***");
		super.imprimirInfosComuns();
	}
	
	
	
}
