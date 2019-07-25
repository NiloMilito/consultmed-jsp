package br.com.consultemed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Table(name="tb_exame")
@Entity
public class Exame extends AbstractEntity<Long> {	
	
	@Column(name="laudo")
	private String laudo;
	
	@ManyToOne
	@JoinColumn(name = "exames")
	private Consulta consulta;

	public String getLaudo() {
		return laudo;
	}

	public void setLaudo(String laudo) {
		this.laudo = laudo;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

}
