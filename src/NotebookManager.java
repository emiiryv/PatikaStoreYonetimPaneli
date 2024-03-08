import java.util.ArrayList;
import java.util.Scanner;

public class NotebookManager {
    private BrandsList liste;
    private NotebookList notebookList; // NotebookList nesnesi
    private int findNBid;
    private String arama;

    public NotebookManager(BrandsList liste, NotebookList notebookList) {
        this.liste = liste;
        this.notebookList = notebookList; // Constructor'da NotebookList nesnesinin oluşturulması
    }

    public void ekleNotebook() {
        Scanner girdi = new Scanner(System.in);
        System.out.print("ID:");
        int id = girdi.nextInt();
        System.out.print("Fiyatı:");
        int price = girdi.nextInt();
        System.out.print("Indirim oranı:");
        int discountRate = girdi.nextInt();
        System.out.print("Stok durumu:");
        int stockAmount = girdi.nextInt();
        girdi.nextLine(); // Bir sonraki satıra geçmek için
        System.out.print("Ismi:");
        String notebookName = girdi.nextLine();
        System.out.print("Markası(ID):");

        int secim = girdi.nextInt();
        Brands selectedBrand = liste.getBrandByID(secim);
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si!");
            return;
        }

        System.out.print("RAM:");
        int RAM = girdi.nextInt();
        System.out.print("SSD:");
        int notebookSSD = girdi.nextInt();
        System.out.print("Ekran:");
        int notebookScreen = girdi.nextInt();

        // Notebook oluşturma
        Notebook yeniNotebook = new Notebook(id, price, discountRate, stockAmount, notebookName, selectedBrand, RAM, notebookSSD, notebookScreen);

        // Notebook'u NotebookList'e ekleme işlemi
        notebookList.addNotebook(yeniNotebook);
    }


    public void printNotebooks() {
        ArrayList<Notebook> notebooks = notebookList.getNotebooks();
        System.out.println("Fiyat ve ID ile birlikte:");
        for (Notebook notebook : notebooks) {
            System.out.println("-" + notebook.getNotebookName() + "(ID:" + notebook.getNotebookID() + ")");
            System.out.println("Fiyat: " + notebook.getPrice());
            // Diğer notebook özelliklerini burada yazdırabilirsiniz
        }
    }

    public void findNotebookByID(int findNBid) {
        ArrayList<Notebook> notebooks = notebookList.getNotebooks();
        for (Notebook notebook : notebooks) {
            if (findNBid == notebook.getNotebookID()) {
                System.out.println("ID:" + notebook.getNotebookID() + " " + notebook.getNotebookName());
            }
        }
    }

    public void findNotebookByBrand(String arama) {
        ArrayList<Notebook> notebooks = notebookList.getNotebooks();
        Brands brand = liste.getBrandByName(arama);
        for (Notebook notebook : notebooks) {
            if (notebook.getliste().equals(brand)) {
                System.out.println("ID:" + notebook.getNotebookID() + " " + notebook.getNotebookName());
            }
        }
    }
    public void deleteNotebookByID(int notebookID) {
        notebookList.deleteNotebookByID(notebookID);
    }

}