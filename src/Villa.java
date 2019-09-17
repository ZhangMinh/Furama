import java.util.ArrayList;
import java.util.List;

public class Villa extends Services {
    private String tieuChuanPhong;// phong` class A,B,C..
    private String moTaTienNghi;
    private double dienTichHoBoi;
    private int soTang;


    public Villa() {
    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, double dienTichHoBoi, int  soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfo() {
        return super.toString () + '\n' +
                "Tiêu chuẩn phòng: " + this.tieuChuanPhong + '\n' +
                "Mô tả tiện nghi: " + this.moTaTienNghi + '\n' +
                "Diện tích hồ bơi: " + this.dienTichHoBoi + '\n' +
                "Số tầng: " + this.soTang + '\n';
    }
}
