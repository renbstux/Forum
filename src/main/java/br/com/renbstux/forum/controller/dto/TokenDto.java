package br.com.renbstux.forum.controller.dto;

public class TokenDto {

	private String tipo;
	private String token;

	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public String getToken() {
		return token;
	}

}
