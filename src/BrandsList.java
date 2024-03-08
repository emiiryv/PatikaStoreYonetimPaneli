import java.util.ArrayList;

public class BrandsList {
    private ArrayList<Brands> brands;

    public BrandsList() {
        brands = new ArrayList<>();
    }
    private String arama;

    // Marka ekleme metodu
    public void addBrand(int ID, String brandName) {
        Brands brand = new Brands(ID, brandName);
        brands.add(brand);
    }
    //Yazdırma

    public void printBrands() {
        for (Brands brand : brands) {
            System.out.println("-" + brand.getBrandName());
        }
    }
    public Brands getBrandByID(int ID) {
        for (Brands brand : brands) {
            if (brand.getID() == ID) {
                return brand;
            }
        }
        return null; // Eğer belirtilen ID'ye sahip marka bulunamazsa null döner
    }
    public Brands getBrandByName(String arama) {
        for (Brands brand : brands){
            if (brand.getBrandName().equals(arama)){
                return brand;
            }
        }
        return null;
    }


}