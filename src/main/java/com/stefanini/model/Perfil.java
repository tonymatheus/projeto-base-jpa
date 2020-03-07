package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
	/**
	 * Serialização da Classe
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID da Tabela
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;
	/*
	 * Nome do Perfil
	 */
	@NotNull
	@Column(name = "NO_PERFIL")
	private String perfil;

	/*
	 * criando o DS_PERFIL
	 */
	@NotNull
	@Column(name = "DS_PERFIL")
	private String dsperfil;

	/*
	 * data e hora da inclusão
	 */
	@NotNull
	@Column(name = "DT_HORA_INCLUSAO")
	private Date dataHoraIncusao;
	/*
	 * Incluindo Data e hora Alteração
	 */
	@NotNull
	@Column(name = "DT_HORA_ALTERACAO")
	private Date dataHoraAlteracao;
	
	

	public Perfil() {
		
	}

	public Perfil(Long id, @NotNull String perfil, @NotNull String dsperfil, @NotNull Date dataHoraIncusao,
			@NotNull Date dataHoraAlteracao) {
		super();
		this.id = id;
		this.perfil = perfil;
		this.dsperfil = dsperfil;
		this.dataHoraIncusao = dataHoraIncusao;
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDsperfil() {
		return dsperfil;
	}

	public void setDsperfil(String dsperfil) {
		this.dsperfil = dsperfil;
	}

	public Date getDataHoraIncusao() {
		return dataHoraIncusao;
	}

	public void setDataHoraIncusao(Date dataHoraIncusao) {
		this.dataHoraIncusao = dataHoraIncusao;
	}

	public Date getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}

	public void setDataHoraAlteracao(Date dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataHoraAlteracao == null) ? 0 : dataHoraAlteracao.hashCode());
		result = prime * result + ((dataHoraIncusao == null) ? 0 : dataHoraIncusao.hashCode());
		result = prime * result + ((dsperfil == null) ? 0 : dsperfil.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (dataHoraAlteracao == null) {
			if (other.dataHoraAlteracao != null)
				return false;
		} else if (!dataHoraAlteracao.equals(other.dataHoraAlteracao))
			return false;
		if (dataHoraIncusao == null) {
			if (other.dataHoraIncusao != null)
				return false;
		} else if (!dataHoraIncusao.equals(other.dataHoraIncusao))
			return false;
		if (dsperfil == null) {
			if (other.dsperfil != null)
				return false;
		} else if (!dsperfil.equals(other.dsperfil))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}

}
