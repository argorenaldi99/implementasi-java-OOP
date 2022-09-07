package latihan2;

public class perlengkapan {
    String nama,jenis;
    int damage;
    double dmgres;
    double spd;
public perlengkapan(String nama, String jenis, int damage,double dmgres, double spd){
    this.nama = nama;
    this.jenis = jenis;
    this.damage = damage;
    this.dmgres = dmgres;
    this.spd = spd;
    

}
public String toString() {
    return this.nama+" "+ this.jenis+" " +this.damage+" " +this.dmgres+" "+this.spd;
}

 
 public static perlengkapan excalibur(){
        perlengkapan excalibur = new perlengkapan("excalibur", "pedang", 9500, 0.0, 0.5);
        return excalibur;
}  
    public static perlengkapan staffOfWizard(){
        perlengkapan staffOfWizard = new perlengkapan("staff Of Wizard", "tongkat", 9500, 0.0, 0.5);
        return staffOfWizard;
    }
    public static perlengkapan bowOfArtemis(){
        perlengkapan bowOfArtemis = new perlengkapan("bow Of Artemis", "panah", 8500, 0.1, 0.0);
        return bowOfArtemis;
    }
    public static perlengkapan goblinKingWeapon(){
        perlengkapan goblinKingWeapon = new perlengkapan("goblin King Weapon", "tongkat", 10000, 0.1, 0.0);
        return goblinKingWeapon;
    }
    
   




public static perlengkapan armorOfGoldenDawn(){
    perlengkapan armorOfGoldenDawn = new perlengkapan("armor Of Golden Dawn", "armor", 0, 0.4, 0.1);
    return armorOfGoldenDawn;
}
public static perlengkapan robeOfWizard(){
    perlengkapan robeOfWizard = new perlengkapan("robe Of Wizard", "armor", 0, 0.4, 0.1);
    return robeOfWizard;  
}

public static perlengkapan RobeOfMoon(){
    perlengkapan RobeOfMoon = new perlengkapan("Robe Of Moon", "armor", 0, 0.6, 0.5);
    return RobeOfMoon;

}
public static perlengkapan goblinKingArmor(){
    perlengkapan goblinKingArmor = new perlengkapan("goblin King Armor", "armor", 0, 1.0, 0.0);
    return goblinKingArmor;

}

 
}


