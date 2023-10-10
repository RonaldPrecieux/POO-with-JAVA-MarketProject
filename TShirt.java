package initiation;
public class TShirt extends Article {
	//Constructeurs
	public TShirt() {
		this.nom="T-shirt neutre";
		this.categorie="T-Shirt";
		this.description="";
		this.prix=3000;
		this.prixMin=1000;
		this.qte=1;
		this.espace=0.1;
		this.taille="M";
	}

	public TShirt(String nom, String desc, int p1, int p2, int qty, String taille) {
		super(nom, "T-Shirt", desc, p1, p2, qty, 0.1);
		this.taille=taille;
	}

	public TShirt(String n, int prix, String taille) {
		super(n, "T-Shirt", prix);
		this.espace=0.1;
		this.taille=taille;
	}

	public TShirt(TShirt original) {
		super(original);
		this.taille=original.taille;
	}
	
	//Accesseurs
	public String getTaille() {
		return taille;
	}

	//Mutateurs
	public void setTaille(String taille) {
		this.taille = taille;
	}
	
	//Methodes
	public String afficher() {
		String texte = super.afficher();
		texte+=" Taille: "+taille+".";
		return texte;
	}
	
	//Attributs
	private String taille;
}
