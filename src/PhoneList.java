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
        for (Phone phone : phones) {
            System.out.println("-" + phone.getPhoneName());
        }
    }

    public void addPhone(Phone yeniPhone) {
        if (!phones.contains(yeniPhone)) {
            phones.add(yeniPhone);
        }
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }
    public void deletePhoneByID(int phoneID) {
        Phone foundPhone = null;
        for (Phone phone : phones) {
            if (phone.getPhoneID() == phoneID) {
                foundPhone = phone;
                break;
            }
        }
        if (foundPhone != null) {
            phones.remove(foundPhone);
            System.out.println("Telefon silindi: " + foundPhone.getPhoneName());
        } else {
            System.out.println("ID'si " + phoneID + " olan telefon bulunamadı.");
        }
    }

}