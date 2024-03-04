// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BrandsList liste = new BrandsList();
        liste.addBrand(1,"Apple");
        liste.addBrand(2,"Asus");
        liste.addBrand(3,"Casper");
        liste.addBrand(4,"HP");
        liste.addBrand(5,"Huawei");
        liste.addBrand(6,"Lenovo");
        liste.addBrand(7,"Monster");
        liste.addBrand(8,"Samsung");
        liste.addBrand(9,"Xiaomi");

        PhoneList pliste = new PhoneList();
        pliste.addPhone(1,1000,10,25,"Samsung Galaxy s3",liste.getBrandByID(8),128,6,4000,8,"Black");
    Panel panel= new Panel();
    panel.setBrandsList(liste);
    panel.setPhoneList(pliste);
    panel.start();

    }
}