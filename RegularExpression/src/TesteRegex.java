import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TesteRegex {
	public static void main(String[] args) {
		
		String email = new String();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu e-mail: ");
		email = input.next() + input.nextLine();
		
		Pattern padrao = Pattern.compile(".+@.+\\.[a-z]{3}");
		Matcher pesquisa = padrao.matcher(email);
		
		if(pesquisa.matches()){
			System.out.println("\nOK");
		}
		
		else {
			System.out.println("\nErro");
		}
	}
}
