package AulaHeranca;

public class Telegram extends servicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Enviando Mensagem pelo Telegram");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recbendo Mensagem pelo Telegram");
	}
}
