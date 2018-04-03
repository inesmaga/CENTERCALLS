/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.videotutoriales.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author inesm
 */
@Entity
@Table(name = "calls")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Calls.findAll", query = "SELECT c FROM Calls c")
	, @NamedQuery(name = "Calls.findByIdCalls", query = "SELECT c FROM Calls c WHERE c.idCalls = :idCalls")
	, @NamedQuery(name = "Calls.findByTelefonCall", query = "SELECT c FROM Calls c WHERE c.telefonCall = :telefonCall")
	, @NamedQuery(name = "Calls.findByAsunto", query = "SELECT c FROM Calls c WHERE c.asunto = :asunto")
	, @NamedQuery(name = "Calls.findByEstado", query = "SELECT c FROM Calls c WHERE c.estado = :estado")})
public class Calls implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idCalls")
	private Integer idCalls;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 12)
        @Column(name = "TelefonCall")
	private String telefonCall;
	@Size(max = 45)
        @Column(name = "Asunto")
	private String asunto;
	@Size(max = 15)
        @Column(name = "Estado")
	private String estado;
	@Lob
        @Column(name = "Menssage")
	private String menssage;
	@JoinColumn(name = "idllamante", referencedColumnName = "idCaller")
        @ManyToOne(optional = false)
	private Caller idllamante;
	@JoinColumn(name = "idObjetCall", referencedColumnName = "idObjectCall")
        @ManyToOne(optional = false)
	private Objectcall idObjetCall;

	public Calls() {
	}

	public Calls(Integer idCalls) {
		this.idCalls = idCalls;
	}

	public Calls(Integer idCalls, String telefonCall) {
		this.idCalls = idCalls;
		this.telefonCall = telefonCall;
	}

	public Integer getIdCalls() {
		return idCalls;
	}

	public void setIdCalls(Integer idCalls) {
		this.idCalls = idCalls;
	}

	public String getTelefonCall() {
		return telefonCall;
	}

	public void setTelefonCall(String telefonCall) {
		this.telefonCall = telefonCall;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

	

	

	public Caller getIdllamante() {
		return idllamante;
	}

	public void setIdllamante(Caller idllamante) {
		this.idllamante = idllamante;
	}

	public Objectcall getIdObjetCall() {
		return idObjetCall;
	}

	public void setIdObjetCall(Objectcall idObjetCall) {
		this.idObjetCall = idObjetCall;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idCalls != null ? idCalls.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Calls)) {
			return false;
		}
		Calls other = (Calls) object;
		if ((this.idCalls == null && other.idCalls != null) || (this.idCalls != null && !this.idCalls.equals(other.idCalls))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.videotutoriales.jpa.Calls[ idCalls=" + idCalls + " ]";
	}
	
}
