import java.util.Scanner;

public class Panel {
    private BrandsList liste;
    private PhoneList pliste;
    private Scanner input = new Scanner(System.in);

    public void setBrandsList(BrandsList liste) {
        this.liste = liste;
    }
    public void setPhoneList(PhoneList pliste){
        this.pliste=pliste;
    }
    public void start(){
        System.out.println("PatikeStore Yönetim Paneli'ne hoşgeldiniz.");
        System.out.println();



        int secim;
        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");

            System.out.println("1-Notebook Işlemleri\n" +
                    "2-Cep Telefonu Işlemleri\n" +
                    "3-Marka Listeleme\n" +
                    "0-Çıkış Yap\n");
            System.out.print("Tercihiniz:");
            secim= input.nextInt();;
            System.out.println();

        switch (secim){
            case 0:
                System.out.println("Görüşmek üzere iyi günler.");
                break;
            case 1:
                break;
            case 2:
                System.out.println("Deneme");
                pliste.printPhone();
                break;
            case 3:
                System.out.println("Markalarımız");
                System.out.println("------------");
                liste.printBrands();
                System.out.println("------------");
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz.");
        }

        }while (secim != 0);



    }
}
