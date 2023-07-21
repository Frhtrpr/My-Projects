import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********OKUL BİLGİ SİSTEMİNE HOŞ GELDİNİZ**********\n");

        String islemeler = "q-Çıkış yaomak için q tusuna basınız.\n" +
                "1-Ögrenci Bilgi Sistemi için 1 tusuna basınız.\n" +
                "2-Ögretmen Bilgi Sistemi için 2 tusuna basınız.\n";

        System.out.println(islemeler);

        while (true) {

            System.out.println("Lütfen işlem için bir tusa basınız.");
            String islem = scanner.nextLine();

            switch (islem) {

                case "q":
                    System.out.println("Okul Bilgi Sisteminden çıkış yapılıyor. ");
                    return;

                case "1":
                    System.out.println("Ögrenci Bilgi Sistemine hoş geldiniz...");
                    Ogrenciler ogrenciAhmet = new Ogrenciler("Ahmet Kara", 16, 10, 234, 65, 76, 45, 56);
                    Ogrenciler ogrenciMehmet = new Ogrenciler("Mehmet Yılmaz", 17, 11, 256, 78, 83, 67, 88);
                    Ogrenciler ogrenciMustafa = new Ogrenciler("Mustafa Saglam", 17, 11, 346, 56, 34, 56, 23);

                    String islemlerogrenci = "q-Çıkışyapmak için q tusuna basınız.\n" +
                            "1-Not bilgileri için 1 tusuna basınız.\n" +
                            "2-Devamsızlık Bilgisi ögrenmek için 2 tusuna basınız.\n"+
                            "3-Ortalama Bilgilendirme Sistemi";

                    System.out.println(islemlerogrenci);

                    System.out.println("Lüften bir işlem seciniz...");
                    String islemogrnot = scanner.nextLine();

                    if (islemogrnot.equals("q")) {
                        System.out.println("Sistemden cıkıs yapılıyor...");
                    } else if (islemogrnot.equals("1")) {
                        System.out.println("Not Bilgileri Sistemine Hoş Geldiniz...");

                        String islemler = "q-Çıkıs yapmak için q tusuna basınız.\n" +
                                "1-Ahmet Kara'nın notlarını göruntulemek için 1 tusuna basınız.\n" +
                                "2-Mehmet Yılmaz'ın notlarını göruntulemek için 2 tusuna basınız.\n" +
                                "3-Mustafa Saglam'ın notlarını göruntulemek için 3 tusuna basınız.";

                        System.out.println(islemler);

                        System.out.println("Lüften kendi notlarını gormek için bir tusa basınız.");
                        String secim = scanner.nextLine();

                        switch (secim) {

                            case "q":
                                System.out.println("Sistemden cıkıs yapılıyor");
                                return;

                            case "1":
                                ogrenciAhmet.ogrencininbilgileri();
                                return;

                            case "2":
                                ogrenciMehmet.ogrencininbilgileri();
                                return;

                            case "3":
                                ogrenciMustafa.ogrencininbilgileri();
                                return;

                            default:
                                System.out.println("Gecersiz islem girisi");
                        }

                    } else if (islemogrnot.equals("2")) {
                        System.out.println("Devamsizlik Bilgi Sitemine Hoş Geldiniz");

                        String islemler = "q-Çıkıs yapmak için q tusuna basınız.\n" +
                                "1-Ahmet Kara'nın devamsızlık bilgilerini için 1 tusuna basınız.\n" +
                                "2-Mehmet Yılmaz'ın devamsızlık bilgilerini için 2 tusuna basınız.\n" +
                                "3-Mustafa Saglam'ın devamsızlık bilgilerini için 3 tusuna basınız.";

                        System.out.println(islemler);

                        System.out.println("Kendinize ait devamsizlik bilgisini görmek için bir tusa basınız.");
                        String islemlerdevamsızlık = scanner.nextLine();



                        switch (islemlerdevamsızlık) {

                            case "q":
                                System.out.println("Sistemden cıkıs yapılıyor...");
                                return;

                            case "1":
                                ogrenciAhmet.devamsizlikbilgisi(5);
                                return;

                            case "2":
                                ogrenciMehmet.devamsizlikbilgisi(7);
                                return;

                            case "3":
                                ogrenciMustafa.devamsizlikbilgisi(12);
                                return;

                            default:
                                System.out.println("Gecersiz islem girişi");
                        }
                    }

                        else if(islemogrnot.equals("3")){
                        System.out.println("Ortalama bilgilendirme Sistemine Hoş Geldiniz");

                        String islemlerort="q-Çıkış için q tusuna basınız.\n"+
                                  "1-Ahmet Kara'nın ortalamasını görüntülemek için 1 tusuna basınız.\n"+
                                  "2-Mehmet Yılmaz'ın ortalamasını göruntulemek için 2 tusuna basınız.\n"+
                                  "3-Mustafa Saglam'ın ortalamasını görüntulemek için 3 tusuna basınız";

                        System.out.println(islemlerort);

                        System.out.println("Ortalamanızı ögrenmek için bir tusa basınız");
                        String islemortalama=scanner.nextLine();

                        switch (islemortalama){

                            case "q":
                                System.out.println("Sşstemden cıkıs yapılıyor.");
                                return;

                            case "1":
                                ogrenciAhmet.ortalamahesap();
                               return;

                            case "2":
                                ogrenciMehmet.ortalamahesap();
                                return;

                            case "3":
                                ogrenciMustafa.ortalamahesap();
                                return;

                            default:
                                System.out.println("Gecersiz islem girisi");
                        }
                    }


                case "2":
                    System.out.println("Ögretmen Bilgi Sistemine hoş geldiniz...");

                    Ogretmenler ogretmenmat = new Ogretmenler("Elif Karakus", 28, 65, 78, 56);
                    Ogretmenler ogretmenedebiyat = new Ogretmenler("Bülent Türkoglu", 32, 76, 83, 88);
                    Ogretmenler ogretmenfizik = new Ogretmenler("Metin Yaman", 54, 45, 67, 56);
                    Ogretmenler ogretmenkimya = new Ogretmenler("Nisa Yıldız", 41, 56, 88, 23);

                    String islemler = "q-Çıkış yapmak için q tusuna basınız.\n" +
                            "1-Kendi verdiginiz not bilgilerini görmek için 1 tusuna basınız.\n" +
                            "2-Bu haftaki gireceginiz ders sayisinızı görmek için 2 tusuna basınzı.";

                    System.out.println(islemler);

                    System.out.println("\nLütfen bir islem seciniz");
                    String islemögretmen = scanner.nextLine();

                    if (islemögretmen.equals("q")) {
                        System.out.println("Sistemden cıkıs yapılıyor");
                        return;

                    } else if (islemögretmen.equals("1")) {
                        System.out.println("Not Bilgi Sistemine Hoş Geldiniz...");

                        String seçimögretmen = "q-Çıkış yapmak içiçn q tusuna bakınız\n" +
                                "1-Elif Karakus not bilgi sistemini görmek için 1 tusuna basınız.\n" +
                                "2-Bülent Türkoglu not bilgi sistemini görmek için 2 tusuna basınız.\n" +
                                "3-Metin Yaman not bilgi sistemini görmek için 3 tusuna basınız.\n" +
                                "4-Nisa Yıldız not bilgi sistemini görmek için 4 tusuna basınız.";

                        System.out.println(seçimögretmen);

                        System.out.println("Kendi hesabınıza girmek için bir tusa basınız.");
                        String islemogretmensecim = scanner.nextLine();

                        switch (islemogretmensecim) {

                            case "q":
                                System.out.println("Sşstemden çıkış yapılıyor.");
                                return;

                            case "1":
                                ogretmenmat.ogretmenbilgileri();
                                return;

                            case "2":
                                ogretmenedebiyat.ogretmenbilgileri();
                                return;
                            case "3":
                                ogretmenfizik.ogretmenbilgileri();
                               return;
                            case "4:":
                                ogretmenkimya.ogretmenbilgileri();
                                return;

                            default:
                                System.out.println("Gecersiz islem girisi");
                        }
                    } else if (islemögretmen.equals("2")) {

                        String seçimögretmenderssayı = "q-Çıkış yapmak içiçn q tusuna bakınız\n" +
                                "1-Elif Karakus gireceginiz ders sayısınızı görmek için 1 tusuna basınız.\n" +
                                "2-Bülent Türkoglu gireceginiz ders sayısınızı görmek için 2 tusuna basınız.\n" +
                                "3-Metin Yaman gireceginiz ders sayısınızı görmek için 3 tusuna basınız.\n" +
                                "4-Nisa Yıldız gireceginiz ders sayısınızı görmek için 4 tusuna basınız." ;

                        System.out.println(seçimögretmenderssayı);

                        System.out.println("Bu haftaki ders sayinizi görmek için bir tusa basınız.");
                        String derssayisi = scanner.nextLine();

                        switch (derssayisi) {

                            case "q":
                                System.out.println("Sistemden çıkış yapılıyor...");
                                return;

                            case "1":
                                ogretmenmat.girecegi_ders_sayisi(28);
                                return;

                            case "2":
                                ogretmenedebiyat.girecegi_ders_sayisi(25);
                                return;

                            case "3":
                                ogretmenfizik.girecegi_ders_sayisi(27);
                                return;

                            case "4":
                                ogretmenkimya.girecegi_ders_sayisi(32);
                                return;

                            default:
                                System.out.println("Gecersiz islem girisi");
                        }
                        return;
                    }
                    return;

                default:
                    System.out.println("Gecersiz islem girisi");
            }
            return;

        }

    }
}



