import java.util.ArrayList;

public class PhoneList {
    private ArrayList<Phone> phones;

    public PhoneList() {
        phones = new ArrayList<>();
    }

    public void addPhone(int phoneID, int price, int discountRate, int stockAmount, String phoneName, Brands liste, int phoneMemory, int phoneScreen, int phoneBattery, int phoneRam, String phoneColor) {
        Phone phone = new Phone(phoneID, price, discountRate, stockAmount, phoneName, liste, phoneMemory, phoneScreen, phoneBattery, phoneRam, phoneColor);
        phones.add(phone);
    }
    public void printPhone() {
        for (Phone phones : phones) {
            System.out.println("-" + phones.getPhoneName());
        }
    }
}
