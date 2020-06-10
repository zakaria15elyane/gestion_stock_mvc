package com.stock.mvc.dao.impl;

import java.awt.Window.Type;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.runners.Parameterized;

import com.stock.mvc.dao.ICommandeFournisseurDao;
import com.stock.mvc.dao.IGenericDao;
import com.stock.mvc.entities.CommandeFournisseur;

public class CommandeFournisseurDaoImpl extends GenericDaoImpl<CommandeFournisseur> implements ICommandeFournisseurDao {

}
