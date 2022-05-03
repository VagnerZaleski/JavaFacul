import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in) ;
		
		String[] matriculas = new String[5];
		String[] nomes = new String[5];
		double[] notas1 = new double[5];
		double[] notas2 = new double[5];
		double[] notasFinais = new double[5];
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Dados do Aluno:");
			System.out.println("-------------");
			
			System.out.println("Informe a matricula:");
			matriculas[i] = leitor.nextLine();
			
			System.out.println("Informe o nome:");
			nomes[i] = leitor.nextLine();
			
			System.out.println("Informe a nota 1:");
			notas1[i] = leitor.nextDouble();
			
			System.out.println("Informe a nota 2:");
			notas2[i] = leitor.nextDouble();
			
			notasFinais[i] = (notas1[i] + notas2[i]) /2;
			
			leitor.nextLine();
		}
		
		System.out.println("********** RELATORIO ************");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Matricula: " + matriculas[i]);
			System.out.println("Nomes: " + nomes[i]);
			if(notasFinais[i] >= 6) {
				System.out.println("Aprovado (X) Sim ()Não");
			}else {
				System.out.println("Aprovado () Sim (X)Não");
			}
			
			System.out.println("Nota Final: " + notasFinais[i]);
			System.out.println();
					
			}
		
		leitor.close();
		
		

	}
}

