package com.stock.mvc.entities;

import java.util.List;

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
public class Fournisseur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idfournisseur;
	private String nom;
	private String prenom;
	private String adresse;
	private String photo;
	private String mail;
	
	@OneToMany(mappedBy="fournisseur")
	private List<CommandeFournisseur>CommandeFournisseurs;
}
