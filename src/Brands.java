import java.util.ArrayList;
import java.util.TreeSet;

import java.util.ArrayList;

public class Brands {
    private int ID;
    private String brandName;

    public Brands(int ID, String brandName) {
        this.ID = ID;
        this.brandName = brandName;
    }



    // Getter ve setter metotları
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
