package sistemabancario;

public class TestaContaPoupInvest {

	public static void main(String[] args) {
		ContaPoupansa cp = new  ContaPoupansa ();
		ContaInvestimento ci = new  ContaInvestimento ();
						
		cp.saldo=1000;
		ci.saldo=2000;
		
		System.out.println("Correcão de Conta Poupança :"+cp.Correcao());
		System.out.println("Correcão de Conta Investimento :"+ci.Correcao());

	}

}
