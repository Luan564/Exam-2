public class DebitCard extends Card{
    private double wallet;

    public DebitCard(User owner, int numTarjeta, Date expiration, int cvv, int nip, boolean actOrDes, double wallet) {
        super(owner, numTarjeta, expiration, cvv, nip, actOrDes);
        this.wallet=wallet;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public void collect(int num, int nipi, double cost){
        if(getActOrDes()==true && getNumTarjeta() == num && getNip() == nipi && 
        cost<= getWallet()){
            setWallet(getWallet()-cost);
            System.out.println("El cargo se realizo con exito");   
            System.out.println("Usted cuenta con: "+ getWallet() + " restantes");  
        }
        else{
            System.out.println("El cargo no pudo ser realizado");
        }
    }
    public void pay(int num, double cost){
        if(getActOrDes()==true && getNumTarjeta() == num){
            setWallet(getWallet()+cost);
            System.out.println("El deposito se realizo con exito");   
            System.out.println("Usted cuenta con: " + getWallet() + " en su cuenta");  
        }
        else{
            System.out.println("El deposito no pudo ser realizado");
        }
    }

    
}
