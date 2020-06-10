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
import com.stock.mvc.dao.IUtilisateurDao;
import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;
import com.stock.mvc.entities.CommandeFournisseur;
import com.stock.mvc.entities.Fournisseur;
import com.stock.mvc.entities.LigneCommandeClient;
import com.stock.mvc.entities.LigneCommandeFournisseur;
import com.stock.mvc.entities.LigneVente;
import com.stock.mvc.entities.MvStock;
import com.stock.mvc.entities.Utilisateur;
import com.stock.mvc.services.IArticleService;
import com.stock.mvc.services.IClientService;
import com.stock.mvc.services.ICommandeClientService;
import com.stock.mvc.services.ICommandeFournisseurService;
import com.stock.mvc.services.IFournisseurService;
import com.stock.mvc.services.ILigneCommandeClientService;
import com.stock.mvc.services.ILigneCommandeFournisseurService;
import com.stock.mvc.services.ILigneVenteService;
import com.stock.mvc.services.IMvtStkService;
import com.stock.mvc.services.IUtilisateurService;

@Transactional
public class UtilisateurServiceImpl implements IUtilisateurService {

	private IUtilisateurDao dao;
	public void setDao(IUtilisateurDao dao) {
		this.dao = dao;
	}
	@Override
	public Utilisateur save(Utilisateur entity) {
		return dao.save(entity);
	}
	@Override
	public Utilisateur update(Utilisateur entity) {
		return dao.update(entity);
	}
	@Override
	public List<Utilisateur> selectAll() {
		return dao.selectAll();
	}
	@Override
	public List<Utilisateur> selectAll(String sortField, String sort) {
		return dao.selectAll();
	}
	@Override
	public Utilisateur getById(Long id) {
		return dao.getById(id);
	}
	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}
	@Override
	public Utilisateur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}
	@Override
	public Utilisateur findOne(String[] paramNames, Object paramValues) {
		return dao.findOne(paramNames, paramValues);
	}
	@Override
	public int findCountBy(String paramName, String paramValue) {
	return dao.findCountBy(paramName, paramValue);
	}
	
	
	
	
}
