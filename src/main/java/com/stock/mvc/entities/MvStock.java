package com.stock.mvc.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class MvStock {
	
	public static final int ENTREE=1;
	public static final int SORTIE=2;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMvStock;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantite;
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
}
