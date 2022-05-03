import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) throws FileNotFoundException {
		File arquivo = new File("C:\\Users\\Vagner\\eclipse-workspace\\Facul\\src\\grupos-tabulados.txt"); // caminho para ler o arquivo
		Formatter gravador = new Formatter("C:\\Users\\Vagner\\Desktop\\exer\\numeros.txt"); // colocar o caminho que vai salvar o arquivo

		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();

		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;

		while (leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dadosLinha = linha.split("\t");

			if (dadosLinha[0].equals("A")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoA = grupoA + valor;
			}

			else if (dadosLinha[0].equals("B")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoB = grupoB + valor;
			}

			else if (dadosLinha[0].equals("C")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoC = grupoC + valor;

			}

			else if (dadosLinha[0].equals("D")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoD = grupoD + valor;

			}

			else if (dadosLinha[0].equals("E")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoE = grupoE + valor;

			} else if (dadosLinha[0].equals("F")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoF = grupoF + valor;

			}
		}

		int total = (grupoA + grupoB + grupoC + grupoD + grupoE + grupoF);

		
			System.out.println("Grupo A: " + grupoA);
			gravador.format("Grupo A: " + grupoA + "\n");
			
			System.out.println("Grupo B: " + grupoB);
			gravador.format("Grupo B: " + grupoB + "\n");
			
			System.out.println("Grupo C: " + grupoC);
			gravador.format("Grupo C: " + grupoC + "\n");
			
			System.out.println("Grupo D: " + grupoD);
			gravador.format("Grupo D: " + grupoD + "\n");
			
			System.out.println("Grupo E: " + grupoE);
			gravador.format("Grupo E: " + grupoE + "\n");
			
			System.out.println("Grupo F: " + grupoF);
			gravador.format("Grupo F: " + grupoF + "\n");
			
			System.out.println("Grupo total: " + total);
			gravador.format("Grupo total: " + total + "\n");

		leitor.close();
		gravador.close();

	}

}
