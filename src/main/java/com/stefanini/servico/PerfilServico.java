package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

public class PerfilServico implements IGenericService<Perfil, Long> {
	
	@Inject
	private PerfilDao dao;
	
	
	
	
	@Override
	public Perfil salvar(@Valid Perfil entity) {
		
		return dao.salvar(entity);
	}

	
	
	@Override
	public Perfil atualizar(@Valid Perfil entity) {
		return dao.atualizar(entity);
	}
	
	
	@Override
	public void remover (@Valid Long id) {
		dao.remover(id);
	}
	
	/*
	 * Busca de Lista de Pessoas
	 */
	
	
	@Override
	public Optional<List<Perfil>> getList() {

		return dao.getList();
	}

	@Override
	public Optional<Perfil> encontrar(Long id) {
		
		return dao.encontrar(id);
	}


}
