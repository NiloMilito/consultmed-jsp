package br.com.consultemed.service;

import java.util.Date;
import java.util.List;

import br.com.consultemed.dao.ConsultaDao;
import br.com.consultemed.dao.IConsultaDao;
import br.com.consultemed.model.Consulta;

public class ConsultaService implements IConsulta{
	
	private IConsultaDao consultaDao = new ConsultaDao();

	public Consulta buscarPorPeriodo(Date inicio, Date fim) {
		return this.consultaDao.buscarPorPeriodo(inicio, fim);
	}

	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.remover(consulta.getId());	
	}

	@Override
	public void remover(Long idContato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Consulta> listarContatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta buscaContatoId(Long idContato) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta buscaContatoNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta buscaContatoEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consulta buscar(Long id) {
		return this.consultaDao.buscarPorId(id);
	}


}
