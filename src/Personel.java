public class Personel extends Kullanici {
    private String departman;

    public Personel(String isim,int id,String departman){
        super(isim,id);
        this.departman=departman;
    }
    public String getDepartman(){
        return departman;
    }
    public void setDepartman(String departman){
        this.departman=departman;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Departman: "+getDepartman());
    }
}
