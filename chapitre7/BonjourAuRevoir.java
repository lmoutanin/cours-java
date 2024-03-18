package chapitre7;

public class BonjourAuRevoir {

	public static void main(String[] args) {
		String messageBonjour = direBonjour();
		String messageAurevoir = direAuRevoir();
		System.out.println("Le sous programme vous dit: " + messageBonjour + " et " + messageAurevoir);

	}

	public static String direBonjour() {
		String message="bonjour";
		return message;
	}

	public static String direAuRevoir() {
		String message="au revoir ";
		return message;
	}
}
