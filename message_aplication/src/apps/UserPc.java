package apps;

public class UserPc {
	
	public static void main(String[] args) {
	
		ServicoMensagemInstantanea smi = null; 
		
		String appEscolhido = "telegram";
		
		if(appEscolhido.equals("msn"))
			smi = new MsnMessenger();
		else if(appEscolhido.equals("facebook"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("telegram"))
			smi = new Telegram();
		
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}
