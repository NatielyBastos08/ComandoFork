/*Contagem de Vogais: Peça uma frase ao usuário e conte quantas vogais 
 * (a, e, i, o, u) ela contém.
 */
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		
		int contadoVogais = 0;
		String vogais = "aeiouAEIOU";
		

        for (int i = 0; i < frase.length(); i++) {
            if (vogais.indexOf(frase.charAt(i)) != -1) {
                contadoVogais++;
            }
        }

        
        System.out.println("Número de vogais na frase: " + contadoVogais);
        
        
        scanner.close();
				

	}

}
