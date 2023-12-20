package apps;


public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	public abstract void salvarHistoricoMensagem();
	
	
	//somente as classes filhas conhecem este método
	protected void validarConexao(){
		System.out.println("\nValidando se está conectado");
	}
	
}
