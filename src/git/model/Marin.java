package git.model;

public class Marin {
	
/******** CHAMPS ********/
	private Long id;

	private String nom;
	private String prenom;
	private int age;

	/********** CONSTRUCTEURS *********/
	public Marin(){
		return;
	}
	
	public Marin(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	/********* GETTERS *********/
	
	public Long getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	/********* SETTERS *********/
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/******* METHODES ******/
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id=").append(id+", ");
		sb.append("nom=").append(nom+", ");
		sb.append("prenom=").append(prenom+", ");
		sb.append("age=").append(age);
		return sb.toString();
	}
}