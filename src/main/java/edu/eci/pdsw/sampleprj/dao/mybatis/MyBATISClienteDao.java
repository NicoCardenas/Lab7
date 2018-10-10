package edu.eci.pdsw.sampleprj.dao.mybatis;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.pdsw.sampleprj.dao.ClienteDAO;
import edu.eci.pdsw.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.pdsw.samples.entities.Cliente;

public class MyBATISClienteDao implements ClienteDAO {
	@Inject
	private ClienteMapper clienteMapper;
	
	@Override
	public void save(Cliente cliente) throws PersistenceException {
		// TODO Auto-generated method stub
		  try{
			  clienteMapper.insertarCliente(cliente);
		  }
		  catch(org.apache.ibatis.exceptions.PersistenceException e){
		      throw new PersistenceException("Error al registrar el cliente "+cliente.toString(),e);
		  }       

	}

	@Override
	public Cliente load(int id) throws PersistenceException {
		try{
			return clienteMapper.consultarCliente(id);
		}
		catch(org.apache.ibatis.exceptions.PersistenceException e){
			throw new PersistenceException("Error al consultar el cliente "+id,e);
		}
	}	

	@Override
	public List<Cliente> load() throws PersistenceException {
		try{
			return clienteMapper.consultarClientes();
		}
		catch(org.apache.ibatis.exceptions.PersistenceException e){
			throw new PersistenceException("Error al consultar los clientes",e);
		}
	}
}
