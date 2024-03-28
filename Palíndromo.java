package trab1;

import java.util.Scanner;

public class Palíndromo {
	public static void main(String argv[]) {
	
	System.out.println("Digite a palavra: ");
	Scanner sc = new Scanner(System.in);
	String palavra = sc.nextLine();
	sc.close();
	
	String reversa="";
	for(int i = palavra.length()-1;i>=0;i--) {
		reversa+=palavra.charAt(i);
	}
	if(reversa.toLowerCase().equals(palavra.toLowerCase())) {
		System.out.println("Palíndromo");
	}else {
		System.out.println("Não é Palíndromo");
	}
	}
	
}
