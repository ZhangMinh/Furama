public class Room extends Services {
    private String dichVuMienPhi="Trà, cà phê, thuốc lá ";

    public Room() {
    }

    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String showInfo() {
        return  super.toString ()+'\n'+
                "Dịch vụ miễn phí: " + dichVuMienPhi + '\n';
    }
}
