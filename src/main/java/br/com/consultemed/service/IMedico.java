package br.com.consultemed.service;

import java.util.List;

import br.com.consultemed.model.Consulta;
import br.com.consultemed.model.Contato;
import br.com.consultemed.model.Medico;

public interface IMedico {
	
	public void cancelarConsulta(Consulta consulta);
	
	public void salvar(Medico medico);
	public void remover(Long idContato);
	public List<Medico> listarContatos();
	public void editar(Medico contato);
	public Contato buscaContatoId(Long idContato);
	public Contato buscaContatoNome(String nome);
	public Contato buscaContatoEmail(String email);

}
