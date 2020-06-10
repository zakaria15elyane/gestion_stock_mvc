package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.dao.ICommandeClientDao;
import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.dao.IFournisseurDao;
import com.stock.mvc.dao.ILigneCommandeClientDao;
import com.stock.mvc.dao.ILigneCommandeFournisseurDao;
import com.stock.mvc.dao.ILigneVenteDao;
import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.CommandeFournisseur;
import com.stock.mvc.entities.Fournisseur;
import com.stock.mvc.entities.LigneCommandeClient;
import com.stock.mvc.entities.LigneCommandeFournisseur;
import com.stock.mvc.entities.LigneVente;
import com.stock.mvc.services.IArticleService;
import com.stock.mvc.services.IClientService;
import com.stock.mvc.services.ICommandeClientService;
import com.stock.mvc.services.ICommandeFournisseurService;
import com.stock.mvc.services.IFournisseurService;
import com.stock.mvc.services.ILigneCommandeClientService;
import com.stock.mvc.services.ILigneCommandeFournisseurService;
import com.stock.mvc.services.ILigneVenteService;

@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService {

	private ILigneVenteDao dao;
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}
	@Override
	public LigneVente save(LigneVente entity) {
		return dao.save(entity);
	}
	@Override
	public LigneVente update(LigneVente entity) {
		return dao.update(entity);
	}
	@Override
	public List<LigneVente> selectAll() {
		return dao.selectAll();
	}
	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	@Override
	public LigneVente getById(Long id) {
		
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}
	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}
	@Override
	public LigneVente findOne(String[] paramNames, Object paramValues) {
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	
	
	
}
