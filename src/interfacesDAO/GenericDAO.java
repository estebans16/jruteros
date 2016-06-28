package interfacesDAO;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T> {
	public boolean actualizar(T entity);
	public boolean borrar(Serializable id);
	public void borrar(T entity);
	public boolean existe(Serializable id);
	public T persistir(T entity);
	public T recuperar(Serializable id);
	public List<T> todos();
}
