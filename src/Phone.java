public class Phone {
    private int phoneID;
    private int price;
    private int discountRate;
    private int stockAmount;
    private String phoneName;
    private Brands liste;
    private int phoneMemory;
    private int phoneScreen;
    private int phoneBattery;
    private int phoneRam;
    private String phoneColor;

    public Phone(int phoneID, int price, int discountRate, int stockAmount, String phoneName, Brands liste, int phoneMemory, int phoneScreen, int phoneBattery, int phoneRam, String phoneColor) {
        this.phoneID = phoneID;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.phoneName = phoneName;
        this.liste = liste;
        this.phoneMemory = phoneMemory;
        this.phoneScreen = phoneScreen;
        this.phoneBattery = phoneBattery;
        this.phoneRam = phoneRam;
        this.phoneColor = phoneColor;
    }



    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
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

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Brands getListe() {
        return liste;
    }

    public void setListe(Brands liste) {
        this.liste = liste;
    }

    public int getPhoneMemory() {
        return phoneMemory;
    }

    public void setPhoneMemory(int phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

    public int getPhoneScreen() {
        return phoneScreen;
    }

    public void setPhoneScreen(int phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    public int getPhoneBattery() {
        return phoneBattery;
    }

    public void setPhoneBattery(int phoneBattery) {
        this.phoneBattery = phoneBattery;
    }

    public int getPhoneRam() {
        return phoneRam;
    }

    public void setPhoneRam(int phoneRam) {
        this.phoneRam = phoneRam;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }
}
