public class Customer {
    private String hoVaTen;
    private String dayOfBirth;
    private int soCMND;
    private int soDT;
    private String email;
    private String loaiKhach;
    private String diaChi;
    private Services suDungDichVu;

    public Customer(String hoVaTen, String dayOfBirth, int soCMND, int soDT, String email, String loaiKhach, String diaChi, Services suDungDichVu) {
        this.hoVaTen = hoVaTen;
        this.dayOfBirth = dayOfBirth;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.suDungDichVu = suDungDichVu;
    }

    public Customer() {
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getSuDungDichVu() {
        return suDungDichVu;
    }

    public void setSuDungDichVu(Services suDungDichVu) {
        this.suDungDichVu = suDungDichVu;
    }
}
