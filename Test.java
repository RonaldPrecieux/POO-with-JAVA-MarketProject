package initiation;
public class Test {

	public static void main(String[] args) {
		TShirt truc = new TShirt();
		Short jean = new Short("Short en jean",2000, 38);
		Article produit = new Article("Balenciaga bleue et noire","Chaussure",18000);
		afficherTout(truc,jean,produit);

		System.out.println("Modifions quelques prix");
		jean.setPrix(4000);
		produit.setPrixMin(15000);
		afficherTout(truc,jean,produit);		
		
		System.out.println("On repart acheter");
		truc.acheter(18);
		jean.acheter(2);
		produit.acheter(5);
		afficherTout(truc,jean,produit);	

		System.out.println("Maintenant on va v"
				+ "endre!");
		Article a1 = truc.vendre(4);
		Article a2 = jean.vendre(6);
		Article a3 = produit.vendre(3);
		afficherTout(truc,jean,produit);

		System.out.println("Voici ce qu'on a vendu");
		afficherTout(a1,a2,a3);	
		
		Personne BabaChaussure = new Personne();
		System.out.println(BabaChaussure.SePresenter());
		
		
		Short shortPuma= new Short();
		shortPuma.setTaille(50);
		Short ShortPUMAFake = new Short(shortPuma);
		
		System.out.println("Voici le fake"+ShortPUMAFake.afficher());
		
		
	}
	
	
	
	static void afficherTout(Article a, Article b, Article c) {
		System.out.println("Inventaire actuel:".toUpperCase());
		System.out.println("------------------");
		System.out.println("1. "+ a.afficher());
		System.out.println("2. "+ b.afficher());
		System.out.println("3. "+ c.afficher());
		System.out.println("\n\n\n");		
	}
}
