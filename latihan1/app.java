package latihan1;

import latihan1.Kucing.Kucing_ras;

public class app {
    
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("cimoy");
        Kucing_ras kucing2 = kucing1.new Kucing_ras("garfiled", "short british");
        Pemilik pemilik1 = new Pemilik("argo", "argo.com");
       
    
    
      kucing1.makan();
      kucing2.info_kucing();
      kucing2.makan();
      pemilik1.setPass("123392");
      pemilik1.info_pemilik();
      pemilik1.makan();

      
    
    
    
      }
}
