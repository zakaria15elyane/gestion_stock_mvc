package com.stock.mvc.dao.impl;

import java.awt.Window.Type;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.runners.Parameterized;

import com.stock.mvc.dao.ICategoryDao;
import com.stock.mvc.dao.IClientDao;
import com.stock.mvc.dao.ICommandeClientDao;
import com.stock.mvc.dao.IGenericDao;
import com.stock.mvc.entities.Categorie;
import com.stock.mvc.entities.Client;
import com.stock.mvc.entities.CommandeClient;

public class CommandeClientDaoImpl extends GenericDaoImpl<CommandeClient> implements ICommandeClientDao {
	

}
