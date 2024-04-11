package sistemabancario;

public class ControleBonus {
	private double totalBonus=0;

	public double getTotalBonus() {
		return this.totalBonus;
	}

	public void setTotalBonus(Funcionario funcionario) {
		this.totalBonus = totalBonus +funcionario.getBonus();
	}
	
	

}
