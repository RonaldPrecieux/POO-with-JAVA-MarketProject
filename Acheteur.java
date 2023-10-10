package initiation;
import java.util.HashMap;
import java.util.Map;

public class Acheteur extends Personne {
	//Constructor 
	public Acheteur() {
		super();
		tailleHaut = "XL";
		tailleBas = 30;
		pointure = 45;
		article=new HashMap<>();
		article.put("Basket Nike", 2);
		article.put("Chemise Hugo Boss manche longue", 1);
		article.put("Jean noir", 1);
		sac = new HashMap <>();
		
	}

	public Acheteur(String n, char g, String nat, int anneeNais,int cash,String tailleHaut,int tailleBas, int pointure,int budget) {
		super(n, g, nat, anneeNais, cash);
		this.tailleHaut=tailleHaut;
		this.tailleBas=tailleBas;
		this.pointure=pointure;
		this.budget=budget;
		article= new HashMap<>();
		sac = new HashMap<>();
		}

	public Acheteur(String n, char g, int c) {
		super(n, g, c);
		tailleHaut = "XL";
		tailleBas = 30;
		pointure = 45;
		article=new HashMap<>();
		article.put("Basket Nike", 2);
		article.put("Chemise Hugo Boss manche longue", 1);
		article.put("Jean noir", 1);
		sac = new HashMap <>();
		
	}

	public Acheteur(Acheteur jumeau) {
		super(jumeau);
		this.tailleHaut=jumeau.tailleHaut;
		this.tailleBas=jumeau.tailleBas;
		this.pointure=jumeau.pointure;
		this.budget=jumeau.budget;
		this.article= jumeau.article;
		this.sac = jumeau.sac;
		
		// TODO Auto-generated constructor stub
	}
	//Ascesseur
	
	public String getTailleHaut() {
		return tailleHaut;
	}
	public int getTailleBas() {
			return tailleBas;
		}
	public int getPointure() {
		return pointure;
	}
	
	public int getBudget() {
		return budget;
	}

//Mutateur
	public void setTailleBas(int tailleBas) {
		this.tailleBas = tailleBas;
	}

	
	public void setTailleHaut(String tailleHaut) {
			this.tailleHaut = tailleHaut;
		}

	public void setPointure(int pointure) {
		this.pointure = pointure;
	}

	
	public void setBudget(int budget) {
		this.budget = budget;
	}

	//Methode
	public void ajouterUnarticleDeLaListe(String nomArticle, int quantite) {
		quantite=Math.abs(quantite);
		article.put(nomArticle, quantite);
	}
	public void retirerUnarticleDeLaListe(String nomArticle, int quantite){
		int actual_article_quantity=article.get(nomArticle);
		quantite=Math.min(quantite, actual_article_quantity);
		article.put(nomArticle, (actual_article_quantity-quantite));	
	}
	public void ajouterUnarticleAuSac(String nomArticle, int quantite) {
		quantite=Math.abs(quantite);
		sac.put(nomArticle, quantite);
	}
	
	public void acheter(String nomArticle, int quantite) {
		retirerUnarticleDeLaListe(nomArticle,quantite);
		ajouterUnarticleAuSac(nomArticle,quantite);
		/////////////Comment calculer le solde pour le retirer du budget///
	}
	
	
	

	protected String tailleHaut;
	protected int tailleBas;
	protected int pointure;
	protected int budget;
	protected Map<String, Integer> article;

	protected Map<String, Integer> sac;
}
