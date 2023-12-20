package apps;

public abstract class ServicoMensagemInstantanea {
	
	public void enviarMensagem(){
		
		validarConexao();
		
		System.out.println("Enviando mensagem");
	
		salvarHistoricoMensagem();
	
	}
	
	
	
	public void receberMensagem(){
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConexao(){
		System.out.println("Validando se está conectado");
	}
	
	private void salvarHistoricoMensagem(){
		System.out.println("Salvando histórico da mensagem");
	}
	
	
	
}
