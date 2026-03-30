package Encap;

public class TestBanco {

	public static void main(String[] args) {
		
		ContaBancaria Conta_1 = new ContaBancaria();
		Conta_1.setTitular("Yuri");
		System.out.println("O valor que tem na sua conta é de " + Conta_1.getSaldo());
		Conta_1.deposito(150.50);
		System.out.println("Depois do deposito vc tem " + Conta_1.getSaldo() );
		
		// TODO Auto-generated method stub

	}

}
