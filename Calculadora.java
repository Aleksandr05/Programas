import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Qual � o primeiro n�mero?");
			n1 = input.nextInt();
			System.out.println("Qual o segundo n�mero?");
			n2 = input.nextInt();
		}
		
		System.out.println("Soma: "+(n1+n2));
		System.out.println("Subtra��o: "+(n1-n2));
		System.out.println("Multiplica��o: "+(n1*n2));
		System.out.println("Divis�o inteira: "+(n1/n2));
		System.out.println("M�dulo: "+(n1%n2));

		
		
		
	}

}
