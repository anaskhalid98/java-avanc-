package pack;

public class SanjiEtNamijob implements Runnable {
	private CompteBanque compte=new CompteBanque();
	private int montant=1000;

	@Override
	public void run() {
		while(this.compte.getSolde()>0) {
				System.out.println(Thread.currentThread().getName() + " reveillé.");
				demandeRetrait(this.compte,1000);
				try {
					Thread.sleep(500);
					this.compte.retirer(this.getMontant());
					System.out.println(Thread.currentThread().getName()+" à compléter le retrait");
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
			

			
		}
		
		
	}
	
	public CompteBanque getCompte() {
		return compte;
	}

	public void setCompte(CompteBanque compte) {
		this.compte = compte;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public void demandeRetrait(CompteBanque compte,int montant) {
		this.compte.retirer(montant);
	}
	

}
