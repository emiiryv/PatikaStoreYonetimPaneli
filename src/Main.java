import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BrandsList liste = new BrandsList();
        BrandsList brandsList = new BrandsList();
        liste.addBrand(1, "Apple");
        liste.addBrand(2, "Asus");
        liste.addBrand(3, "Casper");
        liste.addBrand(4, "HP");
        liste.addBrand(5, "Huawei");
        liste.addBrand(6, "Lenovo");
        liste.addBrand(7, "Monster");
        liste.addBrand(8, "Samsung");
        liste.addBrand(9, "Xiaomi");

        PhoneList pliste = new PhoneList();
        PhoneList phoneList = new PhoneList();
        pliste.addPhone(1, 1000, 10, 25, "Samsung Galaxy s3", liste.getBrandByID(8), 128, 6, 4000, 8, "Black");

        PhoneManager phoneManager = new PhoneManager(liste,pliste);

        NotebookList notebookList = new NotebookList();
        notebookList.addNotebook(1, 20000, 5, 13, "Macbook Air", liste.getBrandByID(1), 16, 512, 14);

        NotebookManager notebookManager = new NotebookManager(liste, notebookList);

        // notebooks listesine herhangi bir öğe eklemeye gerek yok
        // çünkü NotebookManager sınıfı kendi içinde yönetilen NotebookList'i kullanıyor
        Panel panel = new Panel(liste, pliste, notebookList, notebookManager, new Scanner(System.in),phoneManager);
        panel.start();
    }
}
