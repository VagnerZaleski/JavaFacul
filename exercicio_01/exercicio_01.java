
public class exercicio_01 {

	public static void main(String[] args) {
		String matricula ="101010";
		String nome = "Joao";
		double nota1 = 5.5;
		double nota2 = 5.5;
		
		double notaFinal = (nota1 + nota2) / 2;
		
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		
		if(notaFinal >= 6 ) {
			System.out.println("Aprovado (X) Sim ()Não");
		}else{
			System.out.println("Aprovado () Sim (X)Não");
		}
		
		System.out.println("Nota Final: " + notaFinal);
		
		

	}

}
