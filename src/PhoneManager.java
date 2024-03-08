import java.util.Scanner;
import java.util.ArrayList;


public class PhoneManager {
    private BrandsList brandsList;
    private BrandsList liste;
    private PhoneList phoneList;
    private int findPid;
    private String arama;
    public PhoneManager(BrandsList brandsList, PhoneList phoneList,BrandsList liste) {
        this.brandsList = brandsList;
        this.phoneList = phoneList;
        this.liste = liste;
    }

    public void eklePhone() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("ID:");
        int phoneID = girdi.nextInt();
        System.out.print("Fiyatı:");
        int price = girdi.nextInt();
        System.out.print("Indirim oranı:");
        int discountRate = girdi.nextInt();
        System.out.print("Stok durumu:");
        int stockAmount = girdi.nextInt();
        girdi.nextLine(); // Bir sonraki satıra geçmek için
        System.out.print("Ismi:");
        String phoneName = girdi.nextLine();
        System.out.print("Markası(ID):");

        int secim = girdi.nextInt();
        Brands selectedBrand = brandsList.getBrandByID(secim);
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }

        System.out.print("Hafızası:");
        int phoneMemory = girdi.nextInt();
        System.out.print("Ekran:");
        int phoneScreen = girdi.nextInt();
        System.out.print("Batarya:");
        int phoneBattery = girdi.nextInt();
        System.out.print("RAM:");
        int phoneRAM = girdi.nextInt();
        System.out.print("Renk:");
        String phoneColor = girdi.next();

        // Phone oluşturma
        Phone yeniPhone = new Phone(phoneID, price, discountRate, stockAmount, phoneName, selectedBrand, phoneMemory, phoneScreen, phoneBattery,phoneRAM,phoneColor);

        // PhoneList'e ekleme
        phoneList.addPhone(yeniPhone);
    }
    public void printPhones() {
        ArrayList<Phone> phones = phoneList.getPhones();
        System.out.println("Fiyat ve ID ile birlikte:");
        for (Phone phone : phones) {
            System.out.println("- " + phone.getPhoneName() + "(ID:" + phone.getPhoneID() + ")");
            System.out.println("Fiyat: " + phone.getPrice());
            // Diğer telefon özelliklerini burada yazdırabilirsiniz
        }
    }
    public void findPhoneByID(int findPid) {
        ArrayList<Phone> phones = phoneList.getPhones();
        for (Phone phone : phones) {
            if (findPid == phone.getPhoneID()){
                System.out.println("ID:" + phone.getPhoneID() + " " + phone.getPhoneName());
            }
        }
    }
    public void findPhoneByBrand(String arama) {
        ArrayList<Phone> phones = phoneList.getPhones();
        Brands brand = liste.getBrandByName(arama);
        for (Phone phone : phones) {
            if (phone.getListe().equals(brand)) {
                System.out.println("ID:" + phone.getPhoneID() + " " + phone.getPhoneName());
            }
        }
    }
    public void deletePhoneByID(int phoneID) {
        phoneList.deletePhoneByID(phoneID);
    }

}
