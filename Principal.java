package trab1;



import java.util.Scanner;

public class Principal {
	public static void main(String argv[]) {
		
		//abrindo scanner para permitir ao usuário inserir dados
		Scanner sc = new Scanner(System.in);
		
		//inicializando atributos com valores inputados pelo usuário para o primeiro veiculo
		System.out.println("Digite o peso do primeiro veículo em quilos: ");
		int pesoV1= sc.nextInt();
		System.out.println("Digite a velocidade máxima do primeiro veículo em km/h: ");
		int veloV1=sc.nextInt();
		System.out.println("Digite o preço do primeiro veículo em reais: ");
		float precoV1=sc.nextFloat();
		
		//instanciando o objeto veiculo1 com parâmetros inputados pelo user para o primeiro veiculo
		Veiculo veiculo1 = new Veiculo(pesoV1,veloV1,precoV1);
		
		//inicializando atributos com valores inputados pelo usuário para o segundo veículo
		System.out.println("Digite o peso do segundo veículo em quilos: ");
		int pesoV2= sc.nextInt();
		System.out.println("Digite a velocidade máxima do segundo veículo em km/h: ");
		int veloV2=sc.nextInt();
		System.out.println("Digite o preço do segundo veículo em reais: ");
		float precoV2=sc.nextFloat();
		
		//instanciando o objeto veiculo1 com parâmetros inputados pelo user para o segundo veículo
		Veiculo veiculo2 = new Veiculo(pesoV2,veloV2,precoV2);
		
		//fechando o scanner
	    sc.close();
		
	    //printando o resultado para a vizualização do usuário 
		System.out.println("Detalhes do primeiro veiculo: "+veiculo1);
		System.out.println("Detalhes do segundo veiculo: "+veiculo2);
		
	}
}
