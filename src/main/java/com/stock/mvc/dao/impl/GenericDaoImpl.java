package com.stock.mvc.dao.impl;

import java.awt.Window.Type;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.runners.Parameterized;

import com.stock.mvc.dao.IGenericDao;
@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E> {

	@PersistenceContext
	EntityManager em;
	
	private Class<E> type;
	
	public Class<E> getType() {
		return type;
	}

	public GenericDaoImpl() {
		java.lang.reflect.Type t=getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType) t;
		type=(Class<E>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		
		return em.merge(entity);
	}

	@Override
	public List<E> selectAll() {
		Query query=(Query) em.createQuery("select t from " +type.getSimpleName() +"t");
		return ((javax.persistence.Query) query).getResultList();
	}

	@Override
	public List<E> selectAll(String sortField, String sort) {
		Query query=(Query) em.createQuery("select t from " +type.getSimpleName()+"t order by " +sortField+" "+sort);
		return ((javax.persistence.Query) query).getResultList();
	}

	@Override
	public E getById(Long id) {
		
		return em.find(type,id);
	}

	@Override
	public void remove(Long id) {
		E tab=em.getReference(type,id);
		em.remove(tab);
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		Query query=(Query) em.createQuery("select t from " +type.getSimpleName() +"t where	" +paramName +"=:x");
		((javax.persistence.Query) query).setParameter(paramName,paramValue);
		return ((javax.persistence.Query) query).getResultList().size()> 0 ? (E) ((javax.persistence.Query) query).getResultList().get(0):null;

	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		if (paramNames.length!=paramValues.length) {
			return null;
		}
		String queryString="select e from"+type.getName()+ "e where";
		int len=paramNames.length;
		for (int i = 0; i <len; i++) {
			queryString="e." +paramNames[i]+ "=:x"+i;
			if ((i+1)<len) {
				queryString+="and";
			}}
			Query query=(Query) em.createQuery(queryString);
			for (int i = 0; i < paramNames.length; i++) {
			((javax.persistence.Query) query).setParameter("x"+i,paramValues[i]);
			}
			return ((javax.persistence.Query) query).getResultList().size()> 0 ? (E) ((javax.persistence.Query) query).getResultList().get(0):null;

		}
		

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query=(Query) em.createQuery("select t from " +type.getSimpleName() +"t where	" +paramName +"=:x");
		((javax.persistence.Query) query).setParameter(paramName,paramValue);
		return  ((javax.persistence.Query) query).getResultList().size()> 0 ? ((Long) ((javax.persistence.Query) query).getSingleResult()).intValue():0;

	}

	@Override
	public E findOne(String[] paramNames, Object paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

}
