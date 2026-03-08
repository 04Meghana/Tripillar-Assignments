package module1;

public class EncapsulationPrivate {
    private int id;
    private String email;

    public void setId(int id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
}


