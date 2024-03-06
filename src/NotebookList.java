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


    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }
}
