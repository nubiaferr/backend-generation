package TesteForum;

public class InterfaceForum {

	public static void main(String[] args) {
		ParticipanteForum participante = new ParticipanteForum ();
		Leitor leitor = participante;
		System.out.println("O participante está lendo: "+leitor.lendo());
		
		Programador programador = participante;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		System.out.println("E programando: "+programador.digitando());
		
		

	}

}
