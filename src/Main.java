import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceManager serviceManager = new ServiceManager ();
        Scanner scanner = new Scanner ( System.in );
        int choiceNumber;
        for (; ; ) {
            System.out.println ( "Nhập thông tin cho dịch vụ Villa/House/Room" );
            System.out.println ( "1. Villa" );
            System.out.println ( "2. House" );
            System.out.println ( "3. Room" );
            System.out.println ( "4. Thoát" );
            do {
                System.out.println ( "Bấm số để chọn (1/2/3/4): " );
                choiceNumber = scanner.nextInt ();
                switch (choiceNumber) {
                    case 1:
                        serviceManager.setVillas ( serviceManager.addVilla () );
                        break;
                    case 2:
                        serviceManager.setHouses ( serviceManager.addHouse () );
                        break;
                    case 3:
                        serviceManager.setRooms ( serviceManager.addRoom () );

                        break;
                    case 4:
                        System.exit ( 0 ); // thoát chương trình
                        break;
                }
                System.out.println ( "Số lượng dịch vụ Villa: " + serviceManager.getNumberOfVilla () );
                System.out.println ( "Số lượng dịch vụ House: " + serviceManager.getNumberOfHouse () );
                System.out.println ( "Số lượng dịch vụ Room: " + serviceManager.getNumberOfRoom () );
                System.out.println ( "Tổng: " + serviceManager.getTotalOfServices () );
            } while ((choiceNumber < 1) || (choiceNumber > 4));
        }

    }

