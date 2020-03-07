package com.stefanini.teste;

import java.time.LocalDate;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.model.PessoaPerfil;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PerfilServico;
import com.stefanini.servico.PessoaServico;

public class App {

	
	@Inject
	private EnderecoServico servicoEnd;
	
	@Inject
	private PerfilServico servicoPer;
	
	
	@Inject
	private PessoaServico servicoPesPer;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
		buscarTodos();
//		encontrar();
		salvar();
//		remover();
	}

	private void remover() {
		servico.remover(5L);
	}

	private void encontrar() {
		Optional<Pessoa> pessoa = servico.encontrar(5L);
		if (pessoa.isPresent()) {
			System.out.println("Pessoa encontrada");
			System.out.println(pessoa.get());
		} else {
			System.out.println("Pessoa não encontrada");
		}
	}

	private void buscarTodos() {
		servico.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b.getEnderecos());
				System.out.println(b);
			});
		});
//		System.out.println();
	}

	public void salvar() {
		@SuppressWarnings("deprecation")
		java.sql.Timestamp dataAlTer = new java.sql.Timestamp(2020, 03, 07, 18, 18, 12, 11);
		
		@SuppressWarnings("deprecation")
		java.sql.Timestamp dataIncl = new java.sql.Timestamp(2018, 11, 11, 14, 15, 11, 10);

		Pessoa pessoa = new Pessoa("Tony1", "tony1@gmail.com", LocalDate.of(19996, 06, 18), true);
		servico.salvar(pessoa);
		
		Endereco endereco = new Endereco(null,"Rua 20 ","Lote 17","Chácaras21","Novo Gama","GO","72860850",pessoa);
		
		Perfil perfil = new Perfil("Não Sei","Descrição",dataAlTer,dataIncl);
		
		PessoaPerfil pessoaPerfil = new PessoaPerfil(pessoa,perfil);
		

	}

}
