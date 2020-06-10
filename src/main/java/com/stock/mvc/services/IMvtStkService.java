package com.stock.mvc.services;

import java.util.List;

import com.stock.mvc.entities.Article;
import com.stock.mvc.entities.LigneCommandeClient;
import com.stock.mvc.entities.LigneVente;
import com.stock.mvc.entities.MvStock;

public interface IMvtStkService {

	public MvStock save(MvStock entity);
	public MvStock update(MvStock entity);
	public List<MvStock> selectAll();
	public List<MvStock> selectAll(String sortField,String sort);	
	public MvStock getById(Long id);
	public void remove(Long id);
	public MvStock findOne(String paramName,Object paramValue);
	public MvStock findOne(String[] paramNames,Object paramValues);
	public int findCountBy(String paramName,String paramValue);
	

	

}
