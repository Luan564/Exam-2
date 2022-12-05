public class CreditCard extends Card {
    private double credit;

    public CreditCard(User owner, int numTarjeta, Date expiration, int cvv, int nip, boolean actOrDes, double credit) {
        super(owner, numTarjeta, expiration, cvv, nip, actOrDes);
        this.credit=credit;
        
    }
    public double getCredit() {
        return credit;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void collect(int num,int nipi, double cost){
        if(getActOrDes()==true && getNumTarjeta()== num && getNip() == nipi && cost<= getCredit()){
            setCredit(getCredit()-cost);
            System.out.println("El cargo se realizo con exito"); 
            System.out.println("Usted cuenta con: " +getCredit()+ " de credito restante");

        }
        else{
            System.out.println("El cargo no pudo ser realizado");
        }
    }

    public void pay(int num, double cost){
        if(getActOrDes()==true && getNumTarjeta()== num ){
            setCredit(getCredit()+cost);
            System.out.println("El deposito se realizo con exito");
            System.out.println("Usted cuenta con: " +getCredit()+ " de credito restante");

        }
        else{
            System.out.println("El deposito no pudo ser realizado");
        }
    }

    
}
