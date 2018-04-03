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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author inesm
 */
@Entity
@Table(name = "person")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")
	, @NamedQuery(name = "Person.findByIdPerson", query = "SELECT p FROM Person p WHERE p.idPerson = :idPerson")
	, @NamedQuery(name = "Person.findByNombre", query = "SELECT p FROM Person p WHERE p.nombre = :nombre")
	, @NamedQuery(name = "Person.findByPApellido", query = "SELECT p FROM Person p WHERE p.pApellido = :pApellido")
	, @NamedQuery(name = "Person.findBySApellido", query = "SELECT p FROM Person p WHERE p.sApellido = :sApellido")
	, @NamedQuery(name = "Person.findByTelefContact1", query = "SELECT p FROM Person p WHERE p.telefContact1 = :telefContact1")
	, @NamedQuery(name = "Person.findByTelefContact2", query = "SELECT p FROM Person p WHERE p.telefContact2 = :telefContact2")
	, @NamedQuery(name = "Person.findByEmail", query = "SELECT p FROM Person p WHERE p.email = :email")})
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "idPerson")
	private Integer idPerson;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 45)
        @Column(name = "Nombre")
	private String nombre;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 45)
        @Column(name = "PApellido")
	private String pApellido;
	@Size(max = 45)
        @Column(name = "SApellido")
	private String sApellido;
	@Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 12)
        @Column(name = "TelefContact1")
	private String telefContact1;
	@Size(max = 12)
        @Column(name = "TelefContact2")
	private String telefContact2;
	@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")
	@Size(max = 45)
        @Column(name = "email")
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idpersona")
	public Collection<Objectcall> objectcallCollection;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idpersona")
	private Collection<Caller> callerCollection;

	public Person() {
	}

	public Person(Integer idPerson) {
		this.idPerson = idPerson;
	}

	public Person(Integer idPerson, String nombre, String pApellido, String telefContact1) {
		this.idPerson = idPerson;
		this.nombre = nombre;
		this.pApellido = pApellido;
		this.telefContact1 = telefContact1;
	}

	public Integer getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Integer idPerson) {
		this.idPerson = idPerson;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPApellido() {
		return pApellido;
	}

	public void setPApellido(String pApellido) {
		this.pApellido = pApellido;
	}

	public String getSApellido() {
		return sApellido;
	}

	public void setSApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public String getTelefContact1() {
		return telefContact1;
	}

	public void setTelefContact1(String telefContact1) {
		this.telefContact1 = telefContact1;
	}

	public String getTelefContact2() {
		return telefContact2;
	}

	public void setTelefContact2(String telefContact2) {
		this.telefContact2 = telefContact2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlTransient
	public Collection<Objectcall> getObjectcallCollection() {
		return objectcallCollection;
	}

	public void setObjectcallCollection(Collection<Objectcall> objectcallCollection) {
		this.objectcallCollection = objectcallCollection;
	}

	@XmlTransient
	public Collection<Caller> getCallerCollection() {
		return callerCollection;
	}

	public void setCallerCollection(Collection<Caller> callerCollection) {
		this.callerCollection = callerCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idPerson != null ? idPerson.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Person)) {
			return false;
		}
		Person other = (Person) object;
		if ((this.idPerson == null && other.idPerson != null) || (this.idPerson != null && !this.idPerson.equals(other.idPerson))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.videotutoriales.jpa.Person[ idPerson=" + idPerson + " ]";
	}
	
}
