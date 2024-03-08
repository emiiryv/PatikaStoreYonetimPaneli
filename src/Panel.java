import java.util.Scanner;

public class Panel {
    private BrandsList liste;
    private PhoneList pliste;
    private NotebookList notebookList;
    private NotebookManager notebookManager;
    private Scanner input;
    private PhoneManager phoneManager;

    public Panel(BrandsList liste, PhoneList pliste, NotebookList notebookList, NotebookManager notebookManager, Scanner input, PhoneManager phoneManager) {
        this.liste = liste;
        this.pliste = pliste;
        this.notebookList = notebookList;
        this.notebookManager = notebookManager;
        this.input = input;
        this.phoneManager = phoneManager;
    }

    public void start() {
        System.out.println("PatikeStore Yönetim Paneli'ne hoşgeldiniz.");
        System.out.println();

        int secim;
        int secim2;
        int secim3;
        int secim4;
        int notebookIDsecim;
        int secim5;
        int phoneIDsecim;
        String arama;
        int silinecek;
        do {
            System.out.println("##############################");
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");

            System.out.println("1-Notebook Işlemleri\n" +
                    "2-Cep Telefonu Işlemleri\n" +
                    "3-Marka Listeleme\n" +
                    "0-Çıkış Yap\n");
            System.out.print("Tercihiniz:");
            secim = input.nextInt();
            System.out.println();

            switch (secim) {
                case 0:
                    System.out.println("Görüşmek üzere iyi günler.");
                    break;
                case 1:
                    System.out.println("##############################");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Notebook Listele");
                    System.out.println("2-Notebook Ekle");
                    System.out.println("3-Notebook Sil");
                    System.out.print("Tercihiniz:");
                    secim2 = input.nextInt();
                    if (secim2 == 1) {
                        System.out.println("1-Tümünü listele");
                        System.out.println("2-ID Numarası ile arat");
                        System.out.println("3-Marka ismi ile arat");
                        secim4 = input.nextInt();
                        if (secim4 == 1) {
                            notebookList.printNotebook();
                            notebookManager.printNotebooks();
                        } else if (secim4 == 2) {
                            System.out.print("Aradığınız Notebook'un ID'sini giriniz:");
                            notebookIDsecim = input.nextInt();
                            notebookManager.findNotebookByID(notebookIDsecim);
                        } else if (secim4 == 3) {
                            System.out.print("Aradığınız Notebook'un markasını giriniz:");
                            input.nextLine(); // Önceki satırın sonunu temizle
                            arama = input.nextLine();
                            notebookManager.findNotebookByBrand(arama);
                        } else {
                            System.out.println("Geçerli bir değer giriniz.");
                        }
                    } else if (secim2 == 2) {
                        System.out.println("Lütfen eklemek istediğiniz ürünün özelliklerini giriniz:");
                        notebookManager.ekleNotebook();
                    } else if (secim2 == 3) {
                        System.out.println("Lütfen silmek istediğiniz Notebook'un ID'sini giriniz:");
                        silinecek = input.nextInt();
                        notebookManager.deleteNotebookByID(silinecek);
                    } else {
                        System.out.println("Geçerli bir değer giriniz.");
                    }
                    break;
                case 2:
                    System.out.println("##############################");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Telefon Listele");
                    System.out.println("2-Telefon Ekle");
                    System.out.println("3-Telefon Sil");
                    System.out.print("Tercihiniz:");
                    secim3 = input.nextInt();
                    if (secim3 == 1) {
                        System.out.println("1-Tümünü listele");
                        System.out.println("2-ID numarası ile arat");
                        System.out.println("3-Marka ismi ile arat");
                        secim5 = input.nextInt();
                        if (secim5 == 1) {
                            pliste.printPhone();
                            phoneManager.printPhones();
                        } else if (secim5 == 2) {
                            System.out.print("Aradığınız telefonun ID'sini giriniz:");
                            phoneIDsecim = input.nextInt();
                            phoneManager.findPhoneByID(phoneIDsecim);
                        } else if (secim5 == 3) {
                            System.out.print("Aradığınız telefonun markasını giriniz:");
                            input.nextLine();
                            arama = input.nextLine();
                            phoneManager.findPhoneByBrand(arama);
                        } else {
                            System.out.println("Geçerli bir değer giriniz.");
                        }
                    } else if (secim3 == 2) {
                        System.out.println("Lütfen eklemek istediğiniz ürünün özelliklerini giriniz:");
                        phoneManager.eklePhone();
                    } else if (secim3 == 3) {
                        System.out.println("Lütfen silmek istediğiniz Telefon'un ID'sini giriniz:");
                        silinecek = input.nextInt();
                        phoneManager.deletePhoneByID(silinecek);
                    } else {
                        System.out.println("Geçerli bir değer giriniz.");
                    }
                    break;
                case 3:
                    System.out.println("##############################");
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
