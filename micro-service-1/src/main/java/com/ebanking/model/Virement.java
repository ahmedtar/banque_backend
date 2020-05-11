package com.ebanking.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("V")
public class Virement extends Operation {
	
	@ManyToOne
	@JoinColumn(name = "NUM_CPTE_DEST")
	Compte destinataireCompte;
	
	
	public Virement(Compte compte,Compte dest, double montant ) {
		super(  montant, compte);
		this.destinataireCompte=dest;
		// TODO Auto-generated constructor stub
	}
	
<<<<<<< HEAD
	
=======
	public Long getDestinataireCompteId() {
		return destinataireCompte.getNumCompte();
	}
>>>>>>> 58e225cce3d31fde80a87522ced37867a2474af0

}
