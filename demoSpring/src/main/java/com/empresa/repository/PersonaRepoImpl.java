package com.empresa.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.empresa.demoSpring.DemoSpringApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {
     private static Logger LOG = LoggerFactory.getLogger(DemoSpringApplication.class);
	@Override
	public void registrar(String nombre) {
		
		LOG.info("Se Registro a: "+ nombre);
		
	}
	

}
