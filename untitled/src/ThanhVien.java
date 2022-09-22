public class ThanhVien {
    String ten, quequan;
    int tuoi;

    public ThanhVien() {
    }

    public ThanhVien(String ten, String quequan, int tuoi) {
        this.ten = ten;
        this.quequan = quequan;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String thongTin(){
        return ten +"\t"+tuoi+"\t\t"+quequan;
    }
}
