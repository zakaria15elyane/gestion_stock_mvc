package com.stock.mvc.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Article {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idArticle;
	private String codeArticle;
	private String designation;
	private String prixUnitaireHT;
	private String tauxTva;
	private BigDecimal prixUnitaireTTC;
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Categorie categorie;

	
}
