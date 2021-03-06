package edu.eci.pdsw.samples.services.impl;

import java.sql.Date;
import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.sampleprj.dao.ClienteDAO;
import edu.eci.pdsw.sampleprj.dao.ItemDAO;
import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.entities.Item;
import edu.eci.pdsw.samples.entities.ItemRentado;
import edu.eci.pdsw.samples.entities.TipoItem;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquiler;

public class ServiciosAlquilerImpl implements ServiciosAlquiler {
	@Inject 
	private ClienteDAO clienteDAO;
	@Inject 
	private ItemDAO itemDAO;
	
	@Override
	public int valorMultaRetrasoxDia(int itemId) {
		// TODO Auto-generated method stub
		Item item= itemDAO.load(itemId);
		return (int) item.getTarifaxDia();		 
	}

	@Override
	public Cliente consultarCliente(long docu) throws ExcepcionServiciosAlquiler {
		return clienteDAO.load((int) docu);
	}

	@Override
	public List<ItemRentado> consultarItemsCliente(long idcliente) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return clienteDAO.load((int)idcliente).getRentados();		
	}

	@Override
	public List<Cliente> consultarClientes() throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return clienteDAO.load();
	}

	@Override
	public Item consultarItem(int id) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return itemDAO.load(id);
	}

	@Override
	public List<Item> consultarItemsDisponibles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long consultarMultaAlquiler(int iditem, Date fechaDevolucion) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TipoItem consultarTipoItem(int id) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoItem> consultarTiposItem() throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrarAlquilerCliente(Date date, long docu, Item item, int numdias)
			throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarCliente(Cliente p) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub

	}

	@Override
	public long consultarCostoAlquiler(int iditem, int numdias) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void actualizarTarifaItem(int id, long tarifa) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub

	}

	@Override
	public void registrarItem(Item i) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub

	}

	@Override
	public void vetarCliente(long docu, boolean estado) throws ExcepcionServiciosAlquiler {
		// TODO Auto-generated method stub

	}

}
