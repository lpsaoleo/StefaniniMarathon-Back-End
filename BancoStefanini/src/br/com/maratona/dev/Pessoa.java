package br.com.maratona.dev;
import java.math.BigDecimal;
import java.util.Date;


public class Pessoa {

	private String nome;
	private char sexo;
	private Integer idade;
	private Long cpf;
	private BigDecimal saldo;
	private Boolean vivo;
	private Date nascimento;
	
	//Construtor padrao
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if(idade > 100) {
			System.out.println("Idade incorreta. A idade precisa ser inferior a 100 anos.");
		}
		else {
		this.idade = idade;
		}
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Boolean getVivo() {
		return vivo;
	}

	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
