package sistemabancario;

public class ControleSalarial {
	private double totalSalarios;

	public double getTotalSalrios() {
		return totalSalarios;
	}

	public void setTotalSalrios(Funcionario funcionario) {
		this.totalSalarios=this.totalSalarios +funcionario.getSalario();
		
	}
	public double getTotalSalarios() {
		return this.totalSalarios;
	}
	
	
	

}
