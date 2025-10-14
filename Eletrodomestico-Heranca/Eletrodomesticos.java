public class Eletrodomesticos{
	
	protected String nome;
	protected int voltagem; //110v
	
	public String getNome(){
		return nome;
	}
	
	public int getVolt(){
		return voltagem;
	}
	
	public void ligar(){
		System.out.println("Ligado(On)");
	}
	
	public void desligar(){
		System.out.println("Desligado(Off)");
	}
	
	public void mostrarInfo(String nome, int volt){
		System.out.println("Nome: " + nome);
		System.out.println("Voltagem: " + volt);	
	}
	
	
}
