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
@Table(name = "objectcall")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Objectcall.findAll", query = "SELECT o FROM Objectcall o")
	, @NamedQuery(name = "Objectcall.findByIdObjectCall", query = "SELECT o FROM Objectcall o WHERE o.idObjectCall = :idObjectCall")})
public class Objectcall implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idObjectCall")
	private Integer idObjectCall;
	@JoinColumn(name = "idpersona", referencedColumnName = "idPerson")
        @ManyToOne(optional = false)
	private Person idpersona;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idObjetCall")
	private Collection<Calls> callsCollection;

	public Objectcall() {
	}

	public Objectcall(Integer idObjectCall) {
		this.idObjectCall = idObjectCall;
	}

	public Integer getIdObjectCall() {
		return idObjectCall;
	}

	public void setIdObjectCall(Integer idObjectCall) {
		this.idObjectCall = idObjectCall;
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
		hash += (idObjectCall != null ? idObjectCall.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Objectcall)) {
			return false;
		}
		Objectcall other = (Objectcall) object;
		if ((this.idObjectCall == null && other.idObjectCall != null) || (this.idObjectCall != null && !this.idObjectCall.equals(other.idObjectCall))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.videotutoriales.jpa.Objectcall[ idObjectCall=" + idObjectCall + " ]";
	}
	
}
