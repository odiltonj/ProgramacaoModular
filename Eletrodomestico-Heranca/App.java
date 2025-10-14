public class App{
	public static void main(String[] args){
	
		Liquidificador l1 = new Liquidificador();
		l1.nome = "Mondial";
		l1.voltagem = 110;
		l1.velocidade = 1;
		
		l1.mostrarInfo(l1.getNome(), l1.getVolt());
		l1.ligar();
		l1.centrifugar();
		System.out.println("Nivel de velocidade "+ l1.velocidade);
	}
}
