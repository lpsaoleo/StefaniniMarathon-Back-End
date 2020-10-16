package br.com.maratona.dev;

public enum EnumStatusConta {
	ATIVA(1,"Ativa"),
	INATIVA(2,"Inativa"),
	SUSPENSA(3,"Suspensa"),
	BLOQUEADA(4,"Bloqueada");
	
	private String  descricao;
	private Integer codigo;
	
	private EnumStatusConta(Integer codigo,String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
