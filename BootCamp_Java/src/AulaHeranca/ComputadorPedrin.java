package AulaHeranca;

public class ComputadorPedrin {

	
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		
		FacebookMessenger fb = new FacebookMessenger();
		fb.enviarMensagem();
		fb.receberMensagem();
		
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
