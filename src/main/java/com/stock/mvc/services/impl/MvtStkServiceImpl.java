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
import com.stock.mvc.dao.IMvtStkDao;
import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.CommandeFournisseur;
import com.stock.mvc.entities.Fournisseur;
import com.stock.mvc.entities.LigneCommandeClient;
import com.stock.mvc.entities.LigneCommandeFournisseur;
import com.stock.mvc.entities.LigneVente;
import com.stock.mvc.entities.MvStock;
import com.stock.mvc.services.IArticleService;
import com.stock.mvc.services.IClientService;
import com.stock.mvc.services.ICommandeClientService;
import com.stock.mvc.services.ICommandeFournisseurService;
import com.stock.mvc.services.IFournisseurService;
import com.stock.mvc.services.ILigneCommandeClientService;
import com.stock.mvc.services.ILigneCommandeFournisseurService;
import com.stock.mvc.services.ILigneVenteService;
import com.stock.mvc.services.IMvtStkService;

@Transactional
public class MvtStkServiceImpl implements IMvtStkService {

	private IMvtStkDao dao;
	public void setDao(IMvtStkDao dao) {
		this.dao = dao;
	}
	@Override
	public MvStock save(MvStock entity) {
		return dao.save(entity);
	}
	@Override
	public MvStock update(MvStock entity) {
		return dao.update(entity);
	}
	@Override
	public List<MvStock> selectAll() {
		return dao.selectAll();
	}
	@Override
	public List<MvStock> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}
	@Override
	public MvStock getById(Long id) {
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		dao.remove(id);
	}
	@Override
	public MvStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}
	@Override
	public MvStock findOne(String[] paramNames, Object paramValues) {
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
	return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
}
