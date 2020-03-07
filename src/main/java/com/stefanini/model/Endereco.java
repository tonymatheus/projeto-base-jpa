package com.stefanini.model;

<<<<<<< HEAD
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
=======
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "TB_ENDERECO")
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
public class Endereco implements Serializable {



    /**
     * Serializacao da Classe
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID da Tabela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_SEQ_ENDERECO")
    private Long id;

    @Column(name = "DS_CEP")
    private String cep;

    @Column(name = "CO_UF")
    private String uf;

    @Column(name = "DS_CIDADE")
    private String localidade;

    @Column(name = "DS_BAIRRO")
    private String bairro;

    @Column(name = "DS_COMPLEMENTO")
    private String complemento;

    @Column(name = "DS_LOGRADOURO")
    private String logradouro;
<<<<<<< HEAD
    
    

    public Endereco(Long id, String cep, String uf, String localidade, String bairro, String complemento,
			String logradouro, Pessoa pessoa) {
		super();
		this.id = id;
		this.cep = cep;
		this.uf = uf;
		this.localidade = localidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.logradouro = logradouro;
		this.pessoa = pessoa;
	}



	@ManyToOne
=======

    @ManyToOne
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
    @JoinColumn(name = "co_seq_pessoa", referencedColumnName = "co_seq_pessoa", nullable = false)
    private Pessoa pessoa;



<<<<<<< HEAD
}
=======
}
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
