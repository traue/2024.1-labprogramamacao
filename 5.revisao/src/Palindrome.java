import java.util.Scanner;

public class Palindrome {
    
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um texto: ");
		String text = sc.nextLine();
		
		if (verificaPalindrome(text)) {
		    System.out.println("É palindrome!");
		} else {
		    System.out.println("Não é palindrome!");
		}
		
		//é o mesmo que:
		//System.out.println(verificaPalindrome(text) ? "É palindrome" : "Não é palindrome");
		
		
	}
	
	private static boolean verificaPalindrome(String texto) {
	    String textoReverso = "";
	    for (int i = texto.length() - 1; i >= 0; i--) {
	        textoReverso += texto.charAt(i); // é o mesmo que a = a + b
	    }
	    
	   // if (texto.equalsIgnoreCase(textoReverso)) {
	   //     return true;
	   // } else {
	   //     return false;
	   // }
	   //é o mesmo
	    
	    return texto.equalsIgnoreCase(textoReverso);
	}
	
}
