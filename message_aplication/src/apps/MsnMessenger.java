package apps;

public class MsnMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		
		validarConexao();
		
		System.out.println("Enviando mensagem no Msn Messenger");
	
		salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		
		System.out.println("Recebendo mensagem no Msn Messenger");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		
		System.out.println("Salvando mensagem no histórico");
		
	}
	
}