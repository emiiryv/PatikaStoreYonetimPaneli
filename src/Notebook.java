public class Notebook {
    private int notebookID;
    private int price;
    private int discountRate;
    private int stockAmount;
    private String notebookName;
    private Brands liste;
    private int RAM;
    private int notebookSSD;
    private int notebookScreen;

    public Notebook(int notebookID, int price, int discountRate, int stockAmount, String notebookName, Brands liste, int RAM, int notebookSSD, int notebookScreen) {
        this.notebookID = notebookID;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.notebookName = notebookName;
        this.liste = liste;
        this.RAM = RAM;
        this.notebookSSD = notebookSSD;
        this.notebookScreen = notebookScreen;
    }

    public int getNotebookID() {
        return notebookID;
    }

    public void setNotebookID(int notebookID) {
        this.notebookID = notebookID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getNotebookName() {
        return notebookName;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
    }

    public Brands getliste() {
        return liste;
    }

    public void setliste(Brands liste) {
        this.liste = liste;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getNotebookSSD() {
        return notebookSSD;
    }

    public void setNotebookSSD(int notebookSSD) {
        this.notebookSSD = notebookSSD;
    }

    public int getNotebookScreen() {
        return notebookScreen;
    }

    public void setNotebookScreen(int notebookScreen) {
        this.notebookScreen = notebookScreen;
    }

}
