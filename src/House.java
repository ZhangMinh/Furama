public class House extends Services {
    private String tieuChuanPhong;// phong` class A,B,C..
    private String moTaTienNghi;
    private int soTang;

    public House() {
    }

    public House(String tieuChuanPhong, String moTaTienNghi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }


    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return super.toString () +
                "Tiêu chuẩn phòng: " + this.tieuChuanPhong + '\n' +
                "Mô tả tiện nghi: " + this.moTaTienNghi + '\n' +
                "Số tầng: " + this.soTang + '\n';
    }
}

