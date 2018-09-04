package aula;

public class QuintaAula {
	public static void main(String [] args) {
		String str = "Isto é uma String";
		String xyz = new String("Isto é uma String do Java");
		
		if( str==xyz ) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if ( str.equals ( xyz ) ) {
			//MANEIRA CORRETA DE SE COMPARAR O CONTEÚDO DAS STRINGS
		}
			System.out.println( "Tamanho da String" + str.length() );
			System.out.println( "Substring: " + str.substring(0,10));
			System.out.println("Caracter na posição 5: " + str.charAt(5));
			
			
			
	}

}
