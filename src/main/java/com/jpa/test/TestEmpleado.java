package com.jpa.test;

import java.util.Date;
import java.util.List;

import java.text.SimpleDateFormat;

import com.jpa.dao.ClassCrudEmpleadoImp;
import com.jpa.modelo.TblEmpleado;

public class TestEmpleado {

	public static void main(String[] args) {
		//realizamos la respectiva instancia...
		ClassCrudEmpleadoImp crud=new ClassCrudEmpleadoImp();
		TblEmpleado emp=new TblEmpleado();
		  //insertamos datos....
	/*	emp.setNombre("iban jorge");
		emp.setApellido("ramirez");
		emp.setDni("10356669");
		emp.setEmail("luis@gmail.com");
		emp.setSexo("m");
		emp.setTelf("35554689");
		 Date fecha=new Date();
		 Date fechasql=new Date(fecha.getTime());
		emp.setFechanac(fechasql); 
		//invocamos el metodo registrar...
		crud.registrarEmpleado(emp);
		//enviamos mensaje por pantalla
		System.out.println("datos registrados en BD ****");*/
		
		// *********testeando el listado.....
		List<TblEmpleado> listaempleado=crud.listadoEmpleado();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 //aplicamos un bucle....
		for(TblEmpleado lista:listaempleado){
			//imprimimos por pantalla
			System.out.println("nombre "+lista.getNombre()+
					" apellido "+lista.getApellido()+" dni "+
					lista.getDni()+" email "+lista.getEmail()+
					" sexo "+lista.getSexo()
				+" telefono "+lista.getTelf()+
					" fechanaci "+sdf.format(lista.getFechanac()));
		} //fin del bucle for....

	} //fin del metodo principal.....

} //fin de la clase....
