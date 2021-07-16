package relacionamentoClasses_guanabara;

public class UltraEmojCombat {

	public static void main(String[] args) {
		Luatdor l [] = new Luatdor[6];
				
		l[0] = new Luatdor("Pretty Boy", "França", 31, 1.75f, 68.9, 11, 2, 1);
		l[1] = new Luatdor("Pustcript", "Brasil", 29, 1.68f, 57.8, 14, 2, 3);
		l[2] = new Luatdor("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Luatdor("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Luatdor("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		l[5] = new Luatdor("Nerdaart", "EUA", 30, 1.80, 105.7, 12, 2, 4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[4], l[5]);
		UEC01.lutar();
		l[4].status();
		l[5].status();
		
	}

}
