public class Kullanici {
    private String isim;
    private int id;

    public Kullanici(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void bilgileriGoster(){
        System.out.println("Kullanıcı Adı :"+ isim + "ID" + id);
    }


}
