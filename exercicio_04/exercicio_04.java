import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		double[] pesos = {0.05, 0.05, 0.2, 0.2, 0.5};

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matrcula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		double nFinal = 0;
		
		int contador = 0;
		
		do {
			System.out.println("Informar uma nota entre 0 e 10.");
			System.out.println("Digite a " + (contador + 1) + "ª nota:");
			double temp = leitor.nextDouble();
			
			if (temp >= 0 && temp <= 10) {
				//Valido
				notas[contador] = temp;
				nFinal = nFinal + (notas[contador] * pesos[contador]);
				contador++;
			} else {
				//Invalido
				System.out.println("A nota " + temp + "  invlida!");

		}
		} while(contador <5);
		
		System.out.println();
		System.out.println("---------- Relatorio ----------");
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome );
		
		for(int i = 0 ; i<notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}

		System.out.println("Nota final: " + nFinal);
		System.out.println();
		if (nFinal >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}

	leitor.close();

}
}