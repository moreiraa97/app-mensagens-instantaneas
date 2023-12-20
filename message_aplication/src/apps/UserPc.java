package apps;

public class UserPc {
	
	public static void main(String[] args) {
	
		MsnMessenger msn = new MsnMessenger();
		System.out.println("\nMSN Messenger: ");
		msn.enviarMensagem();
		msn.receberMensagem(); 

		
		FacebookMessenger fcb = new FacebookMessenger();
		System.out.println("\nFacebook Messenger: ");
		fcb.enviarMensagem();
		fcb.receberMensagem();
	
		
		Telegram tlg = new Telegram();
		System.out.println("\nTelegram Messenger: ");
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
