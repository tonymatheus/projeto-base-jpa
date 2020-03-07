package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;
<<<<<<< HEAD

public class PerfilServico implements IGenericService<Perfil, Long> {

	@Inject
	private PerfilDao dao;

	@Override
	public Perfil salvar(@Valid Perfil entity) {
		return dao.salvar(entity);
	}

=======
import com.sun.xml.bind.annotation.OverrideAnnotationOf;

public class PerfilServico implements IGenericService<Perfil, Long> {
	
	@Inject
	private PerfilDao dao;
	
	
	
	
	@Override
	public Perfil salvar(@Valid Perfil entity) {
		
		return dao.salvar(entity);
	}

	
	
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	@Override
	public Perfil atualizar(@Valid Perfil entity) {
		return dao.atualizar(entity);
	}
<<<<<<< HEAD

	@Override
	public void remover(Long id) {
		dao.remover(id);
	}

	@Override
	public Optional<List<Perfil>> getList() {
		return Optional.empty();
=======
	
	
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
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	}

	@Override
	public Optional<Perfil> encontrar(Long id) {
<<<<<<< HEAD
		return dao.encontrar(id);
	}

}
=======
		
		return dao.encontrar(id);
	}


}
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
