package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.interfaces.IEmpleado;
import com.jpa.modelo.TblEmpleado;

public class ClassCrudEmpleadoImp  implements IEmpleado{

	@Override
	public void registrarEmpleado(TblEmpleado tblempleado) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory  conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
	//menejador de entidades segun unidad de persistencia....
		EntityManager em=conex.createEntityManager();
		//************realizamos el proceso.....
		    //iniciar la transaccion...
		em.getTransaction().begin();
		    //registramos datos...
		     //si fuera JDBC seria insert into tbl_empleado values......
		em.persist(tblempleado);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	
	
	} //fin del metodo registrar....

	@Override
	public void actualizarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub
		
	} //fin del metodo actualizar...

	@Override
	public void eliminarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub
		
	} //fin del metodo eliminar....

	@Override
	public List<TblEmpleado> listadoEmpleado() {
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory conex=Persistence.createEntityManagerFactory("ProyectoMavenJpa2025");
		//manejador de entidades...
		EntityManager em=conex.createEntityManager();
		//realizamos el proceso...
		    //iniciar la transaccion....
		em.getTransaction().begin();
		//aplicamos JPQL  se base en entidades....
		List<TblEmpleado> listado=em.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
		//confirmamos...
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listado;
	
	} //fin del metodo listar.....

	@Override
	public TblEmpleado buscarEmpleado(TblEmpleado tblempleado) {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo buscar.....

} //fin de la clase....
