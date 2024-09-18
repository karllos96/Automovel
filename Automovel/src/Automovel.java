
public class Automovel {
	private String marca;
	private String modelo;
	private String cor;
	private int ndeportas;
	private String potencia;
	private int ano;
	private String categoria;
	
	public Automovel (String marca, String modelo, String cor, int ndeportas, String potencia, int ano, String categoria) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ndeportas = ndeportas;
		this.potencia = potencia;
		this.ano = ano;
		this.categoria = categoria;
	}
	
	public void ImprimirInfoAuto (){
		System.out.println("_________Automóvel_________");
		System.out.println("*****"+ marca + "  " + modelo + "*****");
		System.out.println("Cor: " + cor);
		System.out.println("Ano: "+ ano);
		System.out.println("Potência: " +potencia);
		System.out.println("Número de Portas: " + ndeportas);
		System.out.println("Categoria: " + categoria);
	}
	
	public static void main(String[] args) {
		Automovel cronos = new Automovel ("FIAT", "Cronos", "Branco", 4, "1.5", 2023, "Sedã");
		Automovel hilux = new Automovel ("TOYOTA", "HILUX", "Vermelho", 4, "2.8", 2024, "Picape");
		
		cronos.ImprimirInfoAuto();
		hilux.ImprimirInfoAuto();
	}

}
