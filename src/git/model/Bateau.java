package git.model;

import git.util.Statut;

import java.util.ArrayList;
import java.util.List;

public class Bateau {
	private Long id;
	
	private String nom;
	
	private Statut statut;

	private List<Marin> equipage = new ArrayList<Marin>();
	
	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Marin> getEquipage() {
		return new ArrayList<Marin>(this.equipage);
	}

	public boolean setMarin(Marin m) {
		if(m != null)
		{
			return equipage.add(m);
		}
		return false;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Bateau [id=" + id + ", nom=" + nom + "]";
	}	
	
	
}
