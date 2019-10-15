/*package pack;

public class Banque  {
    final  double[] comptes ;
    Banque(){

    }
    Banque(int n,double d){

        comptes=new double[n] ;
        for(int i=0;i<n;i++){
            comptes[i]=d;
        }
    }
    public double SoldeTotal(){
        double s=0;
        for (int i=0;i<size();i++){
            s=s+comptes[i];
        }
        return s;
    }
    public  void transferer(int s,int dest,double montant ){
        if (comptes[s]>=montant){
            comptes[s]=comptes[s]-montant;
            comptes[s]=comptes[s]+montant;
            System.out.println("okay !!!!!");
        }else {
            System.out.println("insuffisant  !!!!!");
        }
    }
    public int size(){
        return comptes.length;
    }

}*/
