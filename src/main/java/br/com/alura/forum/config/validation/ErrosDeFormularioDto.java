package br.com.alura.forum.config.validation;

public class ErrosDeFormularioDto {

	private String campo;
	private String mensagem;
	
	public ErrosDeFormularioDto(String campo, String mensagem) {
		this.campo = campo;
		this.mensagem = mensagem;
	}

	public String getCampo() {
		return campo;
	}

	public String getMensagem() {
		return mensagem;
	}
	
}
