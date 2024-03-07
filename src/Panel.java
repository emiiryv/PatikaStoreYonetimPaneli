import java.util.ArrayList;
import java.util.Scanner;

public class Panel {
    private BrandsList liste;
    private PhoneList pliste;
    private NotebookList notebookList;
    private NotebookManager notebookManager;
    private Scanner input;
    private PhoneManager phoneManager;

    public Panel(BrandsList liste, PhoneList pliste, NotebookList notebookList, NotebookManager notebookManager, Scanner input,PhoneManager phoneManager) {
        this.liste = liste;
        this.pliste = pliste;
        this.notebookList = notebookList;
        this.notebookManager = notebookManager;
        this.input = input;
        this.phoneManager = phoneManager;
    }

    public void start(){
        System.out.println("PatikeStore Yönetim Paneli'ne hoşgeldiniz.");
        System.out.println();

        int secim;
        int secim2;
        int secim3;
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
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Telefon Listele");
                    System.out.println("2-Telefon Ekle");
                    System.out.print("Tercihiniz:");
                    secim3 = input.nextInt();
                    if (secim3 == 1){
                        pliste.printPhone();
                        phoneManager.printPhones();
                    } else if (secim3 == 2) {
                        System.out.println("Lütfen eklemek istediğiniz ürünün özelliklerini giriniz:");
                        phoneManager.eklePhone();
                    } else {
                        System.out.println("Geçerli bir değer giriniz.");
                    }
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
