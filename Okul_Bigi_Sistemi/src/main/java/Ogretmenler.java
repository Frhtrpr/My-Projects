public class Ogretmenler extends Insanlar{


    private Integer ogrAhmet;
    private Integer ogrMehmet;
    private Integer ogrMustafa;


    public Ogretmenler(String ad_soyad, Integer yas,  Integer ogrAhmet, Integer ogrMehmet, Integer ogrMustafa) {
        super(ad_soyad, yas);

        this.ogrAhmet = ogrAhmet;
        this.ogrMehmet = ogrMehmet;
        this.ogrMustafa = ogrMustafa;
    }

    public void ogretmenbilgileri() {
        System.out.println("Adı Soyadı:" + getAd_soyad());
        System.out.println("Yaşı:" + getYas());
        System.out.println("\n Ahmet Kara:" + ogrAhmet +
                "\nMehmet Yılmaz:" + ogrMehmet +
                "\nMustafa Saglam:" + ogrMustafa);
    }



    public void girecegi_ders_sayisi(Integer ders){
        System.out.println(getAd_soyad()+": adlı ögretmenin bu haftaki girecegi ders sayısı: "+ders);
    }

    public Integer getOgrAhmet() {
        return ogrAhmet;
    }

    public void setOgrAhmet(Integer ogrAhmet) {
        this.ogrAhmet = ogrAhmet;
    }

    public Integer getOgrMehmet() {
        return ogrMehmet;
    }

    public void setOgrMehmet(Integer ogrMehmet) {
        this.ogrMehmet = ogrMehmet;
    }

    public Integer getOgrMustafa() {
        return ogrMustafa;
    }

    public void setOgrMustafa(Integer ogrMustafa) {
        this.ogrMustafa = ogrMustafa;
    }



}
