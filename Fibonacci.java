package trab1;

public class Fibonacci {
	public static void main(String argv[]) {
		
		int	n1=0;
		int n2=1;
		int c;
		System.out.println(n1+n2);//primeiro número da sequencia de fibonacci
		for(int i=1;i<15;i++) {
			
			 c=n1+n2;
			 n1=n2;
			 n2=c;
			System.out.println(c);
			}
	}
}
