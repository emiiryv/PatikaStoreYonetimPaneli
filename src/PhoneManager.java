import java.util.Scanner;
import java.util.ArrayList;


public class PhoneManager {
    private BrandsList brandsList;
    private PhoneList phoneList;

    public PhoneManager(BrandsList brandsList, PhoneList phoneList) {
        this.brandsList = brandsList;
        this.phoneList = phoneList;
    }

    public void eklePhone() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("ID:");
        int phoneID = girdi.nextInt();
        System.out.println("Fiyatı:");
        int price = girdi.nextInt();
        System.out.println("Indirim oranı:");
        int discountRate = girdi.nextInt();
        System.out.println("Stok durumu:");
        int stockAmount = girdi.nextInt();
        girdi.nextLine(); // Bir sonraki satıra geçmek için
        System.out.println("Ismi:");
        String phoneName = girdi.nextLine();
        System.out.println("Markası(ID):");

        int secim = girdi.nextInt();
        Brands selectedBrand = brandsList.getBrandByID(secim);
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }

        System.out.println("Hafızası:");
        int phoneMemory = girdi.nextInt();
        System.out.println("Ekran:");
        int phoneScreen = girdi.nextInt();
        System.out.println("Batarya:");
        int phoneBattery = girdi.nextInt();
        System.out.println("RAM:");
        int phoneRAM = girdi.nextInt();
        System.out.println("Renk:");
        String phoneColor = girdi.next();

        // Phone oluşturma
        Phone yeniPhone = new Phone(phoneID, price, discountRate, stockAmount, phoneName, selectedBrand, phoneMemory, phoneScreen, phoneBattery,phoneRAM,phoneColor);

        // PhoneList'e ekleme
        phoneList.addPhone(yeniPhone);
    }
    public void printPhones() {
        ArrayList<Phone> phones = phoneList.getPhones();
        System.out.println("Eklenen Telefonlar:");
        for (Phone phone : phones) {
            System.out.println("- " + phone.getPhoneName());
            System.out.println("Fiyat: " + phone.getPrice());
            // Diğer telefon özelliklerini burada yazdırabilirsiniz
        }
    }


}
