public class Kitap {
    private String ad;
    private String yazar;
    private boolean kiradaMi;

    public Kitap(String ad,String yazar,boolean kiradaMi){
        this.ad =ad;
        this.yazar=yazar;
        this.kiradaMi=kiradaMi;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getYazar() {
        return yazar;
    }
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
    public boolean isKiradaMi() {
        return kiradaMi;

    }
    public void setKiradaMi(boolean kiradaMi) {
        this.kiradaMi = kiradaMi;

    }
    public void bilgileriGoster(){
        System.out.println("Kitap Adı: " +ad + "Yazar: " +yazar + "Kirada mı ?" +(kiradaMi ? "Evet " :" Hayır"));

    }
}
