package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
<<<<<<< HEAD
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
=======
import javax.validation.constraints.NotNull;
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0

@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
<<<<<<< HEAD
	private static final long serialVersionUID = 1L;

=======
	/**
	 * Serialização da Classe
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID da Tabela
	 */
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Long id;
<<<<<<< HEAD

	@Column(name = "NO_PERFIL")
	private String perfil;

	@Column(name = "DS_PERFIL_DESC")
	private String perfilDesc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HORA_INCLUSAO")
	private Date horaInclusao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HORA_ALTERACAO")
	private Date horaAlteracao;

	public Perfil() {
	}

	public Perfil(String perfil, String perfilDesc, Date horaInclusao, Date horaAlteracao) {
		super();
		this.perfil = perfil;
		this.perfilDesc = perfilDesc;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;

=======
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
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
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

<<<<<<< HEAD
	public String getPerfilDesc() {
		return perfilDesc;
	}

	public void setPerfilDesc(String perfilDesc) {
		this.perfilDesc = perfilDesc;
	}

	public Date getHoraInclusao() {
		return horaInclusao;
	}

	public void setHoraInclusao(Date horaInclusao) {
		this.horaInclusao = horaInclusao;
	}

	public Date getHoraAlteracao() {
		return horaAlteracao;
	}

	public void setHoraAlteracao(Date horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + ", perfilDesc=" + perfilDesc + ", horaInclusao="
				+ horaInclusao + ", horaAlteracao=" + horaAlteracao + "]";
=======
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
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
<<<<<<< HEAD
		result = prime * result + ((horaAlteracao == null) ? 0 : horaAlteracao.hashCode());
		result = prime * result + ((horaInclusao == null) ? 0 : horaInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((perfilDesc == null) ? 0 : perfilDesc.hashCode());
=======
		result = prime * result + ((dataHoraAlteracao == null) ? 0 : dataHoraAlteracao.hashCode());
		result = prime * result + ((dataHoraIncusao == null) ? 0 : dataHoraIncusao.hashCode());
		result = prime * result + ((dsperfil == null) ? 0 : dsperfil.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
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
<<<<<<< HEAD
		if (horaAlteracao == null) {
			if (other.horaAlteracao != null)
				return false;
		} else if (!horaAlteracao.equals(other.horaAlteracao))
			return false;
		if (horaInclusao == null) {
			if (other.horaInclusao != null)
				return false;
		} else if (!horaInclusao.equals(other.horaInclusao))
=======
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
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
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
<<<<<<< HEAD
		if (perfilDesc == null) {
			if (other.perfilDesc != null)
				return false;
		} else if (!perfilDesc.equals(other.perfilDesc))
			return false;
		return true;
	}

}
=======
		return true;
	}

}
>>>>>>> 0b490732aaac42339458ca5331daa860d2e5bef0
