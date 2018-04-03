/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.videotutoriales.jpaController;

import com.videotutoriales.jpa.Caller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author inesm
 */
@Stateless
public class CallerFacade extends AbstractFacade<Caller> {

	@PersistenceContext(unitName = "CallsCenterPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public CallerFacade() {
		super(Caller.class);
	}
	
}
