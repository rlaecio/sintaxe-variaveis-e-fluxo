
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 17;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo !");
		}
		else {
			if(quantidadePessoas >=2) {
				System.out.println("Você não tem 18 mas esta acompanhado, "
						+ "você pode entrar");
			} else {
			System.out.println("Ïnfelizmente você não pode entrar");
			}
		}
	}

}
