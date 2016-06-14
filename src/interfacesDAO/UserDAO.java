package interfacesDAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import models.User;

public interface UserDAO extends GenericDAO<User>{

	@Override
	public boolean actualizar(User entity);


	@Override
	public boolean borrar(Serializable id);
	
	@Override
	public void borrar(User entity);
	
	@Override
	public boolean existe(Serializable id);
			
	public List<User> recuperarTodos(Serializable id);

	@Override
	public User persistir(User entity);

	@Override
	public User recuperar(Serializable id);

}
