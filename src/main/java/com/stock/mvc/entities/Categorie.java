package com.stock.mvc.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCategory;
	private String code;
	private String designation;
	@OneToMany(mappedBy="categorie")
	private List<Article> articles;
}
