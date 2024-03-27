package trab1;

public class Veiculo {
	
	//atributos
	int peso;	//em kg/
	int veloMax; //em km/h/
	float preco; //em reais/
	
	//Construtor para inicializar atributos com valor "0"
	public Veiculo(){
		this.peso=0;
		this.veloMax=0;
		this.preco=0.0f;
	}
	
	//construtor que recebe os atributos como argumentos
	public Veiculo(int peso,int veloMax,float preco){
		this.peso=peso;
		this.veloMax=veloMax;
		this.preco=preco;
	}
	
	//métodos getters
	public int getPeso() {
		return peso;
	}
	
	public int getVelo() {
		return veloMax;
	}
	
	public float getPreco() {
		return preco;
	}
	
	//métodos setters
	public void setPeso() {
		this.peso=peso;
	}
	
	public void setVelo() {
		this.veloMax=veloMax;
	}
	
	public void setPreco() {
		this.preco=preco;
	}
	
	
	public String toString() {
		return "Os valores de peso,velocidade máxima e preço do veículo são, respectivamente: "+peso+", "+veloMax+", "+preco;
	}

	public static void main(String argv[]) {
		//teste
		Veiculo veiculo1 = new Veiculo(1000,300,40000.5f);
		System.out.println(veiculo1);
	}
}