package trab1;

public class NumerosPrimos {
	public static void main(String argv[]) {
		
		
	for(int num =2;num<=100;num++) {	
			int numDivisores = 0;
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				numDivisores++;
			}
			
		}
		 if (numDivisores==2) {
			System.out.println(num);
		
		 }
	}
	}
}