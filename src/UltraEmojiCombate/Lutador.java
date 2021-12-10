package UltraEmojiCombate;



public class Lutador {
	
	//Atributos
	private String nome;
	private String nacionalidade;
	private double idade;
	private double altura;
	private double peso;
	private String categoria;
	private double vitorias;
	private double derrotas;
	private double empates;
	
	
	
	//metodos publicos
	
	public void apresentar() {
		
		System.out.println("Este é o participante:"+ this.getNome());
		System.out.println("Com nacionalidade:"+ this.getNacionalidade());
		System.out.println("Sua idade é:"+ this.getIdade()+ " anos!!");
		System.out.println("Pesando exatamente;"+ this.getPeso()+ " quilos!!");
		System.out.println("Com" + this.getAltura()+ " de altura!!");
		System.out.println("Com:" + this.getVitorias()+ " vitórias!");
		System.out.println(this.getDerrotas()+ " derrotas!!");
		System.out.println("Empates:" + this.getEmpates());
		System.out.println("=======================================");
		
	}
	public void status() {
		System.out.println(this.getNome()+ " é um peso " + this.getCategoria());
		System.out.println("Vitorias:"+ this.getVitorias());
		System.out.println("Derrotas:"+ this.getDerrotas());
		System.out.println("Empates:"+ this.getEmpates());
		System.out.println("=======================================");
	}
	public void ganharLuta() {
			this.setVitorias(this.getVitorias()+ 1);
			
	}
	
	public void perderLuta() {
		this.setVitorias(this.getVitorias()-1);
	}
	
	public void empatar() {
		this.setEmpates(this.getEmpates()+ 1);
	}
	//metodos especiais
	public Lutador(String no, String nac, double id, double alt, double pe,
			double vit, double der, double emp) {
		super();
		this.nome = no;
		this.nacionalidade = nac;
		this.idade = id;
		this.altura = alt;
		this.setPeso(pe);
		this.vitorias = vit;
		this.derrotas = der;
		this.empates = emp;
	}
	
	// metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public double getIdade() {
		return idade;
	}
	public void setIdade(double idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double pe) {
		this.peso = pe;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52) {
			this.categoria = "Invalido!!";
		}else if(this.peso <=70) {
			this.categoria ="Leve!!";
		}else if(this.peso <= 80.3) {
			this.categoria = "Medio!!";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado!!";
		}else 
		this.categoria = "Inválido!!";
		}
		
		
		
	
	public double getVitorias() {
		return vitorias;
	}
	public void setVitorias(double vitorias) {
		this.vitorias = vitorias;
	}
	public double getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(double derrotas) {
		this.derrotas = derrotas;
	}
	public double getEmpates() {
		return empates;
	}
	public void setEmpates(double empates) {
		this.empates = empates;
	}
	

}
