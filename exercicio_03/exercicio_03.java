import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matricula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		
		double[] notas = new double[5];
		
		int contador = 0;
		
		do {
			System.out.println("informe uma nota entre 0 e 10");
			System.out.println("Digite " + (contador + 1) + "a nota:");
			double temp = leitor.nextDouble();
			
			if (temp >=0 && temp <=10) {
				notas[contador] = temp;
				contador++;
			}else {
				System.out.println("A nota" + temp + " � invalida! ");
			}
		}while(contador < 5);
		
		System.out.println();
		System.out.println("----------- RELATRIO------------");
		System.out.println("Matrcula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for (int i = 0 ; i<notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);

		
		}
		
		leitor.close();	
		

	}

}

