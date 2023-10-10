package initiation;
import java.util.Calendar;

public class Personne {
	//Constructeurs
	public Personne() {
		Calendar now = Calendar.getInstance();
				
		this.nom="Mon ami";
		this.genre='M';
		this.nationalite="Inconnue";
		this.anneeNais=now.get(Calendar.YEAR) - 20;
		this.cash=2000;	
	}
	
	public Personne(String n, char g, String nat, int a, int c) {
		Calendar now = Calendar.getInstance();
		
		this.nom=n.trim();
		this.genre=Character.toUpperCase(g);
		this.nationalite=nat.trim();
		
		a=Math.max(Math.abs(a),1933);
		a=Math.min(a, now.get(Calendar.YEAR));
		this.anneeNais=a;		
		this.cash=Math.min(c,0);	
	}

	public Personne(String n, char g, int c) {
		Calendar now = Calendar.getInstance();
		this.nom=n.trim();
		this.genre=Character.toUpperCase(g);
		this.nationalite="Inconnue";
		
		this.anneeNais=now.get(Calendar.YEAR) - 20;
		this.cash=Math.min(c,0);	
	}

	public Personne(Personne jumeau) {
		this.nom=jumeau.nom;
		this.genre=jumeau.genre;
		this.nationalite=jumeau.nationalite;
		this.anneeNais=jumeau.anneeNais;		
		this.cash=jumeau.cash;	
	}
	
	//Accesseurs
	public String getNom() {
		return nom;
	}

	public char getGenre() {
		return genre;
	}

	public String getNationalite() {
		return nationalite;
	}

	public int getAnneeNais() {
		return anneeNais;
	}

	public int getCash() {
		return cash;
	}

	//Mutateurs
	public void setNom(String nom) {
		this.nom = nom.trim();
	}

	public void setGenre(char genre) {
		this.genre = Character.toUpperCase(genre);
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite.trim();
	}

	public void setAnneeNais(int anneeNais) {
		Calendar now = Calendar.getInstance();
		anneeNais=Math.max(Math.abs(anneeNais),1933);
		this.anneeNais=Math.min(anneeNais, now.get(Calendar.YEAR));
	}

	public void setCash(int cash) {
		this.cash = Math.min(cash,0);
	}

	//Methodes
	public String monGenre() {
		switch(genre)
		{
		case 'M':
			return "masculin";
		case 'F':
			return "feminin";
		default:
			return "Ca ne vous concerne pas!";
		}
	}
	
	public int age() {		
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR)-anneeNais;
	}
	public String SePresenter() {
		String texte ="";
		texte += "On m'appelle"+nom+". ";
		texte+= "Je suis de sexe: "+ monGenre()+ ". ";
		texte += "Je suis de nationalité"+nationalite+". ";
		texte += "J'ai "+age()+"ans. ";
		texte+= "Je possede actuellement 3"+cash+". ";
		return texte;
		
	}
	
	//Attributs
	protected String nom;
	protected char genre;
	protected String nationalite;
	protected int anneeNais;
	
	protected int cash;	
}
