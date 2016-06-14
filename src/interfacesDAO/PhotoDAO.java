package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.Photo;

public interface PhotoDAO extends GenericDAO<Photo>{

	@Override
	public boolean actualizar(Photo entity);

	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(Photo entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<Photo> recuperarTodos(Serializable id);

	@Override
	public Photo persistir(Photo entity);

	@Override
	public Photo recuperar(Serializable id);

}
