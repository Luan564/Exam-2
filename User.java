public class User {
    private String name;
    private Date cum;
    
    public User(String name, Date cum){
        this.name=name;
        this.cum=cum;

    }

    public Date getCum() {
        return cum;
    }
    public String getName() {
        return name;
    }
    //public void setCum(Date cum) {
    //    this.cum = cum;
    //}
    //public void setName(String name) {
    //    this.name = name;
    //}

    
}
