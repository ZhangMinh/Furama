public abstract class Services {
    private String tenDichVu;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiToiDa;
    private byte kieuThue;
    private static int service_count = 0;

    public Services() {
    }

    public Services(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, byte kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public byte getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(byte kieuThue) {
        this.kieuThue = kieuThue;
    }

    public static int getService_count() {
        return service_count;
    }

    public static void setService_count(int service_count) {
        Services.service_count = service_count;
    }

    public abstract String showInfo();

    @Override
    public String toString() {
        return "==========" + tenDichVu + service_count + "==========" + '\n' +
                "Diện tích sử dụng: " + dienTichSuDung + "\n" +
                "Chi phí thuê: " + chiPhiThue + "\n" +
                "Số người tối đa: " + soLuongNguoiToiDa + "\n" +
                "Kiểu thuê: " + kieuThue;
    }
}
