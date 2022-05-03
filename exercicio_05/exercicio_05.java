import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\Vagner\\eclipse-workspace\\Facul\\src\\grupos-tabulados.txt");
		
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine(); 
		
		int grupoA = 0;
		int grupoB = 0;
		int grupoC = 0;
		int grupoD = 0;
		int grupoE = 0;
		int grupoF = 0;
		
		while(leitor.hasNext()){
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

			}
			else if (dadosLinha[0].equals("F")) {

				int valor = Integer.parseInt(dadosLinha[1]);
				grupoF = grupoF + valor;

			}
		}
		
		int total = (grupoA + grupoB + grupoC + grupoD + grupoE + grupoF );
		
		System.out.println("Grupo A: " + grupoA);
		System.out.println("Grupo B: " + grupoB);
		System.out.println("Grupo C: " + grupoC);
		System.out.println("Grupo D: " + grupoD);
		System.out.println("Grupo E: " + grupoE);
		System.out.println("Grupo F: " + grupoF);
		
		System.out.println("Total: " + total);
		
		
		
			leitor.close();
			
		}


	}


