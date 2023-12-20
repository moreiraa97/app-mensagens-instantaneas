package apps;

public class Telegram extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		
		validarConexao();
		
		System.out.println("Enviando mensagem no Telegram");
	
		salvarHistoricoMensagem();
		
	}

	@Override
	public void receberMensagem() {
		
		System.out.println("Recebendo mensagem no Telegram");
		
	}

	@Override
	public void salvarHistoricoMensagem() {
		
		System.out.println("Salvando mensagem no histórico");
		
	}
	
}
