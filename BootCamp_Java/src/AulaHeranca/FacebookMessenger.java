package AulaHeranca;

public class FacebookMessenger extends servicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando Mensagem pelo Facebook");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recbendo Mensagem pelo Facebook");
	}
}
