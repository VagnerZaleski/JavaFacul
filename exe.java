package programa;

import java.util.Scanner;

public class exe {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);


		int continuar = 0;
		while (continuar == 0) {
			
			System.out.println("Qual opera��o deseja realizar:\n" + "1: Adi��o (+), 2: Subtra��o (-),\n"
					+ "3: Divis�o (/), 4: Multiplica��o (*) ou 5: Sair");
			int escolha = leitor.nextInt();

			if (escolha == 1) {
				// +
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 + num2;

				System.out.println("O resultado da Adi��o foi: " + resultado);

			} else if (escolha == 2) {
				// -
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 - num2;

				System.out.println("O resultado da subtra��o foi: " + resultado);

			} else if (escolha == 3) {
				// divis�o
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				if (num1 == 0 || num2 == 0) {
					System.out.println("N�o � possivel dividir por 0(ZERO) ");
				}

				double resultado = num1 / num2;

			} else if (escolha == 4) {
				// multiplica��o
				System.out.println("Digite o primeiro numero:");
				double num1 = leitor.nextDouble();

				System.out.println("Digite o segundo numero:");
				double num2 = leitor.nextDouble();

				double resultado = num1 * num2;

				System.out.println("O resultado da multiplica��o foi: " + resultado);

			} else {
				System.out.println("Op��o " + escolha + " Invalida");
			}
			
			System.out.println();
			System.out.println("Deseja continuar?");
			System.out.println("Digite 0: Sim ou 1: N�o");

			continuar = leitor.nextInt();
			if (continuar != 0) {
				break;
			} 
		}
		leitor.close();
	}
}