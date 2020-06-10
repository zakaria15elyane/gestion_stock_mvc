package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.dao.ICommandeClientDao;
import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.dao.IFournisseurDao;
import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.CommandeFournisseur;
import com.stock.mvc.entities.Fournisseur;
import com.stock.mvc.services.IArticleService;
import com.stock.mvc.services.IClientService;
import com.stock.mvc.services.ICommandeClientService;
import com.stock.mvc.services.ICommandeFournisseurService;
import com.stock.mvc.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService {

	private IFournisseurDao dao;
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}
	@Override
	public Fournisseur save(Fournisseur entity) {
		return dao.save(entity);
	}
	@Override
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}
	@Override
	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}
	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	@Override
	public Fournisseur getById(Long id) {
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}
	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}
	@Override
	public Fournisseur findOne(String[] paramNames, Object paramValues) {
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
}
