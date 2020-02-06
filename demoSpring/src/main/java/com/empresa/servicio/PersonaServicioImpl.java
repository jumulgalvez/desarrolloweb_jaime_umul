package com.empresa.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.repository.IPersonaRepo;
import com.empresa.repository.PersonaRepoImpl;

@Service
public class PersonaServicioImpl implements IpersonaServicio {
	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		
		repo.registrar(nombre);
		
	}

}
