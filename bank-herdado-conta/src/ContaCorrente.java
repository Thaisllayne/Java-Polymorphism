// n�o herda os construtores
public class ContaCorrente extends Conta implements Tributavel{

	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // chamando o construtor da classe m�e
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
