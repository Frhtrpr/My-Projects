public class Ogrenciler extends Insanlar{

    private Integer sinif;
    private Integer no;
    private Integer girdigidersmat;
    private Integer girdigidersedebiyat;
    private Integer girdigidersfizik;
    private Integer girdigiderskimya;


    public Ogrenciler(String ad_soyad, Integer yas, Integer sinif, Integer no, Integer girdigidersmat, Integer girdigidersedebiyat, Integer girdigidersfizik, Integer girdigiderskimya) {
        super(ad_soyad, yas);
        this.sinif = sinif;
        this.no = no;
        this.girdigidersmat = girdigidersmat;
        this.girdigidersedebiyat = girdigidersedebiyat;
        this.girdigidersfizik = girdigidersfizik;
        this.girdigiderskimya = girdigiderskimya;
    }

    public void ogrencininbilgileri(){
        System.out.println("Adı Soyadı:"+getAd_soyad());
        System.out.println("Yaşı:"+getYas());
        System.out.println("Sınıfı:"+sinif);
        System.out.println("No:"+no);
        System.out.println("Matematik  dersinden "+girdigidersmat+ " puan almistir.");
        System.out.println("Edebiyat dersinden "+girdigidersedebiyat+ " puan almistir.");
        System.out.println("Fizik dersinden "+girdigidersfizik+ " puan almistir.");
        System.out.println("Kimya dersinden "+girdigiderskimya+ " puan almistir.");
   }

   public void devamsizlikbilgisi(Integer gün){
       System.out.println("Ögrencinin devamsizlik gün sayisi: "+gün);
       System.out.println("Devamsızlık gün sayisi 10 gün olmasi durumunda sınıf tekrarı yapılacaktır.");

       if(gün>10){
           System.out.println("Devamsızlıgınızın 10 günden yukarı oldugundan dolayı sınıf tekrarı yapacaksınız.");
       }
       else{
           System.out.println("Devamsızlıgınızın 10 günün aşagısındadır.");
       }


   }

  public void ortalamahesap(){

      System.out.println("Ögrencin ortalaması 50 altında kalması durumunda sınıf tekrarı yapılacaktır\n");

       Double ortalama= (double) ((girdigidersedebiyat+girdigidersmat+girdigiderskimya+girdigidersfizik)/4);
        System.out.println(getAd_soyad()+" adlı ögrencinin not ortalaması: "+ortalama);

        if(ortalama>=85){
            System.out.println(getNo()+"'lu "+getAd_soyad()+" adlı ögrenci " +ortalama +" ortalamayla takdir belgesi almaya hak kazandı");
        }
        else if(ortalama<85 && ortalama>=70){
            System.out.println(getNo()+"'lu "+getAd_soyad()+" adlı ögrenci " +ortalama +" ortalamayla teşekkür belgesi almaya hak kazandı");
        }
        else if( ortalama<70 && ortalama>=50){
            System.out.println(getNo()+"'lu "+getAd_soyad()+" adlı ögrenci " +ortalama +" ortalamayla sınıfı gecmeye hak kazandı");
        }
        else{
            System.out.println(getNo()+"'lu "+getAd_soyad()+" adlı ögrenci " +ortalama +" sınıf tekrarı yapacaktır");
        }
  }

    public Integer getSinif() {
        return sinif;
    }

    public void setSinif(Integer sinif) {
        this.sinif = sinif;
    }

    public Integer getGirdigidersmat() {
        return girdigidersmat;
    }

    public void setGirdigidersmat(Integer girdigidersmat) {
        this.girdigidersmat = girdigidersmat;
    }

    public Integer getGirdigidersedebiyat() {
        return girdigidersedebiyat;
    }

    public void setGirdigidersedebiyat(Integer girdigidersedebiyat) {
        this.girdigidersedebiyat = girdigidersedebiyat;
    }

    public Integer getGirdigidersfizik() {
        return girdigidersfizik;
    }

    public void setGirdigidersfizik(Integer girdigidersfizik) {
        this.girdigidersfizik = girdigidersfizik;
    }

    public Integer getGirdigiderskimya() {
        return girdigiderskimya;
    }

    public void setGirdigiderskimya(Integer girdigiderskimya) {
        this.girdigiderskimya = girdigiderskimya;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }


}


