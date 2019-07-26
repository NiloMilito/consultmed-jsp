package br.com.consultemed.service;

import java.util.List;

import br.com.consultemed.model.Consulta;

public interface IConsulta {
	
	public void cancelarConsulta(Consulta consulta);
	public void salvar(Consulta consulta);
	public void remover(Long idContato);
	public List<Consulta> listarContatos();
	public void editar(Consulta consulta);
	public Consulta buscaContatoId(Long idContato);
	public Consulta buscaContatoNome(String nome);
	public Consulta buscaContatoEmail(String email);
	public Consulta buscar(Long id);	

}
