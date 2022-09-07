package latihan1;

public class Pemilik extends Kucing {
    String email;
    private String pass;

public Pemilik (String nama, String email) {

    super(nama);   
    this.email = email;
    
        
            
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public void info_pemilik() {
        System.out.println("nama :"+" "+ this.nama);
        System.out.println("email :"+" "+this.email);
        System.out.println("pass :"+" "+this.pass);
      }
}


