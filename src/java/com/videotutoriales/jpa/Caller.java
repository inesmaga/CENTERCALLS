/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.videotutoriales.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author inesm
 */
@Entity
@Table(name = "caller")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Caller.findAll", query = "SELECT c FROM Caller c")
	, @NamedQuery(name = "Caller.findByIdCaller", query = "SELECT c FROM Caller c WHERE c.idCaller = :idCaller")})
public class Caller implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idCaller")
	private Integer idCaller;
	@JoinColumn(name = "idpersona", referencedColumnName = "idPerson")
        @ManyToOne(optional = false)
	private Person idpersona;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idllamante")
	private Collection<Calls> callsCollection;

	public Caller() {
	}

	public Caller(Integer idCaller) {
		this.idCaller = idCaller;
	}

	public Integer getIdCaller() {
		return idCaller;
	}

	public void setIdCaller(Integer idCaller) {
		this.idCaller = idCaller;
	}

	public Person getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Person idpersona) {
		this.idpersona = idpersona;
	}

	@XmlTransient
	public Collection<Calls> getCallsCollection() {
		return callsCollection;
	}

	public void setCallsCollection(Collection<Calls> callsCollection) {
		this.callsCollection = callsCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idCaller != null ? idCaller.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Caller)) {
			return false;
		}
		Caller other = (Caller) object;
		if ((this.idCaller == null && other.idCaller != null) || (this.idCaller != null && !this.idCaller.equals(other.idCaller))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.videotutoriales.jpa.Caller[ idCaller=" + idCaller + " ]";
	}
	
}
