import java.util.ArrayList;
import java.util.Scanner;

public class NotebookList {
    private ArrayList<Notebook> notebooks;

    public NotebookList() {
        notebooks = new ArrayList<>();    }


    public void addNotebook(int notebookID, int price, int discountRate, int stockAmount, String notebookName, Brands nListe, int RAM, int notebookSSD, int notebookScreen) {
        Notebook notebook = new Notebook(notebookID, price, discountRate, stockAmount, notebookName, nListe, RAM, notebookSSD, notebookScreen);
        notebooks.add(notebook);
    }

    public void printNotebook() {
        for (Notebook notebook : notebooks) {
            System.out.println("-" + notebooks.getFirst().getNotebookName());
        }
    }

    public void ekleAyakkabi(){
        Scanner girdi = new Scanner(System.in);
        System.out.println("ID:");
        int id = girdi.nextInt();
        System.out.println("Fiyatı:");
        int price = girdi.nextInt();
        System.out.println("Indirim oranı:");
        int discountRate = girdi.nextInt();
        System.out.println("Stok durumu");
        int stockAmount = girdi.nextInt();
        System.out.println("Ismi:");
        String notebookName = girdi.nextLine();
        System.out.println("Markası(ID):");


    }

}
