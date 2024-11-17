 public class Ogrenci extends Kullanici{
    private String OgrenciNo;
    public Ogrenci(String isim,int id,String OgrenciNo) {
        super(isim,id);
        this.OgrenciNo =OgrenciNo;
    }
    public String getOgrenciNo() {
        return OgrenciNo;
    }
    public void setOgrenciNo(String OgrenciNo) {
        this.OgrenciNo = OgrenciNo;
    }
    @Override
     public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Ogrenci Numarası"+getOgrenciNo());
    }
    
}
