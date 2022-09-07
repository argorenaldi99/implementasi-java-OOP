package latihan2;

import java.util.Scanner;

public class Karakter {
    String nama,ras,job;
    int power,hp,spd;
    perlengkapan weapon,armor;

    

public Karakter(String nama, String ras, String job, int power,int hp,int spd, perlengkapan weapon, perlengkapan armor){
    this.nama = nama;
    this.ras  = ras;
    this.job =  job;
    this.power = power;
    this.hp = hp;
    this.spd = spd;
    this.weapon = weapon;
    this.armor = armor;
    

}
public String toString() {
    return this.nama+" "+ this.ras+" " +this.job+" " +this.power+" "+this.hp+" "+this.spd+" "+this.weapon+" "+this.armor;
}
public void setWeapon(perlengkapan weapon) {
    this.weapon = weapon;
    
}
public void setArmor(perlengkapan armor) {
    this.armor = armor;
    
}
public perlengkapan getWeapon(){
    return this.weapon;
}
public perlengkapan getArmor(){
    return this.armor;
}



public static Karakter pilihKarakter1() {

    Karakter pil1 = new Karakter("arthur", "manusia", "Knight", 9800,50000,300,perlengkapan.excalibur(),perlengkapan.armorOfGoldenDawn());
    Karakter pil2 = new Karakter("magus", "elf", "Wizard", 8000,50000,300,perlengkapan.staffOfWizard(),perlengkapan.robeOfWizard());
    Karakter pil3 = new Karakter("northem", "dwarf", "Archer", 8500,50000,300,perlengkapan.bowOfArtemis(),perlengkapan.RobeOfMoon());
    Karakter pil4 = new Karakter("Goblin King", "Superior Goblin", "King",10000, 100000, 150, perlengkapan.goblinKingWeapon(), perlengkapan.goblinKingArmor());
   
    System.out.println("==================Silahkan pilih player 1====================================");
    System.out.println("==================List Karakter=================");
    System.out.println("1."+ pil1);
    System.out.println("2."+ pil2); 
    System.out.println("3."+ pil3); 
    System.out.println("4."+ pil4); 
    System.out.print("Pilih Nomer: ");
    Scanner input = new Scanner(System.in);
    String pilih = input.nextLine();
    if(pilih.equals("1")) {
        pil1 = pil1;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("2")) {
        pil1 = pil2;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("3")) {
        pil1 = pil3;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("4")) {
        pil1 = pil4;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else{
        System.out.println("Error : Karakter tidak ada!");
    }   

return pil1;
}
public static Karakter pilihKarakter2() {

    Karakter pil1 = new Karakter("arthur", "manusia", "Knight", 9800,50000,300,perlengkapan.excalibur(),perlengkapan.armorOfGoldenDawn());
    Karakter pil2 = new Karakter("magus", "elf", "Wizard", 10000,50000,300,perlengkapan.staffOfWizard(),perlengkapan.robeOfWizard());
    Karakter pil3 = new Karakter("northem", "dwarf", "Archer",9000,50000,300,perlengkapan.bowOfArtemis(),perlengkapan.RobeOfMoon());
    Karakter pil4 = new Karakter("Goblin King", "Superior Goblin", "King",10000, 100000, 150, perlengkapan.goblinKingWeapon(), perlengkapan.goblinKingArmor());
   
    System.out.println("==================Silahkan pilih player 2====================================");
    System.out.println("==================List Karakter=================");
    System.out.println("1."+ pil1);
    System.out.println("2."+ pil2); 
    System.out.println("3."+ pil3); 
    System.out.println("4."+ pil4); 
    System.out.print("Pilih Nomer: ");
    Scanner input = new Scanner(System.in);
    String pilih = input.nextLine();
    if(pilih.equals("1")) {
        pil1 = pil1;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("2")) {
        pil1 = pil2;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("3")) {
        pil1 = pil3;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else if(pilih.equals("4")) {
        pil1 = pil4;
        System.out.println("Kamu memilih"+" "+pil1.nama);
    }else{
        System.out.println("Error : Karakter tidak ada!");
    }   

return pil1;
}


public static void Gelut(Karakter pil1,Karakter pil2) {
    double hpX = pil1.hp;
    double hpY = pil2.hp;
    String namaX = pil1.nama;
    String namaY = pil2.nama;
    double powerX = pil1.power + pil1.weapon.damage + pil1.armor.damage;
    double powerY = pil1.power + pil1.weapon.damage + pil1.armor.damage;
    Double defX = pil1.weapon.dmgres + pil1.armor.dmgres;
    double defY = pil2.weapon.dmgres + pil2.armor.dmgres;
    int i = 1 ;

    System.out.println(pil1.nama+" "+"TOTAL HP :"+" "+pil1.hp);
    System.out.println(pil2.nama+" "+"TOTAL HP :"+" "+pil2.hp);
    

  while (hpX != 0 && hpY !=  0){
   System.out.println("=======================TURN KE : "+" "+ i++ +" "+"===========================");
    Double spdX = (pil1.spd+(pil1.spd*((pil1.weapon.spd + pil1.armor.spd))));
    Double spdY =(pil2.spd+(pil2.spd*((pil2.weapon.spd + pil2.armor.spd))));


    if (spdX  < spdY){
        if(hpY > 0){
        System.out.println(pil2.nama +" "+ "Melakukan Attack! Sebesar :"+powerY);
        hpX = hpX - (powerY *defX);
        System.out.println(pil1.nama+" "+"Memiliki Damage resist sebesar:"+defX*100+"%"+" "+" Damage yang diterima :"+(powerY *defX) +" "+"SISA HP :"+ hpX);
        System.out.println(pil1.nama+" "+"TOTAL HP :"+" "+hpX);
        System.out.println(pil2.nama+" "+"TOTAL HP :"+" "+hpY);
        }else if(hpY < 0){
            hpY = 0;
            System.out.println(pil2.nama+" "+"DEAD"+" "+"SISA HP :"+ hpY);
            System.out.println(namaX+" "+"Victory!!!");
        }
        if(hpX > 0){
        System.out.println(pil1.nama +" "+ "Melakukan Attack! Sebesar :"+powerX);
        hpY = hpY - (powerX * defY);
        System.out.println(pil2.nama+" "+"Memiliki Damage resist sebesar:"+defY*100+"%"+" "+"Damage yang diterima :"+(powerX * defY)+" "+"SISA HP :"+ hpY);
        } else if(hpX < 0){
            hpX = 0;
            System.out.println(pil1.nama+" "+"DEAD"+" "+"SISA HP :"+ hpX);
            System.out.println(namaY+" "+"Victory!!!");
        }
    }else if(spdX > spdY){
        if(hpX > 0){
        System.out.println(pil1.nama+" "+ "Melakukan Attack! Sebesar :"+powerX);
        hpY = hpY - (powerX * defY);
        System.out.println(pil2.nama+" "+"Memiliki Damage resist sebesar:"+defY*100+"%"+" "+"Damage yang diterima :"+(powerX * defY)+" "+"SISA HP :"+ hpY);
        System.out.println(pil1.nama+" "+"TOTAL HP :"+" "+hpX);
        System.out.println(pil2.nama+" "+"TOTAL HP :"+" "+hpY);
        }else if(hpX < 0 ){
            hpX = 0;
            System.out.println(pil1.nama+" "+"DEAD"+" "+"SISA HP :"+ hpX);
            System.out.println(namaY+" "+"Victory!!!");
        }
        if(hpY > 0){
        System.out.println(pil2.nama +" "+ "Melakukan Attack! Sebesar :"+powerY);
        hpX = hpX - (powerY * defX);
        System.out.println(pil1.nama+" "+"Memiliki Damage resist sebesar:"+defX*100+"%"+" "+" Damage yang diterima :"+(powerY * defX) +" "+"SISA HP :"+ hpX);
        }else if(hpY < 0){
            hpY = 0;
            System.out.println(pil2.nama+" "+"DEAD"+" "+"SISA HP :"+ hpY);
            System.out.println(namaX+" "+"Victory!!!");
    }

    }else{
        if(hpX > 0){
            System.out.println(pil1.nama+" "+ "Melakukan Attack! Sebesar :"+powerX);
            hpY = hpY - (powerX * defY);
            System.out.println(pil2.nama+" "+"Memiliki Damage resist sebesar:"+defY*100+"%"+" "+"Damage yang diterima :"+(powerX *defY)+" "+"SISA HP :"+ hpY);
            System.out.println(pil1.nama+" "+"TOTAL HP :"+" "+hpX);
            System.out.println(pil2.nama+" "+"TOTAL HP :"+" "+hpY);
            }else if(hpX < 0 ){
                hpX = 0;
                System.out.println(pil1.nama+" "+"DEAD"+" "+"SISA HP :"+ hpX);
                System.out.println(namaY+" "+"Victory!!!");
            }
            if(hpY > 0){
            System.out.println(pil2.nama +" "+ "Melakukan Attack! Sebesar :"+powerY);
            hpX = hpX - (powerY * defX);
            System.out.println(pil1.nama+" "+"Memiliki Damage resist sebesar:"+defX*100+"%"+" "+" Damage yang diterima :"+(powerY *defX) +" "+"SISA HP :"+ hpX);
            }else if(hpY < 0){
                hpY = 0;
                System.out.println(pil2.nama+" "+"DEAD"+" "+"SISA HP :"+ hpY);
                System.out.println(namaX+" "+"Victory!!!");
    }
}
}
}
}
