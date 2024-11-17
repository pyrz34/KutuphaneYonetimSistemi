import java.util.ArrayList;

class Kutuphane {
    private ArrayList<Kitap> kitaplar = new ArrayList<>();
    private ArrayList<Kullanici> kullanicilar = new ArrayList<>();

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapListele() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (Kitap kitap : kitaplar) {
            kitap.bilgileriGoster();
        }
    }

    public void kullaniciEkle(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }

    public void kullaniciListele() {
        System.out.println("Kayıtlı Kullanıcılar:");
        for (Kullanici kullanici : kullanicilar) {
            kullanici.bilgileriGoster();
        }
    }

    public void kitapKirala(String kitapAdi) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getAd().equalsIgnoreCase(kitapAdi) && !kitap.isKiradaMi()) {
                kitap.setKiradaMi(true);
                System.out.println(kitapAdi + " başarıyla kiralandı!");
                return;
            }
        }
        System.out.println("Kitap bulunamadı veya zaten kirada.");
    }

    public void kitapIadeEt(String kitapAdi) {
        for (Kitap kitap : kitaplar) {
            if (kitap.getAd().equalsIgnoreCase(kitapAdi) && kitap.isKiradaMi()) {
                kitap.setKiradaMi(false);
                System.out.println(kitapAdi + " başarıyla iade edildi!");
                return;
            }
        }
        System.out.println("Kitap bulunamadı veya zaten iade edilmiş.");
    }
}
