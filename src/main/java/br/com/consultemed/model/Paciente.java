package br.com.consultemed.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name="tb_paciente")
@Entity
public class Paciente extends Pessoa{
	
	@Column(name="ficha")
	private Integer ficha;
	
	@Embedded
	private Endereco endereco;

	public Integer getFicha() {
		return ficha;
	}

	public void setFicha(Integer ficha) {
		this.ficha = ficha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
