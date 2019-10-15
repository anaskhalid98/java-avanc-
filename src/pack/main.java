package pack;

public class main {

	public static void main(String[] args) {
		Thread th1=new Thread(new pack.SanjiEtNamijob(),"Sanji");
		Thread th2=new Thread(new pack.SanjiEtNamijob(),"Namijob");
		
		th1.start();
		th2.start();
	}

}

