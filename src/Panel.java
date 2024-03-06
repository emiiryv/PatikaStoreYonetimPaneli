import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    private BrandsList liste;
    private PhoneList pliste;
    private NotebookList notebookList;
    private NotebookManager notebookManager;
    private Scanner input;

    public Panel(BrandsList liste, PhoneList pliste, NotebookList notebookList, NotebookManager notebookManager, Scanner input) {
        this.liste = liste;
        this.pliste = pliste;
        this.notebookList = notebookList;
        this.notebookManager = notebookManager;
        this.input = input;
    }

    public void start(){
        System.out.println("PatikeStore Yönetim Paneli'ne hoşgeldiniz.");
        System.out.println();

        int secim;
        int secim2;
        do {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");

            System.out.println("1-Notebook Işlemleri\n" +
                    "2-Cep Telefonu Işlemleri\n" +
                    "3-Marka Listeleme\n" +
                    "0-Çıkış Yap\n");
            System.out.print("Tercihiniz:");
            secim = input.nextInt();
            System.out.println();

            switch (secim){
                case 0:
                    System.out.println("Görüşmek üzere iyi günler.");
                    break;
                case 1:
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Notebook Listele");
                    System.out.println("2-Notebook Ekle");
                    System.out.print("Tercihiniz:");
                    secim2 = input.nextInt();
                    if (secim2 == 1){
                        notebookList.printNotebook();
                        notebookManager.printNotebooks();
                    } else if (secim2 == 2) {
                        System.out.println("Lütfen eklemek istediğiniz ürünün özelliklerini giriniz:");
                        notebookManager.ekleNotebook();
                    } else {
                        System.out.println("Geçerli bir değer giriniz.");
                    }
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

        } while (secim != 0);
    }
}
