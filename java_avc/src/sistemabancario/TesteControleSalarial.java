package sistemabancario;

public class TesteControleSalarial {

	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		controle.setTotalSalrios(f1);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(2000);
		controle.setTotalSalrios(f2);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
		Gerente g2 = new Gerente();
		g2.setSalario(10000);
		controle.setTotalSalrios(g2);
		System.out.println("Salarios pagos até agora: "+controle.getTotalSalarios());
		
	}

}
