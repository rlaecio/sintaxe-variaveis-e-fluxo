
public class CalculaIr {

	public static void main(String[] args) {
		double salario = 1900.0;

		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Seu IR é de 7.5%");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("Seu IR é de 15%");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Seu IR é de 22.5%");
		}
	}

}
