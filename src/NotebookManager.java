import java.util.ArrayList;
import java.util.Scanner;

public class NotebookManager {
    private BrandsList liste;
    private NotebookList notebookList; // NotebookList nesnesi

    public NotebookManager(BrandsList liste, NotebookList notebookList) {
        this.liste = liste;
        this.notebookList = notebookList; // Constructor'da NotebookList nesnesinin oluşturulması
    }

    public void ekleNotebook() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("ID:");
        int id = girdi.nextInt();
        System.out.println("Fiyatı:");
        int price = girdi.nextInt();
        System.out.println("Indirim oranı:");
        int discountRate = girdi.nextInt();
        System.out.println("Stok durumu:");
        int stockAmount = girdi.nextInt();
        girdi.nextLine(); // Bir sonraki satıra geçmek için
        System.out.println("Ismi:");
        String notebookName = girdi.nextLine();
        System.out.println("Markası(ID):");

        int secim = girdi.nextInt();
        Brands selectedBrand = liste.getBrandByID(secim);
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }

        System.out.println("RAM:");
        int RAM = girdi.nextInt();
        System.out.println("SSD:");
        int notebookSSD = girdi.nextInt();
        System.out.println("Ekran:");
        int notebookScreen = girdi.nextInt();

        // Notebook oluşturma
        Notebook yeniNotebook = new Notebook(id, price, discountRate, stockAmount, notebookName, selectedBrand, RAM, notebookSSD, notebookScreen);

        // Notebook'u NotebookList'e ekleme işlemi
        notebookList.addNotebook(yeniNotebook);
    }


    public void printNotebooks() {
        ArrayList<Notebook> notebooks = notebookList.getNotebooks();
        System.out.println("Eklenen Notebooklar:");
        for (Notebook notebook : notebooks) {
            System.out.println("-" + notebook.getNotebookName());
            System.out.println("Fiyat: " + notebook.getPrice());
            // Diğer notebook özelliklerini burada yazdırabilirsiniz
        }
    }

}
