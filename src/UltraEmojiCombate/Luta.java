package UltraEmojiCombate;

public class Luta {
	
	private Lutador desafiado;
	private  Lutador desafiante;
	private  double rounds;
	private boolean aprovada;
	
	//Metodos publicos 
	
	public void marcarLuta() {
		
	}
	public void lutar() {
		
	}
	//metodos especiais
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public double getRounds() {
		return rounds;
	}
	public void setRounds(double rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	

}
