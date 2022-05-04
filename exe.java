package programa;

import java.util.Scanner;

public class exe {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);


		int continuar = 0;
		while (continuar == 0) {
			
			System.out.println("Qual operação deseja realizar:\n" + "1: Adição (+), 2: Subtração (-),\n"
					+ "3: Divisão (/), 4: Multiplicação (*) ou 5: Sair");
			int escolha = leitor.nextInt();

			if (escolha == 1) {
				// +
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 + num2;

				System.out.println("O resultado da Adição foi: " + resultado);

			} else if (escolha == 2) {
				// -
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 - num2;

				System.out.println("O resultado da subtração foi: " + resultado);

			} else if (escolha == 3) {
				// divisão
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				if (num1 == 0 || num2 == 0) {
					System.out.println("Não é possivel dividir por 0(ZERO) ");
				}

				double resultado = num1 / num2;

			} else if (escolha == 4) {
				// multiplicação
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 * num2;

				System.out.println("O resultado da multiplicação foi: " + resultado);

			} else {
				System.out.println("Opção " + escolha + " Invalida");
			}
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.println("Digite 0: Sim ou 1: Não");

			continuar = leitor.nextInt();
			if (continuar != 0) {
				break;
			} 
		}
		leitor.close();
	}
}