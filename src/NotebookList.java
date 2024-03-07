import java.util.ArrayList;

public class NotebookList {
    private ArrayList<Notebook> notebooks;

    public NotebookList() {
        notebooks = new ArrayList<>();
    }

    public void addNotebook(int notebookID, int price, int discountRate, int stockAmount, String notebookName, Brands nListe, int RAM, int notebookSSD, int notebookScreen) {
        Notebook notebook = new Notebook(notebookID, price, discountRate, stockAmount, notebookName, nListe, RAM, notebookSSD, notebookScreen);
        addNotebook(notebook); // Diğer addNotebook metodunu çağırarak ekliyoruz.
    }

    public void printNotebook() {
        for (Notebook notebook : notebooks) {
            System.out.println("-" + notebook.getNotebookName());
        }
    }

    public void addNotebook(Notebook notebook) {
        // Eğer eklenen notebook zaten listede yoksa ekle
        if (!notebooks.contains(notebook)) {
            notebooks.add(notebook);
        }
    }

    public ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }
}
