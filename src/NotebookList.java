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
    public void deleteNotebookByID(int notebookID) {
        // Silinecek notebook'u bulmak için döngü
        for (int i = 0; i < notebooks.size(); i++) {
            Notebook notebook = notebooks.get(i);
            if (notebook.getNotebookID() == notebookID) {
                notebooks.remove(i); // Notebook'u listeden silme
                System.out.println("Notebook ID'si " + notebookID + " olan notebook silindi.");
                return; // Notebook bulundu ve silindi, döngüyü sonlandır
            }
        }
        // Eğer belirtilen ID'ye sahip bir notebook bulunamazsa:
        System.out.println("Notebook ID'si " + notebookID + " olan notebook bulunamadı.");
    }

    public ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }
}
