import java.util.Scanner;

public class AloMundo {
	
	public static void main(String[] args) {
        
		String nome, cidade;
		int idade;
		
		try (Scanner leitor = new Scanner(System.in)) {
			System.out.print("Digite seu nome:");
			nome = leitor.next();
			
			System.out.println("Olá,seja bem vindo "+nome);
			
			System.out.print("Digite sua idade:");
			idade = leitor.nextInt();
					
			System.out.print("Digite sua cidade:");
			cidade = leitor.next();
		}
		
		System.out.println("Nome:"+nome);
		System.out.println("Idade:"+idade);
		System.out.println("Cidade:"+cidade);
		
				
		
	}

}
