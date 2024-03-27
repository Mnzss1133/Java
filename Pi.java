package trab1;
//Serie de Leibniz -1, 1/3
public class Pi {
	 public static void main(String[] args) {
		 double soma =0;
		 int num=10000;
		 double termo;
		 for(int i=0;i<=num;i++) {
			
			  if(i%2==0){
				  termo=1.0/(2 *i+1);
			  }else {
				  termo=-1.0/(2*i+1);
			  }
			
			 soma+=termo;
			 
		 }
		 System.out.println(4*soma);
	 }
	 
		 
}	