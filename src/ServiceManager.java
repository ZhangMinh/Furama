import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceManager {
    private List<Villa> villas = new ArrayList<> ();
    private List<House> houses = new ArrayList<> ();
    private List<Room> rooms = new ArrayList<> ();

    public List<Villa> getVillas() {
        return villas;
    }

    public void setVillas(Villa villa) {
        villas.add ( villa );
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(House house) {
        houses.add ( house );
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Room room) {
        rooms.add ( room );
    }

    public static Villa addVilla() {
        Scanner scanner = new Scanner ( System.in );
        Villa villa = new Villa ();
        villa.setTenDichVu ( "Villa" );
        do {
            System.out.println ( "Nhập vào diện tích sử dụng" );
            villa.setDienTichSuDung ( scanner.nextDouble () );
            if (!ServiceValidator.checkDienTichSuDung ( villa.getDienTichSuDung () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkDienTichSuDung ( villa.getDienTichSuDung () ));

        do {
            System.out.println ( "Nhập vào chi phí thuê" );
            villa.setChiPhiThue ( scanner.nextDouble () );
            if (!ServiceValidator.checkChiPhiThue ( villa.getChiPhiThue () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkChiPhiThue ( villa.getChiPhiThue () ));

        do {
            System.out.println ( "Nhập vào số người tối đa" );
            villa.setSoLuongNguoiToiDa ( scanner.nextInt () );
            if (!ServiceValidator.checkSoNguoiThamGia ( villa.getSoLuongNguoiToiDa () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkSoNguoiThamGia ( villa.getSoLuongNguoiToiDa () ));


        System.out.println ( "Nhập vào kiểu thuê(Byte)" );
        villa.setKieuThue ( scanner.nextByte () );
        scanner.nextLine ();
        System.out.println ( "Nhập vào tiêu chuẩn phòng(String)" );
        villa.setTieuChuanPhong ( scanner.nextLine () );
        System.out.println ( "Nhập vào mô tả tiện nghi(String)" );
        villa.setMoTaTienNghi ( scanner.nextLine () );
        System.out.println ( "Nhập vào diện tích hồ bơi" );
        villa.setDienTichHoBoi ( scanner.nextInt () );
        scanner.nextLine ();

        do {
            System.out.println ( "Nhập vào số tầng" );
            villa.setSoTang ( scanner.nextInt () );
            if (!ServiceValidator.checkSoTang ( villa.getSoTang () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkSoTang ( villa.getSoTang () ));

        return villa;
    }

    public static House addHouse() {
        Scanner scanner = new Scanner ( System.in );
        House houses = new House ();
        houses.setTenDichVu ( "House" );
        do {
            System.out.println ( "Nhập vào diện tích sử dụng" );
            houses.setDienTichSuDung ( scanner.nextDouble () );
            if (!ServiceValidator.checkDienTichSuDung ( houses.getDienTichSuDung () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkDienTichSuDung ( houses.getDienTichSuDung () ));

        do {
            System.out.println ( "Nhập vào chi phí thuê" );
            houses.setChiPhiThue ( scanner.nextDouble () );
            if (!ServiceValidator.checkChiPhiThue ( houses.getChiPhiThue () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkChiPhiThue ( houses.getChiPhiThue () ));

        do {
            System.out.println ( "Nhập vào số người tối đa" );
            houses.setSoLuongNguoiToiDa ( scanner.nextInt () );
            if (!ServiceValidator.checkSoNguoiThamGia ( houses.getSoLuongNguoiToiDa () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkSoNguoiThamGia ( houses.getSoLuongNguoiToiDa () ));

        System.out.println ( "Nhập vào kiểu thuê" );
        houses.setKieuThue ( scanner.nextByte () );
        scanner.nextLine ();
        System.out.println ( "Nhập vào tiêu chuẩn phòng" );
        houses.setTieuChuanPhong ( scanner.nextLine () );
        System.out.println ( "Nhập vào mô tả tiện nghi" );
        houses.setMoTaTienNghi ( scanner.nextLine () );

        do {
            System.out.println ( "Nhập vào số tầng" );
            houses.setSoTang ( scanner.nextInt () );
            if (!ServiceValidator.checkSoTang ( houses.getSoTang () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkSoTang ( houses.getSoTang () ));
        return houses;
    }

    public static Room addRoom() {
        Scanner scanner = new Scanner ( System.in );
        Room rooms = new Room ();
        rooms.setTenDichVu ( "Room" );

        do {
            System.out.println ( "Nhập vào diện tích sử dụng" );
            rooms.setDienTichSuDung ( scanner.nextDouble () );
            if (!ServiceValidator.checkDienTichSuDung ( rooms.getDienTichSuDung () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkDienTichSuDung ( rooms.getDienTichSuDung () ));

        do {
            System.out.println ( "Nhập vào chi phí thuê" );
            rooms.setChiPhiThue ( scanner.nextDouble () );
            if (!ServiceValidator.checkChiPhiThue ( rooms.getChiPhiThue () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkChiPhiThue ( rooms.getChiPhiThue () ));

        do {
            System.out.println ( "Nhập vào số người tối đa" );
            rooms.setSoLuongNguoiToiDa ( scanner.nextInt () );
            if (!ServiceValidator.checkSoNguoiThamGia ( rooms.getSoLuongNguoiToiDa () )) {
                System.out.println ( "vui lòng nhập đúng" );
            }
        } while (!ServiceValidator.checkSoNguoiThamGia ( rooms.getSoLuongNguoiToiDa () ));

        System.out.println ( "Nhập vào kiểu thuê" );
        rooms.setKieuThue ( scanner.nextByte () );
        scanner.nextLine ();
        System.out.println ( "Nhập vào dịch vụ miễn phí" );
        rooms.setDichVuMienPhi ( scanner.nextLine () );
        return rooms;
    }

    public int getNumberOfVilla() {
        return villas.size ();
    }

    public int getNumberOfHouse() {
        return houses.size ();
    }

    public int getNumberOfRoom() {
        return rooms.size ();
    }

    public int getTotalOfServices() {
        return villas.size () + houses.size () + rooms.size ();
    }
}
