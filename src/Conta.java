
public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected double investimento;
	
	
	public Conta() {
			this.agencia = Conta.AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++;
			this.investimento = 0;
		}
	

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void investir(double valor) {
		this.saldo -= valor;
		this.investimento += valor;
		
		
	}
	public void resgate() {
		this.saldo += investimento * 1.1;
		this.investimento = 0;
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Investimento: %.2f", this.investimento));
	}

}
