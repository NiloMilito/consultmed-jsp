package br.com.consultemed.service;

import java.util.Collection;

import javax.inject.Inject;

import br.com.consultemed.dao.DiasAtendimentoDao;
import br.com.consultemed.dao.IMedico;
import br.com.consultemed.dao.MedicoDao;
import br.com.consultemed.model.Consulta;
import br.com.consultemed.model.Contato;
import br.com.consultemed.model.Medico;

public class MedicoService implements IMedico{
	@Inject
	private IMedico medicoDao;
	@Inject
	private DiasAtendimentoDao diasDao;
	@Inject
	private ConsultaService cservice;
	@Inject
	private AgendamentoService aservice;
		

	public MedicoService() {
		this.medicoDao = new MedicoDao();
		this.diasDao = new DiasAtendimentoDao();
		this.cservice = new ConsultaService();
		this.aservice = new AgendamentoService();
	}
	
	@Override
	public void cancelarConsulta(Consulta consulta) {
		this.cservice.cancelarConsulta(consulta);
		this.aservice.reagendamentoConsulta(consulta, consulta);
	}

	public Collection<Medico> listar() {
		try {
			return this.medicoDao.listAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Contato buscaContatoId(Long idContato) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Contato buscaContatoNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contato buscaContatoEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Medico medico) throws Exception {
		try {
			this.diasDao.save(medico.getDiasAtendimento());
			this.medicoDao.save(medico);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public Medico findById(Long id) throws Exception {
		try {
			return this.medicoDao.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteById(Long id) throws Exception {
		try {
			this.medicoDao.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Medico medico) throws Exception {
		try {
			this.diasDao.update(medico.getDiasAtendimento());
			this.medicoDao.update(medico);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Medico> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countContato() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
