
public class Card {
    private int numTarjeta;
    private Date expiration;
    private int cvv;
    private int nip;
    private boolean actOrDes;
    //private boolean stolen;
    private User owner;


    public Card(User owner, int numTarjeta, Date expiration, int cvv, int nip, boolean actOrDes){
        this.owner=owner;
        this.numTarjeta=numTarjeta;
        this.expiration=expiration;
        this.cvv=cvv;
        this.nip=nip;
        this.actOrDes=actOrDes;
        actOrDes = false;
    }



    public int getNumTarjeta() {
        return numTarjeta;
    }
    public Date getExpiration() {
        return expiration;
    }
    public int getCvv() {
        return cvv;
    }
    public int getNip() {
        return nip;
    }
    public boolean getActOrDes() {
        return actOrDes;
    }
    public User getOwner() {
        return owner;
    }
    



    public void setActOrDes(boolean actOrDes) {
        this.actOrDes = actOrDes;
    }
    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public void setActOrDes(Boolean actOrDes) {
        this.actOrDes = actOrDes;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void activate(Date d){
        if(owner.getCum().getYear()==d.getYear()&&owner.getCum().getMonth()==d.getMonth()){
            setActOrDes(true);
            System.out.println("La tarjeta se activo con exito");
        }
        else{
            System.out.println("La tarjeta no pudo ser activada");
        }
    }
    
    public void state(){
        if(getActOrDes()==true){
            System.out.println("La tarjeta se encuentra activa");   
        }
        else{
            System.out.println("La tarjeta se encuenta desactivada");
        }
    }

    public void stolen(){
        if(getActOrDes()==true){
            setActOrDes(false);
            System.out.println("La tarjeta se ha desactivado");   
        }
        else{
            System.out.println("La tarjeta ya estaba desactivada");
        }
    }
        



    

}