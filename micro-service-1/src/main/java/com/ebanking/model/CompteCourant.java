package com.ebanking.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
	
	private double decouvert;

	public CompteCourant( Date dateCreation, double solde, Client client,double decouvert) {
		super(dateCreation, solde, client);
		this.decouvert=decouvert;
	}
	
	
}
