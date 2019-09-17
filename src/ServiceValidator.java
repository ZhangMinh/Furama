public class ServiceValidator {
    public static boolean checkDienTichSuDung(double dienTichSuDung) {
        if (dienTichSuDung >= 30 && dienTichSuDung % 1 == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkChiPhiThue(double chiPhiThue) {
        if (chiPhiThue > 0) {
            return true;
        }
        return false;
    }

    public static boolean checkSoNguoiThamGia(int soNguoiThamGia) {
        if (soNguoiThamGia > 0 && soNguoiThamGia < 20) {
            return true;
        }
        return false;
    }

    public static boolean checkSoTang(int soTang) {
        if (soTang > 0) {
            return true;
        }
        return false;
    }
}