//    public static Villa addVilla() {
//        Scanner scanner = new Scanner ( System.in );
//        Villa villas = new Villa ();
//        villas.tenDichVu = "Villa";
//        do {
//            System.out.println ( "Nhập vào diện tích sử dụng" );
//            villas.dienTichSuDung = scanner.nextDouble ();
//            if (!checkDienTichSuDung ( villas.dienTichSuDung )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkDienTichSuDung ( villas.dienTichSuDung ));
//
//        do {
//            System.out.println ( "Nhập vào chi phí thuê" );
//            villas.chiPhiThue = scanner.nextDouble ();
//            if (!checkChiPhiThue ( villas.chiPhiThue )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkChiPhiThue ( villas.chiPhiThue ));
//
//        do {
//            System.out.println ( "Nhập vào số người tối đa" );
//            villas.soLuongNguoiToiDa = scanner.nextInt ();
//            if (!checkSoNguoiThamGia ( villas.soLuongNguoiToiDa )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoNguoiThamGia ( villas.soLuongNguoiToiDa ));
//
//
//        System.out.println ( "Nhập vào kiểu thuê(Byte)" );
//        villas.kieuThue = scanner.nextByte ();
//        scanner.nextLine ();
//        System.out.println ( "Nhập vào tiêu chuẩn phòng(String)" );
//        villas.setTieuChuanPhong ( scanner.nextLine () );
//        System.out.println ( "Nhập vào mô tả tiện nghi(String)" );
//        villas.setMoTaTienNghi ( scanner.nextLine () );
//        System.out.println ( "Nhập vào diện tích hồ bơi" );
//        villas.setDienTichHoBoi ( scanner.nextInt () );
//        scanner.nextLine ();
//
//        do {
//            System.out.println ( "Nhập vào số tầng" );
//            villas.setSoTang ( scanner.nextInt () );
//            if (!checkSoTang ( villas.getSoTang () )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoTang ( villas.getSoTang () ));
//
//        return villas;
//    }
//
//    public static House addHouse() {
//        Scanner scanner = new Scanner ( System.in );
//        House houses = new House ();
//        houses.tenDichVu = "House";
//        do {
//            System.out.println ( "Nhập vào diện tích sử dụng" );
//            houses.dienTichSuDung = scanner.nextDouble ();
//            if (!checkDienTichSuDung ( houses.dienTichSuDung )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkDienTichSuDung ( houses.dienTichSuDung ));
//
//        do {
//            System.out.println ( "Nhập vào chi phí thuê" );
//            houses.chiPhiThue = scanner.nextDouble ();
//            if (!checkChiPhiThue ( houses.chiPhiThue )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkChiPhiThue ( houses.chiPhiThue ));
//
//        do {
//            System.out.println ( "Nhập vào số người tối đa" );
//            houses.soLuongNguoiToiDa = scanner.nextInt ();
//            if (!checkSoNguoiThamGia ( houses.soLuongNguoiToiDa )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoNguoiThamGia ( houses.soLuongNguoiToiDa ));
//
//        System.out.println ( "Nhập vào kiểu thuê" );
//        houses.kieuThue = scanner.nextByte ();
//        scanner.nextLine ();
//        System.out.println ( "Nhập vào tiêu chuẩn phòng" );
//        houses.setTieuChuanPhong ( scanner.nextLine () );
//        System.out.println ( "Nhập vào mô tả tiện nghi" );
//        houses.setMoTaTienNghi ( scanner.nextLine () );
//
//        do {
//            System.out.println ( "Nhập vào số tầng" );
//            houses.setSoTang ( scanner.nextInt () );
//            if (!checkSoTang ( houses.getSoTang () )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoTang ( houses.getSoTang () ));
//        return houses;
//    }
//
//    public static Room addRoom() {
//        Scanner scanner = new Scanner ( System.in );
//        Room rooms = new Room ();
//        rooms.tenDichVu = "Room";
//
//        do {
//            System.out.println ( "Nhập vào diện tích sử dụng" );
//            rooms.dienTichSuDung = scanner.nextDouble ();
//            if (!checkDienTichSuDung ( rooms.dienTichSuDung )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkDienTichSuDung ( rooms.dienTichSuDung ));
//
//        do {
//            System.out.println ( "Nhập vào chi phí thuê" );
//            rooms.chiPhiThue = scanner.nextDouble ();
//            if (!checkChiPhiThue ( rooms.chiPhiThue )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkChiPhiThue ( rooms.chiPhiThue ));
//
//        do {
//            System.out.println ( "Nhập vào số người tối đa" );
//            rooms.soLuongNguoiToiDa = scanner.nextInt ();
//            if (!checkSoNguoiThamGia ( rooms.soLuongNguoiToiDa )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoNguoiThamGia ( rooms.soLuongNguoiToiDa ));
//
//        System.out.println ( "Nhập vào kiểu thuê" );
//        rooms.kieuThue = scanner.nextByte ();
//        scanner.nextLine ();
//        System.out.println ( "Nhập vào dịch vụ miễn phí" );
//        rooms.setDichVuMienPhi ( scanner.nextLine () );
//        return rooms;
//    }
//
//    public static boolean checkDienTichSuDung(double dienTichSuDung) {
//        if (dienTichSuDung >= 30 && dienTichSuDung % 1 == 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean checkChiPhiThue(double chiPhiThue) {
//        if (chiPhiThue > 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean checkSoNguoiThamGia(int soNguoiThamGia) {
//        if (soNguoiThamGia > 0 && soNguoiThamGia < 20) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean checkSoTang(int soTang) {
//        if (soTang > 0) {
//            return true;
//        }
//        return false;
//    }

    public static Customer addNewCustomer() {
        Scanner scanner = new Scanner ( System.in );
        Customer customer = new Customer ();

//        do {
//            System.out.println ( "Nhập vào diện tích sử dụng" );
//            villas.dienTichSuDung = scanner.nextDouble ();
//            if (!checkDienTichSuDung ( villas.dienTichSuDung )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkDienTichSuDung ( villas.dienTichSuDung ));
//
//        do {
//            System.out.println ( "Nhập vào chi phí thuê" );
//            villas.chiPhiThue = scanner.nextDouble ();
//            if (!checkChiPhiThue ( villas.chiPhiThue )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkChiPhiThue ( villas.chiPhiThue ));
//
//        do {
//            System.out.println ( "Nhập vào số người tối đa" );
//            villas.soLuongNguoiToiDa = scanner.nextInt ();
//            if (!checkSoNguoiThamGia ( villas.soLuongNguoiToiDa )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoNguoiThamGia ( villas.soLuongNguoiToiDa ));
//
//
//        System.out.println ( "Nhập vào kiểu thuê(Byte)" );
//        villas.kieuThue = scanner.nextByte ();
//        scanner.nextLine ();
//        System.out.println ( "Nhập vào tiêu chuẩn phòng(String)" );
//        villas.setTieuChuanPhong ( scanner.nextLine () );
//        System.out.println ( "Nhập vào mô tả tiện nghi(String)" );
//        villas.setMoTaTienNghi ( scanner.nextLine () );
//        System.out.println ( "Nhập vào diện tích hồ bơi" );
//        villas.setDienTichHoBoi ( scanner.nextInt () );
//        scanner.nextLine ();
//
//        do {
//            System.out.println ( "Nhập vào số tầng" );
//            villas.setSoTang ( scanner.nextInt () );
//            if (!checkSoTang ( villas.getSoTang () )) {
//                System.out.println ( "vui lòng nhập đúng" );
//            }
//        } while (!checkSoTang ( villas.getSoTang () ));

        return customer;
    }
}
