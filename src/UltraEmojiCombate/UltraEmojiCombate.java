package UltraEmojiCombate;

public class UltraEmojiCombate {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador("Pedro", "França", 30, 1.70, 78.0, 6, 2, 4);
		
		l[0].apresentar();
		l[0].status();
		
		l[1] = new Lutador("João", "Brasileira", 45, 1.90, 90, 2, 1, 6);
		
		l[1].apresentar();
		l[1].status();
		
		l[2] = new Lutador("Gilmar", "Alemão", 27, 1.85, 87, 7, 0, 0);
		
		l[2].apresentar();
		l[2].status();
		
		l[3] = new Lutador("Jorge", "Italiano", 38, 1.77, 102, 3, 2, 1);
		
		l[3].apresentar();
		l[3].status();

	}

}
