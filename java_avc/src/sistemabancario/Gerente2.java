package sistemabancario;

public class Gerente2 extends Funcionario {
	int senha;
	
	double getBonus() {
		return super.getBonus()+ 5000;
	}
	
	public boolean verificaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
}