package latihan1;
public class Kucing {
    String nama;
  
    public Kucing(String nama) {
      this.nama = nama;
    }
    public void makan() {
      System.out.println(this.nama +" "+"sedang makan");
      
    }
    public class Kucing_ras extends Kucing{
      String jenis;
    
      
    public Kucing_ras(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    public void info_kucing() {
      System.out.println("nama :"+" "+ this.nama);
      System.out.println("jenis :"+" "+this.jenis);
    }
    
  }

    
}
  