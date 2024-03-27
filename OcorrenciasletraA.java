package trab1;

public class OcorrenciasletraA {
	public static void main (String argv[]) {
		String frase = "Os nomes da classe em java precisam comecar com uma letra e depois destas quaisquer combinações de letras e dígitos . \r\n"
				+ " * Como padrão, os nomes  são substantivos que iniciam com uma letra maiúscula.\r\n"
				+ " *  Para as constantes é costume utilizar sempre letras maiúsculas nos nomes ";
		
		int contador=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)=='a') {
				contador++;						
			}
		
		}
		System.out.println(contador);
	}

}

