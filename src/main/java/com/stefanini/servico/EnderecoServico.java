package com.stefanini.servico;

<<<<<<< HEAD
import com.stefanini.dao.EnderecoDao;
import com.stefanini.dao.PessoaDao;
import com.stefanini.model.Endereco;
import com.stefanini.model.Pessoa;
import com.stefanini.util.IGenericService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * 
 * Classe de servico, as regras de negocio devem estar nessa classe
 * @author joaopedromilhome
 *
 */
public class EnderecoServico implements IGenericService<Endereco, Long> {
	
	@Inject
	private EnderecoDao dao;


=======
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.EnderecoDao;
import com.stefanini.model.Endereco;
import com.stefanini.util.IGenericService;

public class EnderecoServico implements IGenericService<Endereco,Long> {
	@Inject
	private EnderecoDao dao ;
	
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	@Override
	public Endereco salvar(@Valid Endereco entity) {
		return dao.salvar(entity);
	}
<<<<<<< HEAD

=======
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	@Override
	public Endereco atualizar(@Valid Endereco entity) {
		return dao.atualizar(entity);
	}
<<<<<<< HEAD

	@Override
	public void remover(Long id) {
	dao.remover(id);
	}

	@Override
	public Optional<List<Endereco>> getList() {
		return Optional.empty();
	}

	@Override
	public Optional<Endereco> encontrar(Long id) {
		return dao.encontrar(id);
	}
=======
	@Override
	public void remover(Long id) {
		dao.remover(id);
	}
	
	
	@Override
	public Optional<List<Endereco>> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Endereco> encontrar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
}
