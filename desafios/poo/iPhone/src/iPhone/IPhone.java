package iPhone;

public class IPhone implements IPod, Phone, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba...");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página...");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Alô?");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Reproduzindo...");		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("||");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica " + musica + "selecionada");
	}

}
