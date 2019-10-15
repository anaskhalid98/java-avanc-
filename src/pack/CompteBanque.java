package pack;

public class CompteBanque {
	private int solde=10000;
	
	public int getSolde() {
		return solde;
	}

	public void retirer(int montant) {
		if(this.solde>=montant) {
			System.out.println(Thread.currentThread().getName() + "est sur le point de retirer.");
		this.solde=this.solde - montant;
		System.out.println(Thread.currentThread().getName()+"-- Le solde courant est "+getSolde());
		
	}
		else {
			System.out.println("Pas assez d'argent pour "+Thread.currentThread().getName());
		}

	}


}