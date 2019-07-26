package br.com.consultemed.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultemed.model.Consulta;
import br.com.consultemed.utils.JPAUtils;

public class ConsultaDao implements IConsultaDao{
	
	private EntityManagerFactory factory = JPAUtils.getEntityManagerFactory();
	private EntityManager manager = factory.createEntityManager();
	
	@Override
	public void salvar(Consulta consulta) {
		this.manager.getTransaction().begin();
		this.manager.persist(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();
	}
	
	@Override
	public void alterar(Consulta consulta) {
		this.manager.getTransaction().begin();
		this.manager.merge(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();		
	}
	
	@Override
	public void remover(Long id) {
		this.manager.getTransaction().begin();
		Consulta consulta = this.manager.find(Consulta.class, id);
		this.manager.remove(consulta);
		this.manager.getTransaction().commit();
		this.manager.close();			
	}
	
	@Override
	public Consulta buscarPorId(Long id) {		
		return manager.find(Consulta.class, id);
	}

	@Override
	public Consulta buscarPorPeriodo(Date inicio, Date fim) {
		Query query = this.manager.createQuery("SELECT a FROM Consulta a Where a.dataConsulta BETWEEN :inicio AND :fim ");
		query.setParameter("inicio", inicio);
		query.setParameter("fim", fim);
		return (Consulta) query.getSingleResult();
	}

}
