public class Main {
    public static void main(String[] args) {
        Kutuphane kutuphane = new Kutuphane();

        // Kitaplar ekle
        kutuphane.kitapEkle(new Kitap("Java Programlama", "Ali Yılmaz",false));
        kutuphane.kitapEkle(new Kitap("Python Rehberi", "Ayşe Kaya",false));

        // Kullanıcılar ekle
        kutuphane.kullaniciEkle(new Ogrenci("Ahmet", 1, "20231001"));
        kutuphane.kullaniciEkle(new Personel("Mehmet", 2, "Bilgi İşlem"));

        // Listele
        kutuphane.kitapListele();
        kutuphane.kullaniciListele();

        // Kitap kirala ve iade et
        kutuphane.kitapKirala("Java Programlama");
        kutuphane.kitapListele();
        kutuphane.kitapIadeEt("Java Programlama");
        kutuphane.kitapListele();
    }
}
